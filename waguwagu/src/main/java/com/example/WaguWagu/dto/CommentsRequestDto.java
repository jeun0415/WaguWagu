package com.example.WaguWagu.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import java.time.LocalDateTime;

@Data
public class CommentsRequestDto {

    private Long commentIdx;

    @Length(min = 1, max = 200)
    private String commentContent;


    @Schema(hidden = true)
    private LocalDateTime commentRegDate;

    @Schema(hidden = true)
    private LocalDateTime commentModDate;

}
