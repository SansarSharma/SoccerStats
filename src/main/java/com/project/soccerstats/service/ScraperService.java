package com.project.soccerstats.service;

import com.project.soccerstats.helper.PlayerUrl;
import com.project.soccerstats.model.Player;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

/**
 * ScraperService.java
 * This service class is responsible for scraping player data from external websites by using URLs defined in the PlayerUrl helper class. It processes the scraped data and creates Player objects with the relevant statistics and achievements.
 */

@Service
public class ScraperService {

    /**
     * Method - Scrape All Players
     * Scrapes player data from URLs provided by the PlayerUrl helper and returns a list of Player objects.
     * No parameters
     * Return type: List<Player>
     */
    public List<Player> scrapePlayers() {
        List<Player> players = new ArrayList<>(); // Initialize an empty list to store Player objects

        // Get player URLs from PlayerUrl helper class
        Map<String, List<String>> playerUrls = PlayerUrl.getPlayerUrls();

        // Iterate over each player and scrape data from their URLs
        for (Map.Entry<String, List<String>> entry : playerUrls.entrySet()) {
            String playerName = entry.getKey(); // Get the player's name
            List<String> urls = entry.getValue(); // Get the list of URLs for the player

            // Scrape player data and create a Player object
            Player player = scrapePlayer(playerName, urls);
            if (player != null) {
                players.add(player); // Add the Player object to the list if scraping was successful
            }
        }

        return players; // Return the list of Player objects
    }

