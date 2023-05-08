package com.uep.wap.service;

import com.uep.wap.dto.BracketDTO;
import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Bracket;
import com.uep.wap.model.Player;
import com.uep.wap.repository.BracketRepository;
import com.uep.wap.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BracketService {

    @Autowired
    private BracketRepository bracketRepository;

    public Bracket addBracket(BracketDTO bracketDTO) {
        Bracket bracket = new Bracket();
        bracket.setTournament_name(bracketDTO.getTournament_name());
        bracket.setTournament_location(bracketDTO.getTournament_location());
        bracket.setStart_date(bracketDTO.getStart_date());
        bracketRepository.save(bracket);
        System.out.println("Braclet added!");
        return bracket;
    }

}