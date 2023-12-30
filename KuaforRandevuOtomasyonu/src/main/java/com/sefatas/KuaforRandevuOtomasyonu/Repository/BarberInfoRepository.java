package com.sefatas.KuaforRandevuOtomasyonu.Repository;

import com.sefatas.KuaforRandevuOtomasyonu.Entity.BarberInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BarberInfoRepository extends JpaRepository<BarberInfo, Long> {
}
