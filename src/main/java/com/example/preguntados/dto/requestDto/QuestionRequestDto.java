package com.example.preguntados.dto.requestDto;


import com.example.preguntados.utility.Category;
import lombok.Data;

@Data
public class QuestionRequestDto {

    private Category category;
    private String description;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctAnswer;
}
