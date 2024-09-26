package com.example.WaguWagu.controller;

import com.example.WaguWagu.dto.BoardResponsePageDto;
import com.example.WaguWagu.service.BoardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("board")
@RequiredArgsConstructor
@CrossOrigin
public class BoardController {

    private final BoardServiceImpl boardServiceImpl;

    // list page
    @GetMapping("/list")
    public ResponseEntity<BoardResponsePageDto> findAll(@RequestParam(name = "pageNum", defaultValue = "1") int pageNum,
                                                        @RequestParam(name = "size", defaultValue = "15") int size){


    }


    // input page


    // view page
}
