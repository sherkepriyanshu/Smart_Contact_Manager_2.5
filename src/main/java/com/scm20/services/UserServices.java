package com.scm20.services;

import java.util.*;

import com.scm20.entities.User;

public interface UserServices {

    User saveUser(User user);

    Optional<User> getUserByID(String id);

    Optional<User> updateUser(User user);

    void deleteUser(String id);

    boolean isUserExist(String id);

    boolean isUserExistByEmailid(String email);

    List<User> getAllUser();

    // add more methods related to service{logic}
}
