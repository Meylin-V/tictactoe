package com.controller;

import com.model.GameField;
import com.model.Mark;
import com.model.Player;
import com.model.Point;
import com.view.ConsoleReader;
import com.view.ConsoleWriter;

public record MoveController(GameField gameField) {

    public void setMark(Point p, Mark m, ConsoleWriter consoleView) {
        gameField.gameField()[p.x()][p.y()] = m;
        consoleView.printGameField(gameField);
    }

    public Point getCoordinates(Player player, ConsoleWriter consoleWriter, ConsoleReader consoleReader) {
        Point point = consoleReader.readCoordinates(player);
        while (!Checker.checkCoordinates(point) || !Checker.isEmptyCell(point, gameField)) {
            consoleWriter.printError(point);
            point = consoleReader.readCoordinates(player);
        }
        return point;
    }
}
