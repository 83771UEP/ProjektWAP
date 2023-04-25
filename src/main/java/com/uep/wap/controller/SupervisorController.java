package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.dto.SupervisorDTO;
import com.uep.wap.service.PlayerService;
import com.uep.wap.service.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/supervisor")
public class SupervisorController {

    @Autowired
    private SupervisorService supervisorService;


    @PostMapping
    public String addSupervisor(@RequestBody SupervisorDTO supervisorDTO) {
        supervisorService.addSupervisor(supervisorDTO);
        return "Supervisor added!";
    }
}