    /**
     * Method - Scrape Individual Player
     * Scrapes data for an individual player from their associated URLs and returns a Player object.
     * Parameters:
     *   - `playerName`: The name of the player (String)
     *   - `urls`: A list of URLs to scrape data from (List<String>)
     * Return type: Player
     */
    private Player scrapePlayer(String playerName, List<String> urls) {
        Player player = new Player(); // Create a new Player object
        player.setName(playerName); // Set the player's name
        player.setClubs(new ArrayList<>()); // Initialize an empty list for the player's clubs

        // Iterate over the URLs and scrape data
        for (String url : urls) {
            try {
                // Connect to the URL and fetch the document
                Document doc = Jsoup.connect(url).get();

                // Basic Information
                player.setNationality(doc.select("span[itemprop=nationality].data-header__content").text());
                player.getClubs().addAll(doc.select(".tm-player-transfer-history-gridnew-club .tm-player-transfer-history-gridclub-link").eachText());
                player.setGoals(player.getGoals() + parseIntSafely(doc.select("tfoot tr td.zentriert:nth-of-type(4)").text()));
                player.setAssists(player.getAssists() + parseIntSafely(doc.select("tfoot tr td.zentriert:nth-of-type(5)").text()));

                // Domestic League Titles
                player.setPremierLeagueTitles(player.getPremierLeagueTitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(English champion)").text().split("x")[0].trim()));
                player.setLaLigaTitles(player.getLaLigaTitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(Spanish champion)").text().split("x")[0].trim()));
                player.setSerieATitles(player.getSerieATitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(Italian champion)").text().split("x")[0].trim()));
                player.setBundesligaTitles(player.getBundesligaTitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(German champion)").text().split("x")[0].trim()));
                player.setLigue1Titles(player.getLigue1Titles() + parseIntSafely(doc.select("h2.content-box-headline:contains(French champion)").text().split("x")[0].trim()));
                player.setEredivisieTitles(player.getEredivisieTitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(Dutch champion)").text().split("x")[0].trim()));

                // Primary Domestic Cups
                player.setFaCups(player.getFaCups() + parseIntSafely(doc.select("h2.content-box-headline:contains(English FA Cup winner)").text().split("x")[0].trim()));
                player.setCopaDelRey(player.getCopaDelRey() + parseIntSafely(doc.select("h2.content-box-headline:contains(Spanish cup winner)").text().split("x")[0].trim()));
                player.setCoppaItalia(player.getCoppaItalia() + parseIntSafely(doc.select("h2.content-box-headline:contains(Italian cup winner)").text().split("x")[0].trim()));
                player.setDfbPokal(player.getDfbPokal() + parseIntSafely(doc.select("h2.content-box-headline:contains(German cup winner)").text().split("x")[0].trim()));
                player.setCoupeDeFrance(player.getCoupeDeFrance() + parseIntSafely(doc.select("h2.content-box-headline:contains(France cup winner)").text().split("x")[0].trim()));
                player.setKnvbCup(player.getKnvbCup() + parseIntSafely(doc.select("h2.content-box-headline:contains(Dutch Cup winner)").text().split("x")[0].trim()));

                // Secondary Domestic Cups
                player.setEflCup(player.getEflCup() + parseIntSafely(doc.select("h2.content-box-headline:contains(English League Cup winner)").text().split("x")[0].trim())); // Added
                player.setCoupeDeLaLigue(player.getCoupeDeLaLigue() + parseIntSafely(doc.select("h2.content-box-headline:contains(French league cup winner)").text().split("x")[0].trim())); // Added

                // Domestic Super Cups
                player.setCommunityShields(player.getCommunityShields() + parseIntSafely(doc.select("h2.content-box-headline:contains(English Super Cup winner)").text().split("x")[0].trim()));
                player.setSupercopaDeEspana(player.getSupercopaDeEspana() + parseIntSafely(doc.select("h2.content-box-headline:contains(Spanish Super Cup winner)").text().split("x")[0].trim()));
                player.setSupercoppaItaliana(player.getSupercoppaItaliana() + parseIntSafely(doc.select("h2.content-box-headline:contains(Italian Super Cup winner)").text().split("x")[0].trim()));
                player.setDfbSupercup(player.getDfbSupercup() + parseIntSafely(doc.select("h2.content-box-headline:contains(German Super Cup winner)").text().split("x")[0].trim()));
                player.setTropheeDesChampions(player.getTropheeDesChampions() + parseIntSafely(doc.select("h2.content-box-headline:contains(French Super Cup winner)").text().split("x")[0].trim()));

                // Friendly and Miscellaneous Cups
                player.setFriendlyCups(player.getFriendlyCups() ); // Added

                // International Trophies
                player.setWorldCups(player.getWorldCups() + parseIntSafely(doc.select("h2.content-box-headline:contains(World Cup winner)").text().split("x")[0].trim()));
                player.setEuros(player.getEuros() + parseIntSafely(doc.select("h2.content-box-headline:contains(European champion)").text().split("x")[0].trim()));
                player.setFinalissima(player.getFinalissima() + parseIntSafely(doc.select("h2.content-box-headline:contains(CONMEBOL-UEFA Cup of Champions winner)").text().split("x")[0].trim()));
                player.setCopaAmerica(player.getCopaAmerica() + parseIntSafely(doc.select("h2.content-box-headline:contains(Copa América winner)").text().split("x")[0].trim()));
                player.setUefaNationsLeague(player.getUefaNationsLeague() + parseIntSafely(doc.select("h2.content-box-headline:contains(Winner UEFA Nations League)").text().split("x")[0].trim())); // Added
                player.setGoldCup(player.getGoldCup() + parseIntSafely(doc.select("h2.content-box-headline:contains(Gold Cup winner)").text().split("x")[0].trim())); // Added
                player.setU17WorldCup(player.getU17WorldCup() + parseIntSafely(doc.select("h2.content-box-headline:contains(Under-17 World Cup champion)").text().split("x")[0].trim())); // Added
                player.setU20WorldCup(player.getU20WorldCup() + parseIntSafely(doc.select("h2.content-box-headline:contains(Under-20 World Cup champion)").text().split("x")[0].trim())); // Added

                // International Club Competitions
                player.setUclTitles(player.getUclTitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(Champions League winner)").text().split("x")[0].trim())); // Added
                player.setUelTitles(player.getUelTitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(Europa League winner)").text().split("x")[0].trim())); // Added
                player.setEclTitles(player.getEclTitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(Conference League winner)").text().split("x")[0].trim())); // Added
                player.setUefaSuperCupTitles(player.getUefaSuperCupTitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(Uefa Supercup winner)").text().split("x")[0].trim())); // Added
                player.setClubWorldCups(player.getClubWorldCups() + parseIntSafely(doc.select("h2.content-box-headline:contains(FIFA Club World Cup winner)").text().split("x")[0].trim()));

                // MLS-Specific Trophies
                player.setMlsCupTitles(player.getMlsCupTitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(MLS Cup Champion)").text().split("x")[0].trim())); // Added
                player.setSupportersShieldTitles(player.getSupportersShieldTitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(Supporters\\' Shield Winner)").text().split("x")[0].trim())); // Added
                player.setLeaguesCupTitles(player.getLeaguesCupTitles() + parseIntSafely(doc.select("h2.content-box-headline:contains(Leagues Cup Winner)").text().split("x")[0].trim()) ); // Added

                // Individual Titles
                player.setBallonDors(player.getBallonDors() + parseIntSafely(doc.select("h2.content-box-headline:contains(Winner Ballon)").text().split("x")[0].trim()));
                player.setFifaTheBestAwards(player.getFifaTheBestAwards() + parseIntSafely(doc.select("h2.content-box-headline:contains(The Best FIFA)").text().split("x")[0].trim()));
                player.setUefaBestPlayerInEurope(player.getUefaBestPlayerInEurope() + parseIntSafely(doc.select("h2.content-box-headline:contains(UEFA Best Player)").text().split("x")[0].trim()));
                player.setGoldenBoots(player.getGoldenBoots() + parseIntSafely(doc.select("h2.content-box-headline:contains(Golden Boot)").text().split("x")[0].trim()));
                player.setTopGoalScorers(player.getTopGoalScorers() + parseIntSafely(doc.select("h2.content-box-headline:contains(Top goal)").text().split("x")[0].trim()));
                player.setPlayerOfTheMonth(player.getPlayerOfTheMonth() );
                player.setPlayerOfTheWeek(player.getPlayerOfTheWeek() );
                player.setLeagueMVPs(player.getLeagueMVPs() + doc.select("h2.content-box-headline").eachText().stream().filter(text -> text.contains("MVP")).mapToInt(text -> parseIntSafely(text.split("x")[0].trim())).sum());
                player.setOlympicMedals(player.getOlympicMedals() + parseIntSafely(doc.select("h2.content-box-headline:contains(Olympic medalist)").text().split("x")[0].trim()));
                player.setPuskasAwards(player.getPuskasAwards() + parseIntSafely(doc.select("h2.content-box-headline:contains(FIFA Puskás Award)").text().split("x")[0].trim())); // Added

                // Totals
                player.setLeagueTitlesTotal(player.getPremierLeagueTitles()+player.getLaLigaTitles()+player.getSerieATitles()+player.getBundesligaTitles()+player.getLigue1Titles()+player.getEredivisieTitles()+player.getMlsCupTitles()+player.getSupportersShieldTitles());
                player.setDomesticCupsTotal(player.getFaCups()+player.getCopaDelRey()+player.getCoppaItalia()+player.getDfbPokal()+player.getCoupeDeFrance()+player.getKnvbCup()+player.getCommunityShields()+player.getSupercopaDeEspana()+player.getSupercoppaItaliana()+player.getDfbSupercup()+player.getTropheeDesChampions()+player.getEflCup()+player.getCoupeDeFrance());
                player.setFriendlyCupsTotal(player.getClubWorldCups()+player.getFriendlyCups());
                player.setInternationalTrophiesTotal(player.getEuros()+player.getCopaAmerica()+player.getFinalissima()+player.getWorldCups()+player.getU20WorldCup()+player.getU17WorldCup()+player.getUefaNationsLeague()+player.getGoldCup());
                player.setTotalUEFAContinentalTrophies(player.getUclTitles()+player.getUelTitles()+player.getEclTitles()+player.getUefaSuperCupTitles());
                player.setTotalContinentalTrophies(player.getLeaguesCupTitles());
                player.setTrophiesWon(player.getLeagueTitlesTotal() + player.getDomesticCupsTotal() + player.getFriendlyCupsTotal() + player.getInternationalTrophiesTotal() + player.getTotalUEFAContinentalTrophies() + player.getTotalContinentalTrophies());
                player.setTotalIndividualTrophies(player.getBallonDors() + player.getFifaTheBestAwards() + player.getUefaBestPlayerInEurope() + player.getGoldenBoots() + player.getTopGoalScorers() + player.getLeagueMVPs() + player.getOlympicMedals() + player.getPuskasAwards());

                // Add a delay between requests to avoid being blocked
                try {
                    Thread.sleep(4000 + (long) (Math.random() * 6000)); // Delay between 4-10 seconds
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Thread interrupted during delay");
                }

            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Failed to scrape URL: " + url); // Log any failures
            }
        }

        return player; // Return the populated Player object
    }

    /**
     * Method - Parse Integer Safely
     * Parses a string into an integer. Returns 0 if parsing fails.
     * Parameter: `text` is the string to be parsed (String)
     * Return type: int
     */
    private int parseIntSafely(String text) {
        try {
            return Integer.parseInt(text); // Parse the string into an integer
        } catch (NumberFormatException e) {
            return 0; // Default to 0 if parsing fails
        }
    }
}