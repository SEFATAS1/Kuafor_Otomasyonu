package com.sefatas.KuaforRandevuOtomasyonu.Repository;

import com.sefatas.KuaforRandevuOtomasyonu.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
