package com.example.cyrilfranciscoandroid.service;

import com.example.cyrilfranciscoandroid.business.Game;
import com.example.cyrilfranciscoandroid.business.Player;
import com.example.cyrilfranciscoandroid.business.Type;

import java.util.ArrayList;
import java.util.List;

public class GameService {

    private static GameService gameService;
    private List<Game> games;
    private List<Player> players;
    private int idCounter = 0;


    private GameService() {
        createData();
    }

    private void createData() {
        games = new ArrayList<>();
        games.add(new Game("Dixit Fake", "Mario"));
        games.add(new Game("Avalon Fake", "Luigi"));
        games.add(new Game("Imaginarium Fake", "Mario"));
        save(games);
        players = new ArrayList<>();
        players.add(new Player("Papier", ));
        players.add(new Player("Cailloux", ));
        players.add(new Player("Feuille", "No one", false));
        save("Who's with me ?", "Pliz I need to know",  answers2);
        List<Type> favoritesTypes = new ArrayList<>();
        favoritesTypes.add(new Type("Aventure"));
        favoritesTypes.add(new Type("role"));
        favoritesTypes.add(new Type("science"));
        save("How old is the captain ?", "You know Y",  answers3);
    }

    public Game save(String name, List<Player> players){
        Game game = new Game(++idCounter, name, players);
        games.add(game);
        return game;
    }
}
