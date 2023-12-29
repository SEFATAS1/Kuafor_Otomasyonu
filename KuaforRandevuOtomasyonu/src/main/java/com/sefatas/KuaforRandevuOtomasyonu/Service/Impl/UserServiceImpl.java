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
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new SourceNotFoundException("Aratılan id ile ilişkili bir kayıt bulunamamıştır. Id: " + userId));
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> findAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map((user -> UserMapper.mapToUserDto(user))).collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(Long userId, UserDto updatedUsers) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new SourceNotFoundException("Girilen id ile ilişkili bir kayıt bulunanmadı. Id: " + userId));

        user.setFirstName(updatedUsers.getFirstName());
        user.setLastName(updatedUsers.getLastName());
        user.setEmail(updatedUsers.getEmail());
        user.setPassword(updatedUsers.getPassword());

        User updateUserInDatabase = userRepository.save(user);

        return UserMapper.mapToUserDto(updateUserInDatabase);
    }

    @Override
    public void deleteUser(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new SourceNotFoundException("Girilen id ile ilişkili bir kayıt bulunanmadı. Id: " + userId));

        userRepository.deleteById(userId);
    }
}
