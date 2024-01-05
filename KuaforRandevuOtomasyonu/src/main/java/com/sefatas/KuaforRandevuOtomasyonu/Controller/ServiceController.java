package com.sefatas.KuaforRandevuOtomasyonu.Controller;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.ServiceDto;
import com.sefatas.KuaforRandevuOtomasyonu.Service.ServiceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/Services")
public class ServiceController {

    private ServiceService serviceService;
    @PostMapping
    public ResponseEntity<ServiceDto> addService(@RequestBody ServiceDto serviceDto){
        ServiceDto registeredService = serviceService.addService(serviceDto);
        return new ResponseEntity<>(registeredService, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ServiceDto>> findAllServices(){
        List<ServiceDto> serviceDtoList = serviceService.findAllServices();
        return ResponseEntity.ok(serviceDtoList);
    }

    @PutMapping("Id")
    public ResponseEntity<ServiceDto> updateService(@PathVariable("Id") Long serviceId, @RequestBody ServiceDto currentServiceDto){
        ServiceDto serviceDto = serviceService.updateService(serviceId, currentServiceDto);
        return ResponseEntity.ok(serviceDto);
    }

    @DeleteMapping("Id")
    public ResponseEntity<String> deleteService(@PathVariable("Id") Long serviceId){
        serviceService.deleteService(serviceId);
        return ResponseEntity.ok("Kullanıcı başarıyla silindi.");
    }
}
