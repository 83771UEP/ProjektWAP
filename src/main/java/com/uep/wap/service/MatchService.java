package com.uep.wap.service;
import com.uep.wap.dto.MatchDTO;
import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Match;
import com.uep.wap.model.Player;
import com.uep.wap.repository.MatchRepository;
import com.uep.wap.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public Match addMatch(MatchDTO matchDTO) {
        Match match = new Match();
        match.setStart_date(matchDTO.getStart_date());
        match.setStart_time(matchDTO.getStart_time());
        match.setCourt_numer(matchDTO.getCourt_numer());
        match.setTimezone(matchDTO.getTimezone());
        match.setAdditional_info(matchDTO.getAdditional_info());
        match.setPoints(matchDTO.getPoints());
        matchRepository.save(match);
        System.out.println("Match added!");
        return match;
    }

}
