package com.example.preguntados.dto.Mapper;


import com.example.preguntados.dto.requestDto.QuestionRequestDto;
import com.example.preguntados.dto.responseDto.QuestionResponseDto;
import com.example.preguntados.entity.Question;

public interface ModelMapperInterface {



    Question questionReqDtoQuestion(QuestionRequestDto questionRequestDto);

    QuestionResponseDto questionToQuestionResDto(Question question);
}
