package com.uep.wap.dto;

import java.util.List;

public class MatchesDTO {

    List<MatchDTO> matches;

    //methods

    public List<MatchDTO> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchDTO> matches) {
        this.matches = matches;
    }
}
