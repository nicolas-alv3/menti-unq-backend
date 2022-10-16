package com.unq.mentiunq.answers;

import com.unq.mentiunq.answers.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AnswerService {

    @Autowired
    AnswerDAO answerDAO;

    public Answer create(Answer answer) {
        return answerDAO.create(answer);
    }

    public HashMap<String, Integer> getAnswerFromSlideId(Long slideId) {
        return answerDAO.getAnswerFromSlideId(slideId);
    }
}
