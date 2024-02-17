package com.comp.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comp.user.dto.UserDTO;
import com.comp.user.entity.User;
import com.comp.user.intfc.UserServiceController;
import com.comp.user.service.UserServices;
@RestController
@RequestMapping("/user")
public class UserServiceControllerImpl implements UserServiceController{


    @Autowired
    UserServices userServices;
    
    public ResponseEntity<List<UserDTO>> getAllUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(userServices.getAllUsers());
    }

    @Override
    public ResponseEntity<UserDTO> getUser(String userId) {
        return ResponseEntity.status(HttpStatus.OK).body(userServices.getUser(userId));
    }

    @Override
    public ResponseEntity<UserDTO> createUser(User user) {
        return ResponseEntity.status(HttpStatus.OK).body(userServices.createUser(user));
    }

    @Override
    public ResponseEntity<UserDTO> updateUser(User user) {
        return ResponseEntity.status(HttpStatus.OK).body(userServices.updateUser(user));
    }

    @Override
    public ResponseEntity<String> deleteUser(String userId) {
        userServices.deleteUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body("User Deleted Successfully");
    }

    
}
