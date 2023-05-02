package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import com.uep.wap.repository.PlayerRepository;
import com.uep.wap.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private PlayerRepository playerRepository;

    @PostMapping("/")
    public ResponseEntity<Player> createPlayer(@RequestBody PlayerDTO playerDTO) {
        Player player = new Player();
        player.setFirst_name(playerDTO.getFirst_name());
        player.setLast_name(playerDTO.getLast_name());
        player.setAge(playerDTO.getAge());
        player.setNationality(playerDTO.getNationality());
        player.setHeight(playerDTO.getHeight());

        Player savedPlayer = playerRepository.save(player);

        return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);
    }
}