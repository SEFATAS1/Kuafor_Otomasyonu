package com.sefatas.KuaforRandevuOtomasyonu.Controller;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.UserDto;
import com.sefatas.KuaforRandevuOtomasyonu.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){
        UserDto registeredUser = userService.addUser(userDto);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }

    @GetMapping("{Id}")
    public ResponseEntity<UserDto> findWithId(@PathVariable("Id") Long userId){
        UserDto userDto = userService.findWithId(userId);
        return ResponseEntity.ok(userDto);
    }
}
