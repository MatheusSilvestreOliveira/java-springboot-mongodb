package com.matheussilvestre.javacourse.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matheussilvestre.javacourse.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
