package com.project.soccerstats.controller;

import com.project.soccerstats.model.Player;
import com.project.soccerstats.service.PlayerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/players")
    public String players(Model model) {
        List<Player> players = playerService.getAllPlayers();
        model.addAttribute("players", players);
        return "players";
    }

    // Initialize the database with sample players
    @GetMapping("/init-players")
    public String initPlayers() {
        List<Player> players = Arrays.asList(
                new Player("Lionel Messi", 672, 268, 36),
                new Player("Cristiano Ronaldo", 674, 229, 34),
                new Player("Neymar Jr.", 286, 178, 18),
                new Player("Kylian Mbappé", 178, 110, 14),
                new Player("Robert Lewandowski", 484, 92, 24),
                new Player("Kevin De Bruyne", 96, 188, 14),
                new Player("Luka Modrić", 80, 120, 22),
                new Player("Sergio Ramos", 104, 48, 23),
                new Player("Mohamed Salah", 186, 72, 12),
                new Player("Sadio Mané", 154, 68, 10),
                new Player("Virgil van Dijk", 38, 19, 9),
                new Player("Harry Kane", 215, 50, 2),
                new Player("Romelu Lukaku", 221, 64, 8),
                new Player("Bruno Fernandes", 103, 92, 4),
                new Player("Raheem Sterling", 139, 85, 9),
                new Player("Karim Benzema", 359, 105, 28),
                new Player("Eden Hazard", 166, 153, 16),
                new Player("Paulo Dybala", 127, 70, 13),
                new Player("Zlatan Ibrahimović", 566, 144, 33),
                new Player("Antoine Griezmann", 225, 88, 12),
                new Player("Thomas Müller", 223, 228, 29),
                new Player("Joshua Kimmich", 35, 98, 18),
                new Player("Manuel Neuer", 0, 4, 26),
                new Player("Sergio Agüero", 379, 118, 21),
                new Player("Luis Suárez", 440, 244, 19),
                new Player("Gerard Piqué", 52, 17, 30),
                new Player("Marcelo Vieira", 38, 99, 25),
                new Player("Philippe Coutinho", 103, 78, 10),
                new Player("Thiago Alcântara", 36, 57, 18),
                new Player("David Alaba", 37, 55, 28),
                new Player("N'Golo Kanté", 18, 24, 10),
                new Player("Paul Pogba", 67, 79, 10),
                new Player("Toni Kroos", 90, 125, 26),
                new Player("Casemiro", 38, 32, 18),
                new Player("Isco", 74, 67, 18),
                new Player("Leroy Sané", 76, 64, 12),
                new Player("Son Heung-min", 145, 73, 3),
                new Player("João Félix", 55, 30, 5),
                new Player("Mauro Icardi", 159, 38, 7),
                new Player("Alexis Sánchez", 195, 115, 15),
                new Player("Cesc Fàbregas", 125, 216, 20),
                new Player("Ángel Di María", 155, 205, 29),
                new Player("Gareth Bale", 180, 92, 18),
                new Player("Mesut Özil", 89, 219, 13),
                new Player("James Rodríguez", 116, 137, 10),
                new Player("Pierre-Emerick Aubameyang", 232, 70, 6),
                new Player("Edinson Cavani", 382, 73, 21),
                new Player("Franck Ribéry", 168, 228, 26),
                new Player("Andrea Pirlo", 73, 141, 20)
        );

        playerService.savePlayers(players);
        return "redirect:/players";

    }
}

