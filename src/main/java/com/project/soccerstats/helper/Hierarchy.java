package com.project.soccerstats.helper;

import com.project.soccerstats.model.Player;

import java.util.*;

/**
 * Hierarchy.java
 * This class provides utility methods to calculate and rank players based on their achievements.
 * It calculates a sort index for each player and sorts them from best to worst.
 */
public class Hierarchy {

    /**
     * Method - Player Ranking
     * This method sorts players from best to worst based on their calculated sortIndex.
     * Parameter: `playersMap` is a Map<String, Player> where the key is the player name, and the value is the Player object.
     * List<Player> return type - Returns a sorted list of Player objects in descending order of sortIndex.
     */
    public static List<Player> sortPlayersByHierarchy(Map<String, Player> playersMap) {
        // Convert map values to a list of players
        List<Player> players = new ArrayList<>(playersMap.values());

        // Calculate sortIndex for each player
        for (Player player : players) {
            double sortIndex = calculateSortIndex(player); // Calculate the sort index for the player
            player.setSortIndex(sortIndex); // Set the calculated sort index in the Player object
        }

        // Sort players in descending order based on sortIndex
        players.sort((p1, p2) -> Double.compare(p2.getSortIndex(), p1.getSortIndex()));

        return players; // Return the sorted list of players
    }

    /**
     * Method - Sort Index Calculator
     * This method calculates the sort index for a player based on their achievements.
     * Parameter: `player` is of type Player.
     * double return type - Returns the calculated sort index.
     */
    private static double calculateSortIndex(Player player) {
        // Weightage for different achievement categories
        final double TROPHIES_WEIGHT = 0.35;       // 35% weight for team trophies
        final double GOALS_ASSISTS_WEIGHT = 0.30;  // 30% weight for goals and assists
        final double INDIVIDUAL_TITLES_WEIGHT = 0.35; // 35% weight for individual titles

        // Calculate scores for different categories
        double trophiesScore = calculateTrophiesScore(player);       // Score for team trophies
        double goalsAssistsScore = calculateGoalsAssistsScore(player); // Score for goals and assists
        double individualTitlesScore = calculateIndividualTitlesScore(player); // Score for individual titles

        // Combine the scores using their respective weights to calculate the sortIndex
        return (trophiesScore * TROPHIES_WEIGHT) +
                (goalsAssistsScore * GOALS_ASSISTS_WEIGHT) +
                (individualTitlesScore * INDIVIDUAL_TITLES_WEIGHT);
    }

    /**
     * Method - Trophies Score Calculator
     * This method calculates a normalized score for a player's trophies.
     * Parameter: `player` is of type Player.
     * double return type - Returns the normalized trophies score.
     */
    private static double calculateTrophiesScore(Player player) {
        // Maximum values for normalizing scores
        final int MAX_INTERNATIONAL_TROPHIES = 5;
        final int MAX_UEFA_CONTINENTAL_TROPHIES = 7;
        final int MAX_LEAGUE_TITLES = 15;
        final int MAX_CONTINENTAL_TROPHIES = 5;
        final int MAX_DOMESTIC_CUPS = 10;
        final int MAX_FRIENDLY_CUPS = 20;

        // Calculate normalized scores for each category of trophies
        double internationalTrophiesScore = Math.min((double) player.getInternationalTrophiesTotal() / MAX_INTERNATIONAL_TROPHIES, 1.0);
        double uefaContinentalTrophiesScore = Math.min((double) player.getTotalUEFAContinentalTrophies() / MAX_UEFA_CONTINENTAL_TROPHIES, 1.0);
        double leagueTitlesScore = Math.min((double) player.getLeagueTitlesTotal() / MAX_LEAGUE_TITLES, 1.0);
        double continentalTrophiesScore = Math.min((double) player.getTotalContinentalTrophies() / MAX_CONTINENTAL_TROPHIES, 1.0);
        double domesticCupsScore = Math.min((double) player.getDomesticCupsTotal() / MAX_DOMESTIC_CUPS, 1.0);
        double friendlyCupsScore = Math.min((double) player.getFriendlyCupsTotal() / MAX_FRIENDLY_CUPS, 1.0);

        // Combine the scores with their weights to get the total trophies score
        return (internationalTrophiesScore * 0.5) +
                (uefaContinentalTrophiesScore * 0.3) +
                (leagueTitlesScore * 0.1) +
                (continentalTrophiesScore * 0.05) +
                (domesticCupsScore * 0.04) +
                (friendlyCupsScore * 0.01);
    }

