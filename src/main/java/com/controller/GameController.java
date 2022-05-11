package com.controller;

import com.model.GameField;
import com.model.Player;
import com.model.Point;
import com.view.ConsoleReader;
import com.view.ConsoleWriter;

public class GameController {
    private final ConsoleWriter consoleWriter = new ConsoleWriter();
    private final ConsoleReader consoleReader = new ConsoleReader();

    public void playGame(Player playerX, Player playerO, GameField gameField, MoveController moveController) {
        boolean turn = true;
        boolean winner;
        String winnerName = "nobody";
        Point p;
        while (!Checker.isTie(gameField)) {
            if (turn) {
                p = moveController.getCoordinates(playerX, consoleWriter, consoleReader);
                moveController.setMark(p, playerX.mark(), consoleWriter);
                winner = Checker.isWinner(gameField, playerX, p);
                if (winner) {
                    winnerName = "Player " + playerX.mark().toString();
                    break;
                }
                turn = false;
            } else {
                p = moveController.getCoordinates(playerO, consoleWriter, consoleReader);
                moveController.setMark(p, playerO.mark(), consoleWriter);
                winner = Checker.isWinner(gameField, playerO, p);
                if (winner) {
                    winnerName = "Player " + playerO.mark().toString();
                    break;
                }
                turn = true;
            }
        }
        consoleWriter.printResults(winnerName);
    }
}