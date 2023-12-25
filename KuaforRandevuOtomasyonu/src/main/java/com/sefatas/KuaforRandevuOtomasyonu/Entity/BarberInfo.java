package com.sefatas.KuaforRandevuOtomasyonu.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "UserRoles")
public class BarberInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

}
