package com.example.preguntados.controller;


import com.example.preguntados.dto.responseDto.QuestionResponseDto;
import com.example.preguntados.service.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/game/")
@CrossOrigin("*")
public class TriviaController {

    private QuestionService questionService;

    public TriviaController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("single")
    public ArrayList<QuestionResponseDto> getQuestionsSingleGame(){
        return questionService.getQuestionsSingleGame();
    }

    @GetMapping("twoPlayers")
    public ArrayList<QuestionResponseDto> getQuestionsTwoPlayers(){
        return questionService.getQuestionsTwoPlayers();
    }



}

