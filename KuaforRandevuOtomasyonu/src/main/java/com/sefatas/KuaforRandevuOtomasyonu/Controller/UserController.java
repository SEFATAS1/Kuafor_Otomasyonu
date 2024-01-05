package com.sefatas.KuaforRandevuOtomasyonu.Controller;

import com.sefatas.KuaforRandevuOtomasyonu.Dto.UserDto;
import com.sefatas.KuaforRandevuOtomasyonu.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/Users")
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

    @GetMapping
    public ResponseEntity<List<UserDto>> findAllUsers(){
        List<UserDto> userDtoList = userService.findAllUsers();
        return ResponseEntity.ok(userDtoList);
    }

    @PutMapping("{Id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("Id") Long userId, @RequestBody UserDto currentUserDto){
        UserDto userDto = userService.updateUser(userId, currentUserDto);
        return ResponseEntity.ok(userDto);
    }

    @DeleteMapping("Id")
    public ResponseEntity<String> deleteUser(@PathVariable("Id") Long userId){
        userService.deleteUser(userId);
        return ResponseEntity.ok("Kullanıcı başarıyla silindi.");
    }
}
