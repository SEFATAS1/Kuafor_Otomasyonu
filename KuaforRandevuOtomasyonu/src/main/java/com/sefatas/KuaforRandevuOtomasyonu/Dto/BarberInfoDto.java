package com.sefatas.KuaforRandevuOtomasyonu.Dto;

import com.sefatas.KuaforRandevuOtomasyonu.Entity.BarberInfo;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BarberInfoDto {
    private Long Id;
    private Long UserId;
    private Integer Duration;
}
