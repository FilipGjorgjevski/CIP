package org.example.Model;

import jakarta.persistence.Entity;

@Entity
public class Tournament {


    private String id;
    private String name;

    private String gameTitle;

    private int startDate;
    private int endDate;

    private int maxTeams;

    public Tournament() {}
    public Tournament(String id, String name, String gameTitle, int startDate, int endDate, int maxTeams) {
        this.id = id;
        this.name = name;
        this.gameTitle = gameTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxTeams = maxTeams;
    }

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

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public int getMaxTeams() {
        return maxTeams;
    }

    public void setMaxTeams(int maxTeams) {
        this.maxTeams = maxTeams;
    }


}
