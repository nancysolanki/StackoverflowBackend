package com.stackoverflow.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackoverflow.backend.Model.StackoverflowModel;
import com.stackoverflow.backend.Repository.StackoverflowRepository;

@Service
public class StackoverflowService {

    @Autowired
    StackoverflowRepository stackoverflowRepository;

    // to Create and post Question
    public StackoverflowModel create( StackoverflowModel stm){
        return stackoverflowRepository.save(stm);
    }

    //read question
    public List<StackoverflowModel> findQuestion()
    {
        return stackoverflowRepository.findAll();
    }
    //Delete Question
    public void deleteQuestion(int id){
        stackoverflowRepository.deleteById(id);
    }

    //update Question
    public StackoverflowModel updateQuestion(int id, StackoverflowModel stm){
        StackoverflowModel model= stackoverflowRepository.findById(id).get();
    }
}
