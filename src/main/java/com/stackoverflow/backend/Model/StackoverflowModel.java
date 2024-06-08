package com.stackoverflow.backend.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Stackoverflow")
public class StackoverflowModel {

    @Id
    @Field("_id")
    private int id;
    // id is the primary key
    @Field("PostedBy")
    private String postedBy;
    @Field("Question")
    private String question;

    public StackoverflowModel(){};

    public StackoverflowModel(int id, String postedBy , String question){
        this.id=id;
        this.postedBy=postedBy;
        this.question=question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
