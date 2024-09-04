package com.scm20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scm20.entities.User;
import java.util.*;
import java.util.Optional;


@Repository
public interface UserRepo extends JpaRepository<User, String> {

    // extra methods db relatedoperations
    // custom quesy methods
    // custom finder methods
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);

}
