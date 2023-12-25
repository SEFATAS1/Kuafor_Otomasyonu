package com.sefatas.KuaforRandevuOtomasyonu.Service;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.UserRoleDto;

import java.util.List;

public interface UserRoleService {
    List<UserRoleDto> findAllUserRoles();
}
