package com.uep.wap.controller;

import com.uep.wap.dto.MatchDTO;
import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.service.MatchService;
import com.uep.wap.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/match")
public class MatchController {

    @Autowired
    private MatchService matchService;


    @PostMapping
    public String addMatch(@RequestBody MatchDTO matchDTO) {
        matchService.addMatch(matchDTO);
        return "Match added!";
    }
}