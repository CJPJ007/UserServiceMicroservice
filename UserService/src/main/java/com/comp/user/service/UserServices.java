package com.comp.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comp.user.dto.UserDTO;
import com.comp.user.entity.User;
import com.comp.user.exception.UserIdAlreadyExistException;
import com.comp.user.exception.UserNotFoundException;
import com.comp.user.mapper.MapStructMapper;
import com.comp.user.repo.UserRepository;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public List<UserDTO> getAllUsers(){
        List<UserDTO> users = new ArrayList<>();

        Iterable<User> iterableUsers = userRepository.findAll();
        iterableUsers.forEach(user->{
            UserDTO userDTO = MapStructMapper.MAPPER.mapUserToUserDTO(user);
            users.add(userDTO);
        });

        return users;
    }

    public UserDTO getUser(String userId){
        List<User> users = userRepository.findByUserId(userId);
        if(users==null || users.isEmpty()){
            throw new UserNotFoundException("User with userId "+ userId + " not found !!!");
        }
        return MapStructMapper.MAPPER.mapUserToUserDTO(users.get(0));
    }

    public UserDTO createUser(User user){
        List<User> users = userRepository.findByUserId(user.getUserId());
        if(users!=null && !users.isEmpty() && users.get(0)!=null){
            throw new UserIdAlreadyExistException("User already present with user id : "+user.getUserId());
        }
        userRepository.save(user);
        return MapStructMapper.MAPPER.mapUserToUserDTO(user);
    }

    public UserDTO updateUser(User user){
        List<User> users = userRepository.findByUserId(user.getUserId());
        if(users==null || users.isEmpty()){
            throw new UserNotFoundException("User with userId "+ user.getUserId() + " not found !!!");
        }
        User oldUser = users.get(0);
        oldUser.setFirstName(user.getFirstName());
        oldUser.setLastName(user.getLastName());
        userRepository.save(oldUser);
        return MapStructMapper.MAPPER.mapUserToUserDTO(user);
    }

    public void deleteUser(String userId){
        List<User> users = userRepository.findByUserId(userId);
        if(users==null || users.isEmpty()){
            throw new UserNotFoundException("User with userId "+ userId + " not found !!!");
        }
        userRepository.delete(users.get(0));
    }

    public User getUserById(String userId) {
        return userRepository.findByUserId(userId).get(0);
    }
}
