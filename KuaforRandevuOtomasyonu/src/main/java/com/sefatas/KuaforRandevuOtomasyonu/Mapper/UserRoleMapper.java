package com.sefatas.KuaforRandevuOtomasyonu.Mapper;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.UserRoleDto;
import com.sefatas.KuaforRandevuOtomasyonu.Entity.UserRole;

public class UserRoleMapper {
    public static UserRoleDto mapToUserRoleDto(UserRole userRole){
        return new UserRoleDto(
                userRole.getId(),
                userRole.getRoleName()
        );
    }

    public static UserRole mapToUserRole(UserRoleDto userRoleDto) {
        return new UserRole(
                userRoleDto.getId(),
                userRoleDto.getRoleName()
        );
    }
}
