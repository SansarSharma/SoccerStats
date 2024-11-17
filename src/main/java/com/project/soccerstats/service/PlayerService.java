package com.project.soccerstats.service;

import com.project.soccerstats.model.Player;
import com.project.soccerstats.repository.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    // Use saveAll to save a list of players
    public void savePlayers(List<Player> players) {
        playerRepository.saveAll(players);
    }
}
