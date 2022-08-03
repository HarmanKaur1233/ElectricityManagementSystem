package com.electricity.service;

import com.electricity.model.User;
import com.electricity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    UserRepo userRepo;
    @Override
    public User createUser(User user) {
        User user1=this.userRepo.save(user);
        return user1;
    }
}
