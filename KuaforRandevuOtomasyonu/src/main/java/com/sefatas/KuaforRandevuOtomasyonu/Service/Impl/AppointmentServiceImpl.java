package com.sefatas.KuaforRandevuOtomasyonu.Service.Impl;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.AppointmentDto;
import com.sefatas.KuaforRandevuOtomasyonu.Entity.Appointment;
import com.sefatas.KuaforRandevuOtomasyonu.Exception.SourceNotFoundException;
import com.sefatas.KuaforRandevuOtomasyonu.Mapper.AppointmentMapper;
import com.sefatas.KuaforRandevuOtomasyonu.Repository.AppointmentRepository;
import com.sefatas.KuaforRandevuOtomasyonu.Service.AppointmentService;

import java.util.List;
import java.util.stream.Collectors;

public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;

    @Override
    public List<AppointmentDto> findAllAppointment() {
        List<Appointment> appointments = appointmentRepository.findAll();
        return appointments.stream().map((appointment -> AppointmentMapper.mapToAppointmentDto(appointment))).collect(Collectors.toList());
    }

    @Override
    public AppointmentDto CreateAppointment(AppointmentDto appointmentDto) {
        Appointment appointment = AppointmentMapper.mapToAppointment(appointmentDto);
        Appointment createdAppointment = appointmentRepository.save(appointment);
        return AppointmentMapper.mapToAppointmentDto(createdAppointment);
    }

    @Override
    public AppointmentDto UpdateAppointment(Long appointmentId, AppointmentDto updateAppointment) {
        Appointment appointment = appointmentRepository.findById(appointmentId)
                .orElseThrow(() -> new SourceNotFoundException("Girilen id ile ilişkili bir kayıt bulunanmadı. Id: " + appointmentId));

        appointment.setBarberId(updateAppointment.getBarberId());
        appointment.setCustomerId(updateAppointment.getCustomerId());
        appointment.setServiceId(updateAppointment.getServiceId());
        appointment.setAppointmentDate(updateAppointment.getAppointmentDate());
        appointment.setStartTime(updateAppointment.getStartTime());
        appointment.setEndTime(updateAppointment.getEndTime());

        Appointment updateAppointmentInDatabase = appointmentRepository.save(appointment);

        return AppointmentMapper.mapToAppointmentDto(updateAppointmentInDatabase);
    }

    @Override
    public AppointmentDto UpdateAppointmentState(Long appointmentId, AppointmentDto updateAppointment) {
        Appointment appointment = appointmentRepository.findById(appointmentId)
                .orElseThrow(() -> new SourceNotFoundException("Girilen id ile ilişkili bir kayıt bulunanmadı. Id: " + appointmentId));

        appointment.setAppointmentStatus(updateAppointment.getAppointmentStatus());

        Appointment updateAppointmentInDatabase = appointmentRepository.save(appointment);

        return AppointmentMapper.mapToAppointmentDto(updateAppointmentInDatabase);
    }
}
