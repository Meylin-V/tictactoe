package com.model;

import com.controller.GameController;
import com.controller.MoveController;

public class Game {
    private final GameField gameField;
    private final Player playerX;
    private final Player playerO;
    private final GameController gameController;
    private final MoveController moveController;

    public Game() {
        GameField gameField = new GameField();
        this.gameField = gameField;
        this.playerX = new Player(Mark.X);
        this.playerO = new Player(Mark.O);
        this.gameController = new GameController();
        this.moveController = new MoveController(gameField);
    }

    public GameField getGameField() {
        return gameField;
    }

    public Player getPlayerX() {
        return playerX;
    }

    public Player getPlayerO() {
        return playerO;
    }

    public GameController getGameController() {
        return gameController;
    }

    public MoveController getMoveController() {
        return moveController;
    }
}
