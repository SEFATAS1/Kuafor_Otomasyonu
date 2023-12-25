package com.sefatas.KuaforRandevuOtomasyonu.Repository;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.BarberInfoDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BarberInfoRepository extends JpaRepository<BarberInfoDto, Long> {
    @Override
    Optional<BarberInfoDto> findById(Long aLong);
}
