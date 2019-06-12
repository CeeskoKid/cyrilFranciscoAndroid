package com.example.cyrilfranciscoandroid.business;

import java.util.List;

public class Player {
    private int id;
    private String pseudonym;
    private List<Type> favoritesTypes;

    public Player(String pseudonym, List<Type> favoritesTypes) {
        this.pseudonym = pseudonym;
        this.favoritesTypes = favoritesTypes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public List<Type> getFavoritesTypes() {
        return favoritesTypes;
    }

    public void setFavoritesTypes(List<Type> favoritesTypes) {
        this.favoritesTypes = favoritesTypes;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", pseudonym='" + pseudonym + '\'' +
                ", favoritesTypes=" + favoritesTypes +
                '}';
    }
}
