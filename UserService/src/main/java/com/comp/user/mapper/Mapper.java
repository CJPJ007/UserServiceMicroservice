package com.comp.user.mapper;

import com.comp.user.dto.UserDTO;
import com.comp.user.entity.User;

public class Mapper {

    public static UserDTO mapUserToUserDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setUserId(user.getUserId());
        return userDTO;
    }

    public static User mapUserDTOToUser(UserDTO userDTO){
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setUserId(userDTO.getUserId());
        return user;
    }
}
