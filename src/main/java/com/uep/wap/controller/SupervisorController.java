package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.dto.SupervisorDTO;
import com.uep.wap.model.Player;
import com.uep.wap.model.Supervisor;
import com.uep.wap.repository.MatchRepository;
import com.uep.wap.repository.SupervisorRepository;
import com.uep.wap.service.PlayerService;
import com.uep.wap.service.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/supervisor")
public class SupervisorController {

    @Autowired
    private SupervisorService supervisorService;

    @Autowired
    private SupervisorRepository supervisorRepository;

    @PostMapping("/")
    public ResponseEntity<Supervisor> createSupervisor(@RequestBody SupervisorDTO supervisorDTO) {
        Supervisor supervisor = new Supervisor();
        supervisor.setSupervisor_name(supervisorDTO.getSupervisor_name());

        Supervisor savedSupervisor = supervisorRepository.save(supervisor);

        return new ResponseEntity<>(savedSupervisor, HttpStatus.CREATED);
    }
}