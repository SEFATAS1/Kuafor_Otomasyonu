package com.sefatas.KuaforRandevuOtomasyonu.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BarberInfos")
public class BarberInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long UserId;
    private Integer Duration;
}
