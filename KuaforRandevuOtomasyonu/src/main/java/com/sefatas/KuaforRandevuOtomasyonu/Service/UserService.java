package com.sefatas.KuaforRandevuOtomasyonu.Service;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto addUser(UserDto userDto);
    UserDto findWithId(Long userId);
    List<UserDto> findAllUsers();
    UserDto updateUser(Long userId, UserDto updatedUsers);
    void deleteUser(Long userId);
}
