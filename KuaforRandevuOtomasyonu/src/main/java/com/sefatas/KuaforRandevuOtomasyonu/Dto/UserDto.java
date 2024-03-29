package com.sefatas.KuaforRandevuOtomasyonu.Dto;

import com.sefatas.KuaforRandevuOtomasyonu.Entity.User;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDto{
    private Long Id;
    private String FirstName;
    private String LastName;
    private String Phone;
    private String Email;
    private String Password;
    private Long UserRoleId;
}
