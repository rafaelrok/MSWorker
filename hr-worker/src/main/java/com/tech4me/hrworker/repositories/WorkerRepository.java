package com.tech4me.hrworker.repositories;

import com.tech4me.hrworker.model.Worker;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface WorkerRepository extends MongoRepository<Worker, String> {

}
