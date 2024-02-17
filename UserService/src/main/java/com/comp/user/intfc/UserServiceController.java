package com.comp.user.intfc;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.comp.user.dto.UserDTO;
import com.comp.user.entity.User;

public interface UserServiceController {
    @GetMapping("/")
    public ResponseEntity<List<UserDTO>> getAllUsers();

    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> getUser(@PathVariable("userId") String userId);

    @PostMapping("/")
    public ResponseEntity<UserDTO> createUser(@RequestBody User user);

    @PutMapping("/")
    public ResponseEntity<UserDTO> updateUser(@RequestBody User user);

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable("userId") String userId);
    
}
