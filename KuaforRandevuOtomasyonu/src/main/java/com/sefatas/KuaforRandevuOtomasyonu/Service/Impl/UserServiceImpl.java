package com.sefatas.KuaforRandevuOtomasyonu.Service.Impl;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.UserDto;
import com.sefatas.KuaforRandevuOtomasyonu.Entity.User;
import com.sefatas.KuaforRandevuOtomasyonu.Exception.SourceNotFoundException;
import com.sefatas.KuaforRandevuOtomasyonu.Mapper.UserMapper;
import com.sefatas.KuaforRandevuOtomasyonu.Repository.UserRepository;
import com.sefatas.KuaforRandevuOtomasyonu.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User registeredUser = userRepository.save(user);
        return UserMapper.mapToUserDto(registeredUser);
    }

    @Override
    public UserDto findWithId(Long userId) {
        return null;
    }

    @Override
    public List<UserDto> findAllUsers() {
        return null;
    }

    @Override
    public UserDto updateUser(Long userId, UserDto updatedUsers) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }
}
