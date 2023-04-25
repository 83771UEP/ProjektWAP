package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.dto.UserDTO;
import com.uep.wap.service.PlayerService;
import com.uep.wap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public String addUser(@RequestBody UserDTO userDTO) {
        userService.addUser(userDTO);
        return "User added!";
    }
}