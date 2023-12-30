package com.sefatas.KuaforRandevuOtomasyonu.Controller;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.BarberInfoDto;
import com.sefatas.KuaforRandevuOtomasyonu.Service.BarberInfoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/barberinfos")
public class BarberInfoController {
    private BarberInfoService barberInfoService;

    @PostMapping
    public ResponseEntity<BarberInfoDto> addBarberInfo(@RequestBody BarberInfoDto barberInfoDto){
        BarberInfoDto registeredInfo = barberInfoService.addBarberInfo(barberInfoDto);
        return new ResponseEntity<>(registeredInfo, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BarberInfoDto>> findAllBarberInfo(){
        List<BarberInfoDto> barberInfoDtoList = barberInfoService.findAllBarberInfo();
        return ResponseEntity.ok(barberInfoDtoList);
    }

    @PutMapping("{Id}")
    public ResponseEntity<BarberInfoDto> updateBarberInfo(@PathVariable("Id") Long barberInfoId, @RequestBody BarberInfoDto currentBarberInfoDto){
        BarberInfoDto barberInfoDto = barberInfoService.updateBarberInfo(barberInfoId, currentBarberInfoDto);
        return ResponseEntity.ok(barberInfoDto);
    }
}
