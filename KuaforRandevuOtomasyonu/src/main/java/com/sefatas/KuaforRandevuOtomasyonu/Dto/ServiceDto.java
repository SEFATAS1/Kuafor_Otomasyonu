package com.sefatas.KuaforRandevuOtomasyonu.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDto {
    private Long Id;
    private String ServiceName;
    private Integer Duration;
    private Integer Price;
}
