package com.example.preguntados.repository;


import com.example.preguntados.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query(value = "SELECT * FROM pregunta ORDER BY RAND() LIMIT 10", nativeQuery = true)
    ArrayList<Question> getQuestionsSinglePlayer();

    @Query(value = "SELECT * FROM pregunta ORDER BY RAND() LIMIT 20", nativeQuery = true)
    ArrayList<Question> getQuestionsTwoPlayers();


}
