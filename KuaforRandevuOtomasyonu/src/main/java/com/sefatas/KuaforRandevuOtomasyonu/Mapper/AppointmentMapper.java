package com.sefatas.KuaforRandevuOtomasyonu.Mapper;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.AppointmentDto;
import com.sefatas.KuaforRandevuOtomasyonu.Entity.Appointment;

public class AppointmentMapper {
    public static AppointmentDto mapToAppointmentDto(Appointment appointment){
        return new AppointmentDto(
                appointment.getId(),
                appointment.getBarberId(),
                appointment.getCustomerId(),
                appointment.getServiceId(),
                appointment.getAppointmentDate(),
                appointment.getStartTime(),
                appointment.getEndTime(),
                appointment.getAppointmentStatus()
        );
    }

    public static Appointment mapToAppointment(AppointmentDto appointmentDto){
        return new Appointment(
                appointmentDto.getId(),
                appointmentDto.getBarberId(),
                appointmentDto.getCustomerId(),
                appointmentDto.getServiceId(),
                appointmentDto.getAppointmentDate(),
                appointmentDto.getStartTime(),
                appointmentDto.getEndTime(),
                appointmentDto.getAppointmentStatus()
        );
    }
}
