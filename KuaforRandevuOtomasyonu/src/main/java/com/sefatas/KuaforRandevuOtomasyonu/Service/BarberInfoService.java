package com.sefatas.KuaforRandevuOtomasyonu.Service;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.BarberInfoDto;

import java.util.List;

public interface BarberInfoService {
    List<BarberInfoDto> findAllBarberInfo();
}
