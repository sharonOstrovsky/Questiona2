package com.example.preguntados.dto.responseDto;

import com.example.preguntados.utility.Category;
import lombok.Data;

@Data
public class QuestionResponseDto {

    private Category category;
    private String description;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctAnswer;
}
