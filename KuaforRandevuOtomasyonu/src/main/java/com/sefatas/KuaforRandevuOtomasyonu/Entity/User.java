package com.sefatas.KuaforRandevuOtomasyonu.Entity;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.UserDto;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private Long UserRoleId;
}
