package com.example.WaguWagu.error;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Arrays;

@ControllerAdvice
public class ErrorController {

//    member
    @ExceptionHandler(BizException.class)
    public ResponseEntity<ErrorResponse> mException(BizException e) {

        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(e.getErrorCode().getMessage())
                .httpStatus(e.getErrorCode().getHttpStatus())
                .localDateTime(LocalDateTime.now())
                .build();


        return ResponseEntity
                .status(e.getErrorCode()
                        .getHttpStatus())
                .body(new ErrorResponse());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> validityException(MethodArgumentNotValidException e) {

        String value = (String) Arrays.stream(e.getDetailMessageArguments())
                .reduce("", (o, o2) -> o.toString() + o2.toString());

        System.out.println(e.getBody());
        System.out.println(Arrays.toString(e.getDetailMessageArguments()));

        e.getFieldErrors()
                .stream()
                .forEach(fieldError -> System.out.println(fieldError.getDefaultMessage()));


        ErrorResponse errorResponse = ErrorResponse.builder()


                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(Arrays.toString(e.getDetailMessageArguments()))
                .localDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorResponse);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorResponse> constraintException(ConstraintViolationException e) {

        String msg = e.getConstraintViolations()
                .stream()
                .map(constraintViolation -> constraintViolation.getMessage())
                .reduce("", (s, s2) -> s + s2); //데이터가 없으면 빈공백으로 합치고 데이터가 있으면 내용 합치기



//        String msg = (String) Arrays.stream(e.getMessage())
//                .reduce("", (o, o2) -> o.toString() + o2.toString());

        ErrorResponse errorResponse = ErrorResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(msg)
                .localDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorResponse);

    }

}
