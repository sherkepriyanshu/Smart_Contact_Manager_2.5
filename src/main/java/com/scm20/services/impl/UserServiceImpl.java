package com.scm20.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.PasswordManagementDsl;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.scm20.entities.User;
import com.scm20.helpers.AppConstants;
import com.scm20.helpers.ResourceNotFoundException;
import com.scm20.repository.UserRepo;
import com.scm20.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public User saveUser(User user) {
        //user id:  have to generate
        String userId = UUID.randomUUID().toString();
        user.setUserId(userId);
        //password encode
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        logger.info(user.getProvider().toString());


        //set the user roles

        user.setRoleList(List.of(AppConstants.ROLE_USER));
        return userRepo.save(user); 
    }

    @Override
    public Optional<User> getUserByID(String id) {

        return userRepo.findById(id);
    }

    @Override
    public Optional<User> updateUser(User user) {
        User user2 = userRepo.findById(user.getUserId())
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        // update karegne user2 form user
        user2.setName(user.getName());
        user2.setEmail(user.getEmail());
        user2.setPassword(user.getPassword());
        user2.setPhonenumber(user.getPhonenumber());
        user2.setAbout(user.getAbout());
        user2.setProfilePic(user.getProfilePic());

        user2.setProvider(user.getProvider());
        user2.setPhoneVerified(user.isPhoneVerified());
        user2.setEmailVerified(user.isEmailVerified());
        user2.setEnabled(user.isEnabled());
        user2.setProviderUserID(user.getProviderUserID());
        // save user in database
        User save = userRepo.save(user2);
        return Optional.ofNullable(save);
    }

    @Override
    public void deleteUser(String id) {
        User user2 = userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
        userRepo.delete(user2);
    }

    @Override
    public boolean isUserExist(String id) {
        User user2 = userRepo.findById(id).orElse(null);
        return user2!= null ? true : false;
    }

    @Override
    public boolean isUserExistByEmailid(String email) {
        User user= userRepo.findByEmail(email).orElse(null);
        return user!= null ? true : false;
   
    }

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUser'");
    }

}
