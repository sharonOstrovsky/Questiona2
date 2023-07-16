package com.example.preguntados.service.service;



import com.example.preguntados.dto.responseDto.QuestionResponseDto;
import com.example.preguntados.entity.Question;
import com.example.preguntados.utility.Category;

import java.util.ArrayList;

public interface QuestionService {


    ArrayList<QuestionResponseDto> getQuestionsSingleGame();
    ArrayList<QuestionResponseDto> getQuestionsTwoPlayers();


}
