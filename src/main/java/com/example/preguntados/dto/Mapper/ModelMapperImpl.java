package com.example.preguntados.dto.Mapper;


import com.example.preguntados.dto.requestDto.QuestionRequestDto;
import com.example.preguntados.dto.responseDto.QuestionResponseDto;
import com.example.preguntados.entity.Question;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperImpl implements ModelMapperInterface{

    private ModelMapper modelMapper = new ModelMapper();



    @Override
    public Question questionReqDtoQuestion(QuestionRequestDto questionRequestDto) {
        return modelMapper.map(questionRequestDto, Question.class);
    }

    @Override
    public QuestionResponseDto questionToQuestionResDto(Question question) {
        return modelMapper.map(question, QuestionResponseDto.class);
    }
}
