package com.example.cyrilfranciscoandroid.business;

import java.util.List;

public class BoardGame {
    private int id;
    private String name;
    private Type type;
    private List<Game> games;

    public BoardGame(String name, Type type, List<Game> games) {
        this.name = name;
        this.type = type;
        this.games = games;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                '}';
    }
}
