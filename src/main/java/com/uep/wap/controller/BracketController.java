package com.uep.wap.controller;

import com.uep.wap.dto.BracketDTO;
import com.uep.wap.dto.MatchDTO;
import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Bracket;
import com.uep.wap.model.Player;
import com.uep.wap.repository.BracketRepository;
import com.uep.wap.repository.PlayerRepository;
import com.uep.wap.service.BracketService;
import com.uep.wap.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;

@RestController
@RequestMapping("/api/bracket")
public class BracketController {

    @Autowired
    private BracketService bracketService;

    @Autowired
    private BracketRepository bracketRepository;

    @PostMapping("/")
    public ResponseEntity<Bracket> createBracket(@RequestBody BracketDTO bracketDTO) {
        Bracket bracket = new Bracket();
        bracket.setTournament_name(bracketDTO.getTournament_name());
        bracket.setTournament_location(bracketDTO.getTournament_location());
        bracket.setStart_date(bracketDTO.getStart_date());

        Bracket savedBracket = bracketRepository.save(bracket);

        return new ResponseEntity<>(savedBracket, HttpStatus.CREATED);
    }
}