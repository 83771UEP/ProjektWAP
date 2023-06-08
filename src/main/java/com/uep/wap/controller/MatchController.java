package com.uep.wap.controller;

import com.uep.wap.model.Match;
import com.uep.wap.model.Player;
import com.uep.wap.repository.MatchRepository;
import com.uep.wap.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @Autowired
    private MatchRepository matchRepository;

  /*  @PostMapping("/")
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
    }*/

    @GetMapping("/{match_id}")
    public Match getMatch(@PathVariable Integer match_id) {
        return matchService.getMatch(match_id);
    }

    @GetMapping("/matches")
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }
}