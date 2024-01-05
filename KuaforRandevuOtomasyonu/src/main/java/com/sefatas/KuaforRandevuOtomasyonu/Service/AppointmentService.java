package com.sefatas.KuaforRandevuOtomasyonu.Service;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.AppointmentDto;

import java.util.List;

public interface AppointmentService {

    List<AppointmentDto> findAllAppointment();
    AppointmentDto CreateAppointment(AppointmentDto appointmentDto);
    AppointmentDto UpdateAppointment(Long appointmentId, AppointmentDto updateAppointment);
    AppointmentDto UpdateAppointmentState(Long appointmentId, AppointmentDto updateAppointment);
}
