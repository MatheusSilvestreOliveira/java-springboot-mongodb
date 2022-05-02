package com.matheussilvestre.javacourse.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matheussilvestre.javacourse.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}