package com.project.soccerstats.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Player.java
 * This class represents a soccer player and their statistics, achievements, and career history.
 * It is used as the primary data model for interacting with MongoDB.
 */

@Document(collection = "players") // Annotation to define this class as a MongoDB document in the "players" collection
public class Player {

    // Declaring Instance Variables

    // Basic Details
    @Id
    private String id; // Unique identifier for the player in the database
    private String name; // Full name of the player
    private String nationality; // Nationality of the player
    private List<String> clubs; // List of clubs the player has played for, with the last entry being their current or last club

    // Career Statistics
    private int goals; // Total goals scored by the player
    private int assists; // Total assists made by the player
    private double sortIndex; // A calculated value used for ranking players
    private int trophiesWon; // Total number of trophies won by the player

    // Domestic League Titles
    private int premierLeagueTitles; // Titles won in the English Premier League
    private int laLigaTitles; // Titles won in La Liga (Spain)
    private int serieATitles; // Titles won in Serie A (Italy)
    private int bundesligaTitles; // Titles won in the Bundesliga (Germany)
    private int ligue1Titles; // Titles won in Ligue 1 (France)
    private int eredivisieTitles; // Titles won in the Eredivisie (Netherlands)

    // Primary Domestic Cups
    private int faCups; // English FA Cups won
    private int copaDelRey; // Spanish Copa del Rey titles won
    private int coppaItalia; // Italian Coppa Italia titles won
    private int dfbPokal; // German DFB-Pokal titles won
    private int coupeDeFrance; // French Coupe de France titles won
    private int knvbCup; // Dutch KNVB Cup titles won

    // Secondary Domestic Cups
    private int eflCup; // English EFL Cups (League Cups) won
    private int coupeDeLaLigue; // French Coupe de la Ligue titles won

    // Domestic Super Cups
    private int communityShields; // English Community Shield titles won
    private int supercopaDeEspana; // Spanish Supercopa de España titles won
    private int supercoppaItaliana; // Italian Supercoppa Italiana titles won
    private int dfbSupercup; // German DFB-Supercup titles won
    private int tropheeDesChampions; // French Trophée des Champions titles won

    // Friendly and Miscellaneous Cups
    private int friendlyCups; // Friendly or pre-season tournament trophies won

    // International Trophies
    private int worldCups; // FIFA World Cups won
    private int euros; // UEFA European Championships won
    private int finalissima; // CONMEBOL–UEFA Cup of Champions (Finalissima) titles won
    private int copaAmerica; // Copa América titles won
    private int uefaNationsLeague; // UEFA Nations League titles won
    private int goldCup; // CONCACAF Gold Cup titles won
    private int u17WorldCup; // FIFA U-17 World Cup titles won
    private int u20WorldCup; // FIFA U-20 World Cup titles won

    // International Club Competitions
    private int uclTitles; // UEFA Champions League titles won
    private int uelTitles; // UEFA Europa League titles won
    private int eclTitles; // UEFA Europa Conference League titles won
    private int clubWorldCups; // FIFA Club World Cups won
    private int uefaSuperCupTitles; // UEFA Super Cup titles won

    // MLS-Specific Trophies
    private int mlsCupTitles; // MLS Cup titles won
    private int supportersShieldTitles; // Supporters' Shield titles won
    private int leaguesCupTitles; // Leagues Cup titles won

    // Individual Titles
    private int ballonDors; // Ballon d'Or awards won
    private int fifaTheBestAwards; // FIFA The Best awards won
    private int uefaBestPlayerInEurope; // UEFA Best Player in Europe awards won
    private int goldenBoots; // Golden Boot awards won
    private int topGoalScorers; // Top scorer awards won
    private int playerOfTheMonth; // Player of the Month awards won
    private int playerOfTheWeek; // Player of the Week awards won
    private int leagueMVPs; // League MVP awards won
    private int olympicMedals; // Olympic medals won
    private int puskasAwards; // Puskás Awards won

    // Totals
    private int leagueTitlesTotal; // Total number of league titles won
    private int domesticCupsTotal; // Total number of domestic cup titles won
    private int friendlyCupsTotal; // Total number of friendly tournament trophies won
    private int internationalTrophiesTotal; // Total number of international trophies won
    private int totalUEFAContinentalTrophies; // Total number of UEFA continental trophies won
    private int totalContinentalTrophies; // Total number of all continental trophies won
    private int totalIndividualTrophies; // Total number of all individual trophies won

    // Constructors

