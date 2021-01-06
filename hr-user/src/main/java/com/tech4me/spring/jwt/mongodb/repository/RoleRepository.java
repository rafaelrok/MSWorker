package com.tech4me.spring.jwt.mongodb.repository;

import java.util.Optional;

import com.tech4me.spring.jwt.mongodb.models.ERole;
import com.tech4me.spring.jwt.mongodb.models.Role;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
