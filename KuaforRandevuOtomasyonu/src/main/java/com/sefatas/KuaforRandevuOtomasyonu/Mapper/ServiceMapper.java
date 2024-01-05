package com.sefatas.KuaforRandevuOtomasyonu.Mapper;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.ServiceDto;
import com.sefatas.KuaforRandevuOtomasyonu.Entity.Service;

public class ServiceMapper {
    public static ServiceDto mapToServiceDto(Service service){
        return new ServiceDto(
                service.getId(),
                service.getServiceName(),
                service.getDuration(),
                service.getPrice()
        );
    }

    public static Service mapToService(ServiceDto serviceDto){
        return new Service(
                serviceDto.getId(),
                serviceDto.getServiceName(),
                serviceDto.getDuration(),
                serviceDto.getPrice()
        );
    }
}
