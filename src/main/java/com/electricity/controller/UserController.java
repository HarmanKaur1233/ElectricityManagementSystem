package com.electricity.controller;

import com.electricity.model.User;
import com.electricity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User createUser = this.userService.createUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
