package com.skanci.beginner.repositories;

import org.springframework.data.repository.CrudRepository;

import com.skanci.beginner.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {}
