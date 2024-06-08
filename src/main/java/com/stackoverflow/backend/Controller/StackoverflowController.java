package com.stackoverflow.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackoverflow.backend.Model.StackoverflowModel;
import com.stackoverflow.backend.Service.StackoverflowService;

@RestController
@RequestMapping("/api")
public class StackoverflowController {

    @Autowired
    StackoverflowService sts;

    @GetMapping("/home")
    public List<StackoverflowModel> getDetails(){
        return sts.findQuestion();
    }

    @PostMapping("/ques")
    public StackoverflowModel postQuestion(@RequestBody StackoverflowModel stm){
        return sts.create(stm);
    } 

    @GetMapping("/ques/{postedBy}")
    public List<String> getQuestionsByPostedBy(@PathVariable(value = "postedBy") String postedBy) {
        return sts.getQuestionsByPostedBy(postedBy);
    }

    @DeleteMapping("/ques/{id}")
    public void deleteQues(@PathVariable( value ="id" ) int id){
        sts.deleteQuestion(id);
    }

}
