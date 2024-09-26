package com.example.WaguWagu.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Data
public class BoardRequestDto {

    private Long boardIdx;


    @Schema(example = "제목을 넣어주세요")
    @Length(min = 2, max = 100)
    private String boardTitle;


    @Schema(hidden = true)
    private int boardCount;

    @Schema(hidden = true)
    private LocalDateTime boardRegDate;

    @Schema(hidden = true)
    private LocalDateTime boardModDate;

}
