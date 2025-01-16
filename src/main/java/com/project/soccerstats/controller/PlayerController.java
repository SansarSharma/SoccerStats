package com.project.soccerstats.controller;

/**
 * PlayerController.java
 * This class acts as the Controller for handling HTTP requests related to players.
 * It manages the interaction between the application, views, and the PlayerService.
 */

import com.project.soccerstats.helper.Hierarchy;
import com.project.soccerstats.model.Player;
import com.project.soccerstats.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class PlayerController {
    // No Instance Variables needed to be declared

    // Instance variable of type PlayerService to interact with the service layer
    @Autowired
    private PlayerService playerService;

    /**
     * Method - Home Page Handler
     * This method serves the home page of the application.
     * No parameters
     * String return type - Returns the name of the home.html template.
     */
    @GetMapping("/")
    public String home() {
        return "home"; // Returns home.html
    }

    /**
     * Method - Players Page Handler
     * This method serves the players page with a list of sorted players.
     * Parameter: `model` is of type Model and is used to pass data to the view layer.
     * String return type - Returns the name of the players.html template.
     */
    @GetMapping("/players")
    public String players(Model model) {
        // Retrieve a map of player names to Player objects from PlayerService
        Map<String, Player> playersMap = playerService.getPlayerMap(); // Ensure PlayerService provides this map

        // Sort players using the Hierarchy helper and convert to a List
        List<Player> sortedPlayers = Hierarchy.sortPlayersByHierarchy(playersMap);

        // Add the sorted players list to the model to pass it to the view
        model.addAttribute("players", sortedPlayers);

        return "players"; // Returns players.html
    }

    /**
     * Method - Fetch All Players API
     * This API endpoint returns all players as a JSON response.
     * No parameters
     * ResponseEntity<List<Player>> return type - Returns a JSON representation of all players.
     */
    @GetMapping("/api/players")
    public ResponseEntity<List<Player>> getAllPlayers() {
        // Fetch all players from PlayerService
        List<Player> players = playerService.getAllPlayers();

        return ResponseEntity.ok(players); // Returns JSON response with HTTP status 200 (OK)
    }

    /**
     * Method - Update Player Data API
     * This API endpoint updates player data from the data source.
     * It supports both GET and POST requests.
     * No parameters
     * ResponseEntity<String> return type - Returns a confirmation message as a JSON response.
     */
    @RequestMapping(value = "/api/players/update", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<String> updatePlayerData() {
        // Trigger data update in PlayerService
        playerService.updatePlayerData();

        return ResponseEntity.ok("Player data updated successfully!"); // Returns a success message
    }
}
