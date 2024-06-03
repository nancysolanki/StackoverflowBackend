package com.stackoverflow.backend.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackoverflow.backend.Model.StackoverflowModel;

public interface StackoverflowRepository extends MongoRepository<StackoverflowModel, Integer> {

}
