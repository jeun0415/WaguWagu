package com.example.WaguWagu.dto;

import com.example.WaguWagu.domain.Recipe;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
public class BoardRequestDto {

    private Long b_idx;

    @Schema(hidden = true)
    private int b_count;

    @Schema(example = "제목을 넣어주세요")
    @Length(min = 2, max = 100)
    private String b_title;

    @Schema(hidden = true)
    private LocalDateTime b_reg_date;

    @Schema(hidden = true)
    private LocalDateTime b_mod_date;


    private Recipe recipe;
}
