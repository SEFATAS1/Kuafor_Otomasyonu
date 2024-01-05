package com.sefatas.KuaforRandevuOtomasyonu.Service;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.ServiceDto;

import java.util.List;

public interface ServiceService {
    ServiceDto addService(ServiceDto serviceDto);
    List<ServiceDto> findAllServices();
    ServiceDto updateService(Long serviceId, ServiceDto updatedServices);
    void deleteService(Long serviceId);
}
