package com.uep.wap.service;

import com.uep.wap.dto.MatchDTO;
import com.uep.wap.dto.SupervisorDTO;
import com.uep.wap.model.Match;
import com.uep.wap.model.Supervisor;
import com.uep.wap.repository.MatchRepository;
import com.uep.wap.repository.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupervisorService {

    @Autowired
    private SupervisorRepository supervisorRepository;

    public Supervisor addSupervisor(SupervisorDTO supervisorDTO) {
        Supervisor supervisor = new Supervisor();
        supervisor.setSupervisor_number(supervisorDTO.getSupervisor_number());
        supervisor.setSupervisor_name(supervisorDTO.getSupervisor_name());;
        supervisorRepository.save(supervisor);
        System.out.println("Supervisor added!");
        return supervisor;
    }

}