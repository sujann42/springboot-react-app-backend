package com.reactspringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reactspringboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
