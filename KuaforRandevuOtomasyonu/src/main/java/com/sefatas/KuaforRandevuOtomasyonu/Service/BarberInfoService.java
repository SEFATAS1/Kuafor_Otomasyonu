package com.sefatas.KuaforRandevuOtomasyonu.Service;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.BarberInfoDto;
import com.sefatas.KuaforRandevuOtomasyonu.Dto.UserDto;

import java.util.List;

public interface BarberInfoService {
    BarberInfoDto addBarberInfo(BarberInfoDto barberInfoDto);
    List<BarberInfoDto> findAllBarberInfo();
    BarberInfoDto updateBarberInfo(Long barberInfoId, BarberInfoDto updatedBarberInfo);
}
