package com.uep.wap.service;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import com.uep.wap.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player addPlayer(PlayerDTO playerDTO) {
        Player player = new Player();
        player.setFirst_name(playerDTO.getFirst_name());
        player.setLast_name(playerDTO.getLast_name());
        player.setAge(playerDTO.getAge());
        player.setNationality(playerDTO.getNationality());
        player.setHeight(playerDTO.getHeight());
        playerRepository.save(player);
        System.out.println("Students added!");
        return player;
    }

}
