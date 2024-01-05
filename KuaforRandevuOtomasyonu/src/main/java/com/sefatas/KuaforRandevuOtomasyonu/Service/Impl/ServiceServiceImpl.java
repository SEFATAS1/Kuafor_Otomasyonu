package com.sefatas.KuaforRandevuOtomasyonu.Service.Impl;

import com.sefatas.KuaforRandevuOtomasyonu.Entity.Service;
import com.sefatas.KuaforRandevuOtomasyonu.Dto.ServiceDto;
import com.sefatas.KuaforRandevuOtomasyonu.Exception.SourceNotFoundException;
import com.sefatas.KuaforRandevuOtomasyonu.Mapper.ServiceMapper;
import com.sefatas.KuaforRandevuOtomasyonu.Repository.ServiceRepository;
import com.sefatas.KuaforRandevuOtomasyonu.Service.ServiceService;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    private ServiceRepository serviceRepository;

    @Override
    public ServiceDto addService(ServiceDto serviceDto) {
        Service service = ServiceMapper.mapToService(serviceDto);
        Service registeredService = serviceRepository.save(service);
        return ServiceMapper.mapToServiceDto(registeredService);
    }

    @Override
    public List<ServiceDto> findAllServices() {
        List<Service> services = serviceRepository.findAll();
        return services.stream().map((service -> ServiceMapper.mapToServiceDto(service))).collect(Collectors.toList());
    }

    @Override
    public ServiceDto updateService(Long serviceId, ServiceDto updatedServices) {
        Service service = serviceRepository.findById(serviceId)
                .orElseThrow(() -> new SourceNotFoundException("Girilen id ile ilişkili bir kayıt bulunanmadı. Id: " + serviceId));

        service.setServiceName(updatedServices.getServiceName());
        service.setDuration(updatedServices.getDuration());
        service.setPrice(updatedServices.getPrice());

        Service updateserviceInDatabase = serviceRepository.save(service);

        return ServiceMapper.mapToServiceDto(updateserviceInDatabase);
    }

    @Override
    public void deleteService(Long serviceId) {
        Service service = serviceRepository.findById(serviceId)
                .orElseThrow(() -> new SourceNotFoundException("Girilen id ile ilişkili bir kayıt bulunanmadı. Id: " + serviceId));

        serviceRepository.deleteById(serviceId);
    }
}
