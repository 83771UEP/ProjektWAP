package com.uep.wap.controller;

import com.uep.wap.dto.BracketDTO;
import com.uep.wap.dto.MatchDTO;
import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Bracket;
import com.uep.wap.model.Match;
import com.uep.wap.repository.BracketRepository;
import com.uep.wap.repository.MatchRepository;
import com.uep.wap.service.MatchService;
import com.uep.wap.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import java.sql.Time;
import java.util.Date;

@RestController
@RequestMapping("/api/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @Autowired
    private MatchRepository matchRepository;

    @PostMapping("/")
    public ResponseEntity<Match> createMatch(@RequestBody MatchDTO matchDTO) {
        Match match = new Match();
        match.setStart_date(matchDTO.getStart_date());
        match.setStart_time(matchDTO.getStart_time());
        match.setCourt_numer(matchDTO.getCourt_numer());
        match.setTimezone(matchDTO.getTimezone());
        match.setAdditional_info(matchDTO.getAdditional_info());
        match.setPoints(matchDTO.getPoints());

        Match savedMatch = matchRepository.save(match);

        return new ResponseEntity<>(savedMatch, HttpStatus.CREATED);
    }
}