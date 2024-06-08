package com.stackoverflow.backend.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackoverflow.backend.Model.StackoverflowModel;
import com.stackoverflow.backend.Repository.StackoverflowRepository;

@Service
public class StackoverflowService {

    @Autowired
    StackoverflowRepository stackoverflowRepository;

    // to Create and post Question
    public StackoverflowModel create(StackoverflowModel stm) {
        return stackoverflowRepository.save(stm);
    }

    // read question
    public List<StackoverflowModel> findQuestion() {
        return stackoverflowRepository.findAll();
    }

    // Delete Question
    public void deleteQuestion(int id) {
        stackoverflowRepository.deleteById(id);
    }

    // get all questions PostedBy
    public List<String> getQuestionsByPostedBy(String postedBy) {
        List<StackoverflowModel> models = stackoverflowRepository.findByPostedBy(postedBy);
        return models.stream().map(StackoverflowModel::getQuestion).collect(Collectors.toList());
    }
}