    /**
     * Method - Goals and Assists Score Calculator
     * This method calculates a normalized score based on a player's goals and assists.
     * Parameter: `player` is of type Player.
     * double return type - Returns the normalized goals and assists score.
     */
    private static double calculateGoalsAssistsScore(Player player) {
        // Maximum values for normalizing goals and assists
        final int MAX_GOALS = 800;
        final int MAX_ASSISTS = 500;

        // Calculate normalized scores for goals and assists
        double goalsScore = Math.min((double) player.getGoals() / MAX_GOALS, 1.0);
        double assistsScore = Math.min((double) player.getAssists() / MAX_ASSISTS, 1.0);

        // Combine the scores, with goals having a higher weight
        return (goalsScore * 0.7) + (assistsScore * 0.3);
    }

    /**
     * Method - Individual Titles Score Calculator
     * This method calculates a normalized score for a player's individual titles.
     * Parameter: `player` is of type Player.
     * double return type - Returns the normalized individual titles score.
     */
    private static double calculateIndividualTitlesScore(Player player) {
        // Maximum values for normalizing individual titles
        final int MAX_BALLON_DORS = 10;
        final int MAX_FIFA_THE_BEST = 10;
        final int MAX_UEFA_BEST_PLAYER = 10;
        final int MAX_GOLDEN_BOOTS = 15;
        final int MAX_TOP_SCORERS = 20;
        final int MAX_PUSKAS = 5;
        final int MAX_LEAGUE_MVPS = 15;
        final int MAX_PLAYER_OF_THE_MONTH = 30;
        final int MAX_PLAYER_OF_THE_WEEK = 50;

        // Calculate normalized scores for each type of individual title
        double ballonDorsScore = Math.min((double) player.getBallonDors() / MAX_BALLON_DORS, 1.0);
        double fifaTheBestScore = Math.min((double) player.getFifaTheBestAwards() / MAX_FIFA_THE_BEST, 1.0);
        double uefaBestPlayerScore = Math.min((double) player.getUefaBestPlayerInEurope() / MAX_UEFA_BEST_PLAYER, 1.0);
        double goldenBootsScore = Math.min((double) player.getGoldenBoots() / MAX_GOLDEN_BOOTS, 1.0);
        double topScorersScore = Math.min((double) player.getTopGoalScorers() / MAX_TOP_SCORERS, 1.0);
        double puskasScore = Math.min((double) player.getPuskasAwards() / MAX_PUSKAS, 1.0);
        double leagueMVPsScore = Math.min((double) player.getLeagueMVPs() / MAX_LEAGUE_MVPS, 1.0);
        double playerOfTheMonthScore = Math.min((double) player.getPlayerOfTheMonth() / MAX_PLAYER_OF_THE_MONTH, 1.0);
        double playerOfTheWeekScore = Math.min((double) player.getPlayerOfTheWeek() / MAX_PLAYER_OF_THE_WEEK, 1.0);

        // Combine the scores for the total individual titles score
        return (ballonDorsScore * 0.25) +
                (fifaTheBestScore * 0.2) +
                (uefaBestPlayerScore * 0.15) +
                (goldenBootsScore * 0.15) +
                (topScorersScore * 0.1) +
                (puskasScore * 0.05) +
                (leagueMVPsScore * 0.05) +
                (playerOfTheMonthScore * 0.03) +
                (playerOfTheWeekScore * 0.02);
    }
}
