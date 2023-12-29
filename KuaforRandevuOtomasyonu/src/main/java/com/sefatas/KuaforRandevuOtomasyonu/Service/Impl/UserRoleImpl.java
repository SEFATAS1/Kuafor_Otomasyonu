package com.sefatas.KuaforRandevuOtomasyonu.Service.Impl;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.UserRoleDto;
import com.sefatas.KuaforRandevuOtomasyonu.Entity.User;
import com.sefatas.KuaforRandevuOtomasyonu.Entity.UserRole;
import com.sefatas.KuaforRandevuOtomasyonu.Mapper.UserMapper;
import com.sefatas.KuaforRandevuOtomasyonu.Mapper.UserRoleMapper;
import com.sefatas.KuaforRandevuOtomasyonu.Repository.UserRoleRepository;
import com.sefatas.KuaforRandevuOtomasyonu.Service.UserRoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserRoleImpl implements UserRoleService {
    private UserRoleRepository userRoleRepository;

    @Override
    public List<UserRoleDto> findAllUserRoles() {
        List<UserRole> userRoles = userRoleRepository.findAll();
        return userRoles.stream().map((userRole -> UserRoleMapper.mapToUserRoleDto(userRole))).collect(Collectors.toList());
    }
}
