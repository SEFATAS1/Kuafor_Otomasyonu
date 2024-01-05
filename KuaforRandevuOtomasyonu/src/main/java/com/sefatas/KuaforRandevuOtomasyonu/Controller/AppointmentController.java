package com.sefatas.KuaforRandevuOtomasyonu.Controller;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.AppointmentDto;
import com.sefatas.KuaforRandevuOtomasyonu.Service.AppointmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/Appointments")
public class AppointmentController {

    private AppointmentService appointmentService;

    @PostMapping
    public ResponseEntity<AppointmentDto> createAppointment(@RequestBody AppointmentDto appointmentDto){
        AppointmentDto createdAppointment = appointmentService.createAppointment(appointmentDto);
        return new ResponseEntity<>(createdAppointment, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AppointmentDto>> findAllAppointments(){
        List<AppointmentDto> appointmentDtoList = appointmentService.findAllAppointments();
        return ResponseEntity.ok(appointmentDtoList);
    }

    @PutMapping("{Id}")
    public ResponseEntity<AppointmentDto> updateAppointment(@PathVariable("Id") Long appointmentId, @RequestBody AppointmentDto currentAppointmentDto){
        AppointmentDto appointmentDto = appointmentService.updateAppointment(appointmentId, currentAppointmentDto);
        return ResponseEntity.ok(appointmentDto);
    }

    @PutMapping("{Id}")
    public ResponseEntity<AppointmentDto> updateAppointmentState(@PathVariable("Id") Long appointmentId, @RequestBody AppointmentDto currentAppointmentDto){
        AppointmentDto appointmentDto = appointmentService.updateAppointmentState(appointmentId, currentAppointmentDto);
        return ResponseEntity.ok(appointmentDto);
    }
}
