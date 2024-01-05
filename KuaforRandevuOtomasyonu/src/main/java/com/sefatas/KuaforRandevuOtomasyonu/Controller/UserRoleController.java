package com.sefatas.KuaforRandevuOtomasyonu.Controller;

import com.sefatas.KuaforRandevuOtomasyonu.Service.UserRoleService;
import com.sefatas.KuaforRandevuOtomasyonu.Dto.UserRoleDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/UserRoles")
public class UserRoleController {

    private UserRoleService userRoleService;

    @GetMapping
    public ResponseEntity<List<UserRoleDto>> findAllUserRoles(){
        List<UserRoleDto> userRoleDtoList = userRoleService.findAllUserRoles();
        return ResponseEntity.ok(userRoleDtoList);
    }
}
