package com.sefatas.KuaforRandevuOtomasyonu.Dto;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class UserRoleDto {
    private Long Id;
    private String RoleName;
}
