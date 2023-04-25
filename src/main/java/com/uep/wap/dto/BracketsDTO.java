package com.uep.wap.dto;

import java.util.List;

public class BracketsDTO {
    List<BracketDTO> brackets;

    //methods

    public List<BracketDTO> getBrackets() {
        return brackets;
    }

    public void setBrackets(List<BracketDTO> brackets) {
        this.brackets = brackets;
    }
}
