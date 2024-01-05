package com.sefatas.KuaforRandevuOtomasyonu.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDto{
    private Long Id;
    private Long BarberId;
    private Long CustomerId;
    private Long ServiceId;
    private Date AppointmentDate;
    private Date StartTime;
    private Date EndTime;
    private String AppointmentStatus;
}
