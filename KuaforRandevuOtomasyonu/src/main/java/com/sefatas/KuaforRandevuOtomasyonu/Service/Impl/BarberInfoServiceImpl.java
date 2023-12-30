package com.sefatas.KuaforRandevuOtomasyonu.Service.Impl;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.BarberInfoDto;
import com.sefatas.KuaforRandevuOtomasyonu.Entity.BarberInfo;
import com.sefatas.KuaforRandevuOtomasyonu.Exception.SourceNotFoundException;
import com.sefatas.KuaforRandevuOtomasyonu.Mapper.BarberInfoMapper;
import com.sefatas.KuaforRandevuOtomasyonu.Repository.BarberInfoRepository;
import com.sefatas.KuaforRandevuOtomasyonu.Service.BarberInfoService;

import java.util.List;
import java.util.stream.Collectors;

public class BarberInfoServiceImpl implements BarberInfoService {
    private BarberInfoRepository barberInfoRepository;

    @Override
    public BarberInfoDto addBarberInfo(BarberInfoDto barberInfoDto) {
        BarberInfo barberInfo = BarberInfoMapper.mapToBarberInfo(barberInfoDto);
        BarberInfo registeredInfo = barberInfoRepository.save(barberInfo);
        return BarberInfoMapper.mapToBarberInfoDto(registeredInfo);
    }

    @Override
    public List<BarberInfoDto> findAllBarberInfo() {
        List<BarberInfo> barberInfos = barberInfoRepository.findAll();
        return barberInfos.stream().map((barberInfo -> BarberInfoMapper.mapToBarberInfoDto(barberInfo))).collect(Collectors.toList());
    }

    @Override
    public BarberInfoDto updateBarberInfo(Long barberInfoId, BarberInfoDto updatedBarberInfo) {
        BarberInfo barberInfo = barberInfoRepository.findById(barberInfoId)
                .orElseThrow(() -> new SourceNotFoundException("Girilen id ile ilişkili bir kayıt bulunanmadı. Id: " + barberInfoId));

        barberInfo.setNote(updatedBarberInfo.getNote());

        BarberInfo updateBarberInfoInDatabase = barberInfoRepository.save(barberInfo);

        return BarberInfoMapper.mapToBarberInfoDto(updateBarberInfoInDatabase);
    }
}
