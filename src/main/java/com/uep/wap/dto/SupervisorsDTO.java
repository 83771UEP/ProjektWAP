package com.uep.wap.dto;

import java.util.List;

public class SupervisorsDTO {

    List<SupervisorDTO> supervisors;

    //methods

    public List<SupervisorDTO> getSupervisors() {
        return supervisors;
    }

    public void setSupervisors(List<SupervisorDTO> supervisors) {
        this.supervisors = supervisors;
    }
}