    /**
     * Default Constructor
     * Initializes a new Player object with default values and an empty list of clubs.
     * No parameters
     */
    public Player() {
        this.clubs = new ArrayList<>(); // Initialize clubs as an empty ArrayList
    }

    /**
     * Parameterized Constructor
     * Initializes a new Player object with specified values for all attributes.
     * Includes personal details, career stats, achievements, and totals.
     * Parameters: Refer to the variables being initialized.
     */
    public Player(String id, String name, String nationality, List<String> clubs, int goals, int assists, int trophiesWon,
                  int premierLeagueTitles, int laLigaTitles, int serieATitles, int bundesligaTitles, int ligue1Titles,
                  int eredivisieTitles, int faCups, int copaDelRey, int coppaItalia, int dfbPokal, int coupeDeFrance,
                  int knvbCup, int eflCup, int coupeDeLaLigue, int communityShields, int supercopaDeEspana,
                  int supercoppaItaliana, int dfbSupercup, int tropheeDesChampions, int friendlyCups, int clubWorldCups,
                  int worldCups, int euros, int finalissima, int copaAmerica, int uefaNationsLeague, int goldCup,
                  int u17WorldCup, int u20WorldCup, int uclTitles, int uelTitles, int eclTitles, int uefaSuperCupTitles,
                  int mlsCupTitles, int supportersShieldTitles, int leaguesCupTitles, int ballonDors, int fifaTheBestAwards,
                  int uefaBestPlayerInEurope, int goldenBoots, int topGoalScorers, int playerOfTheMonth, int playerOfTheWeek,
                  int leagueMVPs, int olympicMedals, int puskasAwards, int leagueTitlesTotal, int domesticCupsTotal,
                  int friendlyCupsTotal, int internationalTrophiesTotal, int totalContinentalTrophies) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.clubs = clubs;
        this.goals = goals;
        this.assists = assists;
        this.trophiesWon = trophiesWon;
        this.premierLeagueTitles = premierLeagueTitles;
        this.laLigaTitles = laLigaTitles;
        this.serieATitles = serieATitles;
        this.bundesligaTitles = bundesligaTitles;
        this.ligue1Titles = ligue1Titles;
        this.eredivisieTitles = eredivisieTitles;
        this.faCups = faCups;
        this.copaDelRey = copaDelRey;
        this.coppaItalia = coppaItalia;
        this.dfbPokal = dfbPokal;
        this.coupeDeFrance = coupeDeFrance;
        this.knvbCup = knvbCup;
        this.eflCup = eflCup;
        this.coupeDeLaLigue = coupeDeLaLigue;
        this.communityShields = communityShields;
        this.supercopaDeEspana = supercopaDeEspana;
        this.supercoppaItaliana = supercoppaItaliana;
        this.dfbSupercup = dfbSupercup;
        this.tropheeDesChampions = tropheeDesChampions;
        this.friendlyCups = friendlyCups;
        this.clubWorldCups = clubWorldCups;
        this.worldCups = worldCups;
        this.euros = euros;
        this.finalissima = finalissima;
        this.copaAmerica = copaAmerica;
        this.uefaNationsLeague = uefaNationsLeague;
        this.goldCup = goldCup;
        this.u17WorldCup = u17WorldCup;
        this.u20WorldCup = u20WorldCup;
        this.uclTitles = uclTitles;
        this.uelTitles = uelTitles;
        this.eclTitles = eclTitles;
        this.uefaSuperCupTitles = uefaSuperCupTitles;
        this.mlsCupTitles = mlsCupTitles;
        this.supportersShieldTitles = supportersShieldTitles;
        this.leaguesCupTitles = leaguesCupTitles;
        this.ballonDors = ballonDors;
        this.fifaTheBestAwards = fifaTheBestAwards;
        this.uefaBestPlayerInEurope = uefaBestPlayerInEurope;
        this.goldenBoots = goldenBoots;
        this.topGoalScorers = topGoalScorers;
        this.playerOfTheMonth = playerOfTheMonth;
        this.playerOfTheWeek = playerOfTheWeek;
        this.leagueMVPs = leagueMVPs;
        this.olympicMedals = olympicMedals;
        this.puskasAwards = puskasAwards;
        this.leagueTitlesTotal = leagueTitlesTotal;
        this.domesticCupsTotal = domesticCupsTotal;
        this.friendlyCupsTotal = friendlyCupsTotal;
        this.internationalTrophiesTotal = internationalTrophiesTotal;
        this.totalContinentalTrophies = totalContinentalTrophies;
    }

    // Methods

    // -----------------------------------------------------------------------------------------------------------------------------
    // Basic Details Getters and Setters
    /**
     * Method - Getter
     * Gets the unique identifier (ID) of the player.
     * No parameters
     * Return type: String
     */
    public String getId() {
        return id; // Return the player's unique ID
    }

    /**
     * Method - Setter
     * Sets the unique identifier (ID) of the player.
     * Parameter: `id` is the new ID to be set for the player.
     * Void return type
     */
    public void setId(String id) {
        this.id = id; // Assign the provided ID to the player
    }

    /**
     * Method - Getter
     * Gets the full name of the player.
     * No parameters
     * Return type: String
     */
    public String getName() {
        return name; // Return the player's name
    }

    /**
     * Method - Setter
     * Sets the full name of the player.
     * Parameter: `name` is the new name to be set for the player.
     * Void return type
     */
    public void setName(String name) {
        this.name = name; // Assign the provided name to the player
    }

    /**
     * Method - Getter
     * Gets the nationality of the player.
     * No parameters
     * Return type: String
     */
    public String getNationality() {
        return nationality; // Return the player's nationality
    }

    /**
     * Method - Setter
     * Sets the nationality of the player.
     * Parameter: `nationality` is the new nationality to be set for the player.
     * Void return type
     */
    public void setNationality(String nationality) {
        this.nationality = nationality; // Assign the provided nationality to the player
    }

    /**
     * Method - Getter
     * Gets the list of clubs the player has played for.
     * No parameters
     * Return type: List<String>
     */
    public List<String> getClubs() {
        return clubs; // Return the list of clubs
    }

    /**
     * Method - Setter
     * Sets the list of clubs the player has played for.
     * Parameter: `clubs` is the new list of clubs to be set for the player.
     * Void return type
     */
    public void setClubs(List<String> clubs) {
        this.clubs = clubs; // Assign the provided list of clubs to the player
    }

    /**
     * Method - Getter
     * Gets the sort index of the player, which is used for ranking purposes.
     * No parameters
     * Return type: double
     */
    public double getSortIndex() {
        return sortIndex; // Return the player's sort index
    }

    /**
     * Method - Setter
     * Sets the sort index of the player, which is used for ranking purposes.
     * Parameter: `sortIndex` is the new value to be set for the player's sort index.
     * Void return type
     */
    public void setSortIndex(double sortIndex) {
        this.sortIndex = sortIndex; // Assign the provided sort index to the player's record
    }

    // -----------------------------------------------------------------------------------------------------------------------------
    // Career Statistics Getters and Setters
    /**
     * Method - Getter
     * Gets the total number of goals scored by the player.
     * No parameters
     * Return type: int
     */
    public int getGoals() {
        return goals; // Return the total goals scored by the player
    }

    /**
     * Method - Setter
     * Sets the total number of goals scored by the player.
     * Parameter: `goals` is the new total goals count to be set for the player.
     * Void return type
     */
    public void setGoals(int goals) {
        this.goals = goals; // Assign the provided total goals to the player
    }

    /**
     * Method - Getter
     * Gets the total number of assists made by the player.
     * No parameters
     * Return type: int
     */
    public int getAssists() {
        return assists; // Return the total assists made by the player
    }

    /**
     * Method - Setter
     * Sets the total number of assists made by the player.
     * Parameter: `assists` is the new total assists count to be set for the player.
     * Void return type
     */
    public void setAssists(int assists) {
        this.assists = assists; // Assign the provided total assists to the player
    }

    /**
     * Method - Getter
     * Gets the total number of trophies won by the player.
     * No parameters
     * Return type: int
     */
    public int getTrophiesWon() {
        return trophiesWon; // Return the total number of trophies won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of trophies won by the player.
     * Parameter: `trophiesWon` is the new total trophies count to be set for the player.
     * Void return type
     */
    public void setTrophiesWon(int trophiesWon) {
        this.trophiesWon = trophiesWon; // Assign the provided total trophies to the player
    }

    // -----------------------------------------------------------------------------------------------------------------------------
    // Domestic League Getters and Setters
    /**
     * Method - Getter
     * Gets the total number of Premier League titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getPremierLeagueTitles() {
        return premierLeagueTitles; // Return the total Premier League titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Premier League titles won by the player.
     * Parameter: `premierLeagueTitles` is the new total to be set.
     * Void return type
     */
    public void setPremierLeagueTitles(int premierLeagueTitles) {
        this.premierLeagueTitles = premierLeagueTitles; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of La Liga titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getLaLigaTitles() {
        return laLigaTitles; // Return the total La Liga titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of La Liga titles won by the player.
     * Parameter: `laLigaTitles` is the new total to be set.
     * Void return type
     */
    public void setLaLigaTitles(int laLigaTitles) {
        this.laLigaTitles = laLigaTitles; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Serie A titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getSerieATitles() {
        return serieATitles; // Return the total Serie A titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Serie A titles won by the player.
     * Parameter: `serieATitles` is the new total to be set.
     * Void return type
     */
    public void setSerieATitles(int serieATitles) {
        this.serieATitles = serieATitles; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Bundesliga titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getBundesligaTitles() {
        return bundesligaTitles; // Return the total Bundesliga titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Bundesliga titles won by the player.
     * Parameter: `bundesligaTitles` is the new total to be set.
     * Void return type
     */
    public void setBundesligaTitles(int bundesligaTitles) {
        this.bundesligaTitles = bundesligaTitles; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Ligue 1 titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getLigue1Titles() {
        return ligue1Titles; // Return the total Ligue 1 titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Ligue 1 titles won by the player.
     * Parameter: `ligue1Titles` is the new total to be set.
     * Void return type
     */
    public void setLigue1Titles(int ligue1Titles) {
        this.ligue1Titles = ligue1Titles; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Eredivisie titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getEredivisieTitles() {
        return eredivisieTitles; // Return the total Eredivisie titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Eredivisie titles won by the player.
     * Parameter: `eredivisieTitles` is the new total to be set.
     * Void return type
     */
    public void setEredivisieTitles(int eredivisieTitles) {
        this.eredivisieTitles = eredivisieTitles; // Assign the provided total to the player's record
    }


    // -----------------------------------------------------------------------------------------------------------------------------
    // MLS-Specific Trophies Getters and Setters
    /**
     * Method - Getter
     * Gets the total number of Supporters' Shield titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getSupportersShieldTitles() {
        return supportersShieldTitles; // Return the total Supporters' Shield titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Supporters' Shield titles won by the player.
     * Parameter: `supportersShieldTitles` is the new total to be set.
     * Void return type
     */
    public void setSupportersShieldTitles(int supportersShieldTitles) {
        this.supportersShieldTitles = supportersShieldTitles; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of MLS Cup titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getMlsCupTitles() {
        return mlsCupTitles; // Return the total MLS Cup titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of MLS Cup titles won by the player.
     * Parameter: `mlsCupTitles` is the new total to be set.
     * Void return type
     */
    public void setMlsCupTitles(int mlsCupTitles) {
        this.mlsCupTitles = mlsCupTitles; // Assign the provided total to the player's record
    }

    // -----------------------------------------------------------------------------------------------------------------------------
    // Domestic Cups Getters and Setters
    /**
     * Method - Getter
     * Gets the total number of FA Cups won by the player.
     * No parameters
     * Return type: int
     */
    public int getFaCups() {
        return faCups; // Return the total FA Cups won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of FA Cups won by the player.
     * Parameter: `faCups` is the new total to be set.
     * Void return type
     */
    public void setFaCups(int faCups) {
        this.faCups = faCups; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Copa del Rey titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getCopaDelRey() {
        return copaDelRey; // Return the total Copa del Rey titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Copa del Rey titles won by the player.
     * Parameter: `copaDelRey` is the new total to be set.
     * Void return type
     */
    public void setCopaDelRey(int copaDelRey) {
        this.copaDelRey = copaDelRey; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Coppa Italia titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getCoppaItalia() {
        return coppaItalia; // Return the total Coppa Italia titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Coppa Italia titles won by the player.
     * Parameter: `coppaItalia` is the new total to be set.
     * Void return type
     */
    public void setCoppaItalia(int coppaItalia) {
        this.coppaItalia = coppaItalia; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of DFB-Pokal titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getDfbPokal() {
        return dfbPokal; // Return the total DFB-Pokal titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of DFB-Pokal titles won by the player.
     * Parameter: `dfbPokal` is the new total to be set.
     * Void return type
     */
    public void setDfbPokal(int dfbPokal) {
        this.dfbPokal = dfbPokal; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Coupe de France titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getCoupeDeFrance() {
        return coupeDeFrance; // Return the total Coupe de France titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Coupe de France titles won by the player.
     * Parameter: `coupeDeFrance` is the new total to be set.
     * Void return type
     */
    public void setCoupeDeFrance(int coupeDeFrance) {
        this.coupeDeFrance = coupeDeFrance; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of KNVB Cup titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getKnvbCup() {
        return knvbCup; // Return the total KNVB Cup titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of KNVB Cup titles won by the player.
     * Parameter: `knvbCup` is the new total to be set.
     * Void return type
     */
    public void setKnvbCup(int knvbCup) {
        this.knvbCup = knvbCup; // Assign the provided total to the player's record
    }

    // -----------------------------------------------------------------------------------------------------------------------------
    // Domestic Super Cups Getters and Setters
    /**
     * Method - Getter
     * Gets the total number of Community Shields won by the player.
     * No parameters
     * Return type: int
     */
    public int getCommunityShields() {
        return communityShields; // Return the total Community Shields won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Community Shields won by the player.
     * Parameter: `communityShields` is the new total to be set.
     * Void return type
     */
    public void setCommunityShields(int communityShields) {
        this.communityShields = communityShields; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Supercopa de España titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getSupercopaDeEspana() {
        return supercopaDeEspana; // Return the total Supercopa de España titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Supercopa de España titles won by the player.
     * Parameter: `supercopaDeEspana` is the new total to be set.
     * Void return type
     */
    public void setSupercopaDeEspana(int supercopaDeEspana) {
        this.supercopaDeEspana = supercopaDeEspana; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Supercoppa Italiana titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getSupercoppaItaliana() {
        return supercoppaItaliana; // Return the total Supercoppa Italiana titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Supercoppa Italiana titles won by the player.
     * Parameter: `supercoppaItaliana` is the new total to be set.
     * Void return type
     */
    public void setSupercoppaItaliana(int supercoppaItaliana) {
        this.supercoppaItaliana = supercoppaItaliana; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of DFB-Supercup titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getDfbSupercup() {
        return dfbSupercup; // Return the total DFB-Supercup titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of DFB-Supercup titles won by the player.
     * Parameter: `dfbSupercup` is the new total to be set.
     * Void return type
     */
    public void setDfbSupercup(int dfbSupercup) {
        this.dfbSupercup = dfbSupercup; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Trophée des Champions titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getTropheeDesChampions() {
        return tropheeDesChampions; // Return the total Trophée des Champions titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Trophée des Champions titles won by the player.
     * Parameter: `tropheeDesChampions` is the new total to be set.
     * Void return type
     */
    public void setTropheeDesChampions(int tropheeDesChampions) {
        this.tropheeDesChampions = tropheeDesChampions; // Assign the provided total to the player's record
    }

    // -----------------------------------------------------------------------------------------------------------------------------
    // Secondary Domestic Cups Getters and Setters
    /**
     * Method - Getter
     * Gets the total number of EFL Cups (English League Cups) won by the player.
     * No parameters
     * Return type: int
     */
    public int getEflCup() {
        return eflCup; // Return the total EFL Cups won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of EFL Cups (English League Cups) won by the player.
     * Parameter: `eflCup` is the new total to be set.
     * Void return type
     */
    public void setEflCup(int eflCup) {
        this.eflCup = eflCup; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Coupe de la Ligue (French League Cups) won by the player.
     * No parameters
     * Return type: int
     */
    public int getCoupeDeLaLigue() {
        return coupeDeLaLigue; // Return the total Coupe de la Ligue titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Coupe de la Ligue (French League Cups) won by the player.
     * Parameter: `coupeDeLaLigue` is the new total to be set.
     * Void return type
     */
    public void setCoupeDeLaLigue(int coupeDeLaLigue) {
        this.coupeDeLaLigue = coupeDeLaLigue; // Assign the provided total to the player's record
    }

    // -----------------------------------------------------------------------------------------------------------------------------
    // Friendly and Miscellaneous Getters and Setters
    /**
     * Method - Getter
     * Gets the total number of friendly or pre-season tournament trophies won by the player.
     * No parameters
     * Return type: int
     */
    public int getFriendlyCups() {
        return friendlyCups; // Return the total friendly tournament trophies won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of friendly or pre-season tournament trophies won by the player.
     * Parameter: `friendlyCups` is the new total to be set.
     * Void return type
     */
    public void setFriendlyCups(int friendlyCups) {
        this.friendlyCups = friendlyCups; // Assign the provided total to the player's record
    }

    // -----------------------------------------------------------------------------------------------------------------------------
    // International Trophies Getters and Setters
    /**
     * Method - Getter
     * Gets the total number of FIFA World Cups won by the player.
     * No parameters
     * Return type: int
     */
    public int getWorldCups() {
        return worldCups; // Return the total FIFA World Cups won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of FIFA World Cups won by the player.
     * Parameter: `worldCups` is the new total to be set.
     * Void return type
     */
    public void setWorldCups(int worldCups) {
        this.worldCups = worldCups; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of UEFA European Championships (Euros) won by the player.
     * No parameters
     * Return type: int
     */
    public int getEuros() {
        return euros; // Return the total UEFA European Championships won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of UEFA European Championships (Euros) won by the player.
     * Parameter: `euros` is the new total to be set.
     * Void return type
     */
    public void setEuros(int euros) {
        this.euros = euros; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Finalissima titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getFinalissima() {
        return finalissima; // Return the total Finalissima titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Finalissima titles won by the player.
     * Parameter: `finalissima` is the new total to be set.
     * Void return type
     */
    public void setFinalissima(int finalissima) {
        this.finalissima = finalissima; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Copa América titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getCopaAmerica() {
        return copaAmerica; // Return the total Copa América titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Copa América titles won by the player.
     * Parameter: `copaAmerica` is the new total to be set.
     * Void return type
     */
    public void setCopaAmerica(int copaAmerica) {
        this.copaAmerica = copaAmerica; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of UEFA Nations League titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getUefaNationsLeague() {
        return uefaNationsLeague; // Return the total UEFA Nations League titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of UEFA Nations League titles won by the player.
     * Parameter: `uefaNationsLeague` is the new total to be set.
     * Void return type
     */
    public void setUefaNationsLeague(int uefaNationsLeague) {
        this.uefaNationsLeague = uefaNationsLeague; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of CONCACAF Gold Cups won by the player.
     * No parameters
     * Return type: int
     */
    public int getGoldCup() {
        return goldCup; // Return the total CONCACAF Gold Cups won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of CONCACAF Gold Cups won by the player.
     * Parameter: `goldCup` is the new total to be set.
     * Void return type
     */
    public void setGoldCup(int goldCup) {
        this.goldCup = goldCup; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of FIFA U-17 World Cups won by the player.
     * No parameters
     * Return type: int
     */
    public int getU17WorldCup() {
        return u17WorldCup; // Return the total FIFA U-17 World Cups won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of FIFA U-17 World Cups won by the player.
     * Parameter: `u17WorldCup` is the new total to be set.
     * Void return type
     */
    public void setU17WorldCup(int u17WorldCup) {
        this.u17WorldCup = u17WorldCup; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of FIFA U-20 World Cups won by the player.
     * No parameters
     * Return type: int
     */
    public int getU20WorldCup() {
        return u20WorldCup; // Return the total FIFA U-20 World Cups won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of FIFA U-20 World Cups won by the player.
     * Parameter: `u20WorldCup` is the new total to be set.
     * Void return type
     */
    public void setU20WorldCup(int u20WorldCup) {
        this.u20WorldCup = u20WorldCup; // Assign the provided total to the player's record
    }

    // -----------------------------------------------------------------------------------------------------------------------------
    // UEFA Continental Trophies Getters and Setters
    /**
     * Method - Getter
     * Gets the total number of UEFA Champions League (UCL) titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getUclTitles() {
        return uclTitles; // Return the total UEFA Champions League titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of UEFA Champions League (UCL) titles won by the player.
     * Parameter: `uclTitles` is the new total to be set.
     * Void return type
     */
    public void setUclTitles(int uclTitles) {
        this.uclTitles = uclTitles; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of UEFA Europa League (UEL) titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getUelTitles() {
        return uelTitles; // Return the total UEFA Europa League titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of UEFA Europa League (UEL) titles won by the player.
     * Parameter: `uelTitles` is the new total to be set.
     * Void return type
     */
    public void setUelTitles(int uelTitles) {
        this.uelTitles = uelTitles; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of UEFA Europa Conference League (ECL) titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getEclTitles() {
        return eclTitles; // Return the total UEFA Europa Conference League titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of UEFA Europa Conference League (ECL) titles won by the player.
     * Parameter: `eclTitles` is the new total to be set.
     * Void return type
     */
    public void setEclTitles(int eclTitles) {
        this.eclTitles = eclTitles; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of UEFA Super Cup titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getUefaSuperCupTitles() {
        return uefaSuperCupTitles; // Return the total UEFA Super Cup titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of UEFA Super Cup titles won by the player.
     * Parameter: `uefaSuperCupTitles` is the new total to be set.
     * Void return type
     */
    public void setUefaSuperCupTitles(int uefaSuperCupTitles) {
        this.uefaSuperCupTitles = uefaSuperCupTitles; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of FIFA Club World Cup titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getClubWorldCups() {
        return clubWorldCups; // Return the total FIFA Club World Cup titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of FIFA Club World Cup titles won by the player.
     * Parameter: `clubWorldCups` is the new total to be set.
     * Void return type
     */
    public void setClubWorldCups(int clubWorldCups) {
        this.clubWorldCups = clubWorldCups; // Assign the provided total to the player's record
    }

    // -----------------------------------------------------------------------------------------------------------------------------
    // Non-UEFA Continental Trophies Getters and Setters
    /**
     * Method - Getter
     * Gets the total number of Leagues Cup titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getLeaguesCupTitles() {
        return leaguesCupTitles; // Return the total Leagues Cup titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Leagues Cup titles won by the player.
     * Parameter: `leaguesCupTitles` is the new total to be set.
     * Void return type
     */
    public void setLeaguesCupTitles(int leaguesCupTitles) {
        this.leaguesCupTitles = leaguesCupTitles; // Assign the provided total to the player's record
    }

    // -----------------------------------------------------------------------------------------------------------------------------
    // Individual Titles Getters and Setters
    /**
     * Method - Getter
     * Gets the total number of Ballon d'Or awards won by the player.
     * No parameters
     * Return type: int
     */
    public int getBallonDors() {
        return ballonDors; // Return the total Ballon d'Or awards won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Ballon d'Or awards won by the player.
     * Parameter: `ballonDors` is the new total to be set.
     * Void return type
     */
    public void setBallonDors(int ballonDors) {
        this.ballonDors = ballonDors; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of FIFA The Best awards won by the player.
     * No parameters
     * Return type: int
     */
    public int getFifaTheBestAwards() {
        return fifaTheBestAwards; // Return the total FIFA The Best awards won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of FIFA The Best awards won by the player.
     * Parameter: `fifaTheBestAwards` is the new total to be set.
     * Void return type
     */
    public void setFifaTheBestAwards(int fifaTheBestAwards) {
        this.fifaTheBestAwards = fifaTheBestAwards; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of UEFA Best Player in Europe awards won by the player.
     * No parameters
     * Return type: int
     */
    public int getUefaBestPlayerInEurope() {
        return uefaBestPlayerInEurope; // Return the total UEFA Best Player in Europe awards won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of UEFA Best Player in Europe awards won by the player.
     * Parameter: `uefaBestPlayerInEurope` is the new total to be set.
     * Void return type
     */
    public void setUefaBestPlayerInEurope(int uefaBestPlayerInEurope) {
        this.uefaBestPlayerInEurope = uefaBestPlayerInEurope; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Golden Boot awards won by the player.
     * No parameters
     * Return type: int
     */
    public int getGoldenBoots() {
        return goldenBoots; // Return the total Golden Boot awards won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Golden Boot awards won by the player.
     * Parameter: `goldenBoots` is the new total to be set.
     * Void return type
     */
    public void setGoldenBoots(int goldenBoots) {
        this.goldenBoots = goldenBoots; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Puskás Awards won by the player.
     * No parameters
     * Return type: int
     */
    public int getPuskasAwards() {
        return puskasAwards; // Return the total Puskás Awards won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Puskás Awards won by the player.
     * Parameter: `puskasAwards` is the new total to be set.
     * Void return type
     */
    public void setPuskasAwards(int puskasAwards) {
        this.puskasAwards = puskasAwards; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of top goal scorer awards won by the player.
     * No parameters
     * Return type: int
     */
    public int getTopGoalScorers() {
        return topGoalScorers; // Return the total top goal scorer awards won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of top goal scorer awards won by the player.
     * Parameter: `topGoalScorers` is the new total to be set.
     * Void return type
     */
    public void setTopGoalScorers(int topGoalScorers) {
        this.topGoalScorers = topGoalScorers; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Player of the Month awards won by the player.
     * No parameters
     * Return type: int
     */
    public int getPlayerOfTheMonth() {
        return playerOfTheMonth; // Return the total Player of the Month awards won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Player of the Month awards won by the player.
     * Parameter: `playerOfTheMonth` is the new total to be set.
     * Void return type
     */
    public void setPlayerOfTheMonth(int playerOfTheMonth) {
        this.playerOfTheMonth = playerOfTheMonth; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Player of the Week awards won by the player.
     * No parameters
     * Return type: int
     */
    public int getPlayerOfTheWeek() {
        return playerOfTheWeek; // Return the total Player of the Week awards won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Player of the Week awards won by the player.
     * Parameter: `playerOfTheWeek` is the new total to be set.
     * Void return type
     */
    public void setPlayerOfTheWeek(int playerOfTheWeek) {
        this.playerOfTheWeek = playerOfTheWeek; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of league MVP awards won by the player.
     * No parameters
     * Return type: int
     */
    public int getLeagueMVPs() {
        return leagueMVPs; // Return the total league MVP awards won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of league MVP awards won by the player.
     * Parameter: `leagueMVPs` is the new total to be set.
     * Void return type
     */
    public void setLeagueMVPs(int leagueMVPs) {
        this.leagueMVPs = leagueMVPs; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of Olympic medals won by the player.
     * No parameters
     * Return type: int
     */
    public int getOlympicMedals() {
        return olympicMedals; // Return the total Olympic medals won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of Olympic medals won by the player.
     * Parameter: `olympicMedals` is the new total to be set.
     * Void return type
     */
    public void setOlympicMedals(int olympicMedals) {
        this.olympicMedals = olympicMedals; // Assign the provided total to the player's record
    }

    // -----------------------------------------------------------------------------------------------------------------------------
    // Totals Trophies Getters and Setters

    /**
     * Method - Getter
     * Gets the total number of league titles won by the player.
     * No parameters
     * Return type: int
     */
    public int getLeagueTitlesTotal() {
        return leagueTitlesTotal; // Return the total number of league titles won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of league titles won by the player.
     * Parameter: `leagueTitlesTotal` is the new total to be set.
     * Void return type
     */
    public void setLeagueTitlesTotal(int leagueTitlesTotal) {
        this.leagueTitlesTotal = leagueTitlesTotal; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of domestic cups won by the player.
     * No parameters
     * Return type: int
     */
    public int getDomesticCupsTotal() {
        return domesticCupsTotal; // Return the total number of domestic cups won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of domestic cups won by the player.
     * Parameter: `domesticCupsTotal` is the new total to be set.
     * Void return type
     */
    public void setDomesticCupsTotal(int domesticCupsTotal) {
        this.domesticCupsTotal = domesticCupsTotal; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of international trophies won by the player.
     * No parameters
     * Return type: int
     */
    public int getInternationalTrophiesTotal() {
        return internationalTrophiesTotal; // Return the total number of international trophies won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of international trophies won by the player.
     * Parameter: `internationalTrophiesTotal` is the new total to be set.
     * Void return type
     */
    public void setInternationalTrophiesTotal(int internationalTrophiesTotal) {
        this.internationalTrophiesTotal = internationalTrophiesTotal; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of UEFA continental trophies won by the player.
     * No parameters
     * Return type: int
     */
    public int getTotalUEFAContinentalTrophies() {
        return totalUEFAContinentalTrophies; // Return the total number of UEFA continental trophies won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of UEFA continental trophies won by the player.
     * Parameter: `totalUEFAContinentalTrophies` is the new total to be set.
     * Void return type
     */
    public void setTotalUEFAContinentalTrophies(int totalUEFAContinentalTrophies) {
        this.totalUEFAContinentalTrophies = totalUEFAContinentalTrophies; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of all continental trophies won by the player.
     * No parameters
     * Return type: int
     */
    public int getTotalContinentalTrophies() {
        return totalContinentalTrophies; // Return the total number of all continental trophies won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of all continental trophies won by the player.
     * Parameter: `totalContinentalTrophies` is the new total to be set.
     * Void return type
     */
    public void setTotalContinentalTrophies(int totalContinentalTrophies) {
        this.totalContinentalTrophies = totalContinentalTrophies; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of friendly cups won by the player.
     * No parameters
     * Return type: int
     */
    public int getFriendlyCupsTotal() {
        return friendlyCupsTotal; // Return the total number of friendly cups won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of friendly cups won by the player.
     * Parameter: `friendlyCupsTotal` is the new total to be set.
     * Void return type
     */
    public void setFriendlyCupsTotal(int friendlyCupsTotal) {
        this.friendlyCupsTotal = friendlyCupsTotal; // Assign the provided total to the player's record
    }

    /**
     * Method - Getter
     * Gets the total number of individual trophies won by the player.
     * No parameters
     * Return type: int
     */
    public int getTotalIndividualTrophies() {
        return totalIndividualTrophies; // Return the total number of individual trophies won by the player
    }

    /**
     * Method - Setter
     * Sets the total number of individual trophies won by the player.
     * Parameter: `totalIndividualTrophies` is the new total to be set.
     * Void return type
     */
    public void setTotalIndividualTrophies(int totalIndividualTrophies) {
        this.totalIndividualTrophies = totalIndividualTrophies; // Assign the provided total to the player's record
    }

}