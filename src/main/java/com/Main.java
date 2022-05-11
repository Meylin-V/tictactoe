package com;

import com.model.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.getGameController().playGame(game.getPlayerX(), game.getPlayerO(), game.getGameField(), game.getMoveController());
    }
}
