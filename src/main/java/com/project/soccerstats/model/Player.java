package com.project.soccerstats.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "players")
public class Player {

    @Id
    private String id;
    private String name;
    private int goals;
    private int assists;
    private int trophiesWon;

    // Constructors, Getters, and Setters
    public Player() {

    }

    public Player(String name, int goals, int assists, int trophiesWon) {
        this.name = name;
        this.goals = goals;
        this.assists = assists;
        this.trophiesWon = trophiesWon;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getTrophiesWon() {
        return trophiesWon;
    }

    public void setTrophiesWon(int trophiesWon) {
        this.trophiesWon = trophiesWon;
    }

}