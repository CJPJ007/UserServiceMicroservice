package com.comp.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.comp.user.dto.UserDTO;
import com.comp.user.entity.User;

@Mapper
public interface MapStructMapper {

    public MapStructMapper MAPPER = Mappers.getMapper(MapStructMapper.class);

    public UserDTO mapUserToUserDTO(User user);

    public User mapUserDTOToUser(UserDTO userDTO);

}
