package com.stackoverflow.backend.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackoverflow.backend.Model.StackoverflowModel;

@Repository
public interface StackoverflowRepository extends MongoRepository<StackoverflowModel, Integer> {
    List<StackoverflowModel> findByPostedBy(String postedBy);
}
