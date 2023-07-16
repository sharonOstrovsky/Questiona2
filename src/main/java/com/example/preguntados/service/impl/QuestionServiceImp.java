package com.example.preguntados.service.impl;



import com.example.preguntados.dto.Mapper.ModelMapperInterface;
import com.example.preguntados.dto.responseDto.QuestionResponseDto;
import com.example.preguntados.entity.Question;
import com.example.preguntados.repository.QuestionRepository;
import com.example.preguntados.service.service.QuestionService;
import com.example.preguntados.utility.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;


@Service
public class QuestionServiceImp implements QuestionService {


    private QuestionRepository questionRepository;
    private ModelMapperInterface modelMapperInterface;

    public QuestionServiceImp(QuestionRepository questionRepository, ModelMapperInterface modelMapperInterface) {
        this.questionRepository = questionRepository;
        this.modelMapperInterface = modelMapperInterface;
    }


    @Override
    public ArrayList<QuestionResponseDto> getQuestionsSingleGame() {
        ArrayList<QuestionResponseDto> questionResponseDto = new ArrayList<>();

        ArrayList<Question> questions= questionRepository.getQuestionsSinglePlayer();

        for (Question question : questions ) {
            questionResponseDto.add(modelMapperInterface.questionToQuestionResDto(question));
        }

        return questionResponseDto;
    }

    @Override
    public ArrayList<QuestionResponseDto> getQuestionsTwoPlayers() {
        ArrayList<QuestionResponseDto> questionResponseDto = new ArrayList<>();

        ArrayList<Question> questions= questionRepository.getQuestionsTwoPlayers();

        for (Question question : questions ) {
            questionResponseDto.add(modelMapperInterface.questionToQuestionResDto(question));
        }

        return questionResponseDto;
    }



}
