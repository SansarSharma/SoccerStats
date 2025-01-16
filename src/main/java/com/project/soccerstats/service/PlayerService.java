package com.project.soccerstats.service;

import com.project.soccerstats.model.Player;
import com.project.soccerstats.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PlayerService.java
 * This service class provides business logic for managing Player data.
 * It acts as a bridge between the controller layer and the repository layer.
 */

@Service
public class PlayerService {
    // Injecting dependencies using Spring's @Autowired annotation

    @Autowired
    private PlayerRepository playerRepository; // Handles CRUD operations for Player data in MongoDB

    @Autowired
    private ScraperService scraperService; // Responsible for scraping player data from external sources

    /**
     * Method - Get All Players
     * Fetches a list of all players from the database.
     * No parameters
     * Return type: List<Player>
     */
    public List<Player> getAllPlayers() {
        return playerRepository.findAll(); // Retrieve all Player documents from the MongoDB collection
    }

    /**
     * Method - Update Player Data
     * Updates the player data in the database by scraping new data and saving it.
     * No parameters
     * Void return type
     */
    public void updatePlayerData() {
        List<Player> scrapedPlayers = scraperService.scrapePlayers(); // Scrape player data using ScraperService
        playerRepository.saveAll(scrapedPlayers); // Save the scraped player data to the database
    }

    /**
     * Method - Get Player Map
     * Converts the list of all players into a map where the key is the player's name and the value is the Player object.
     * No parameters
     * Return type: Map<String, Player>
     */
    public Map<String, Player> getPlayerMap() {
        List<Player> players = getAllPlayers(); // Fetch all players from the database
        Map<String, Player> playerMap = new HashMap<>(); // Initialize an empty map for storing player data
        // Iterate through the list of players
        for (Player player : players) {
            playerMap.put(player.getName(), player); // Use the player's name as the key and the Player object as the value
        }
        return playerMap; // Return the populated map
    }
}
