package com.uep.wap.controller;

import com.uep.wap.dto.BracketDTO;
import com.uep.wap.dto.MatchDTO;
import com.uep.wap.service.BracketService;
import com.uep.wap.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bracket")
public class BracketController {

    @Autowired
    private BracketService bracketService;


    @PostMapping
    public String addBracket(@RequestBody BracketDTO bracketDTO) {
        bracketService.addBracket(bracketDTO);
        return "Bracket added!";
    }
}