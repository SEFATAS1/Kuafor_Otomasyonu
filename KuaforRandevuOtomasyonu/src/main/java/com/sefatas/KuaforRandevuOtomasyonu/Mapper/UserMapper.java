package com.sefatas.KuaforRandevuOtomasyonu.Mapper;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.UserDto;
import com.sefatas.KuaforRandevuOtomasyonu.Entity.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                user.getUserRoleId()
        );
    }

    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getPassword(),
                userDto.getUserRoleId()
        );
    }
}