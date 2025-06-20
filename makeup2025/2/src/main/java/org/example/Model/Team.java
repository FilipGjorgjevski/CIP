package org.example.Model;

import jakarta.persistence.Entity;

@Entity
public class Team {
    private String id;
    private String name;



    private String country;

    private String coach;

    private int foundedYear;

    public Team() {}
    public Team(String id, String name, String country, String coach, int foundedYear) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.coach = coach;
        this.foundedYear = foundedYear;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }
}
