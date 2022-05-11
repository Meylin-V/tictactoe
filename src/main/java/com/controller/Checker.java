package com.controller;

import com.model.GameField;
import com.model.Mark;
import com.model.Player;
import com.model.Point;

public class Checker {
    public static boolean checkCoordinates(Point p) {
        return p.x() >= 0 && p.y() >= 0 && p.x() <= 2 && p.y() <= 2;
    }

    public static boolean isEmptyCell(Point p, GameField g) {
        return g.gameField()[p.x()][p.y()] == null;
    }

    public static boolean isTie(GameField gameField) {
        for (Mark[] row : gameField.gameField()) {
            for (Mark one : row) {
                if (one == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isWinner(GameField g, Player player, Point p) {
        return checkRow(g, player.mark(), p.x()) || checkCol(g, player.mark(), p.y()) || checkDiag(g, player.mark()) || checkReversedDiag(g, player.mark());
    }

    private static boolean checkRow(GameField g, Mark mark, int x) {
        return mark.equals(g.gameField()[x][0]) && mark.equals(g.gameField()[x][1]) && mark.equals(g.gameField()[x][2]);
    }

    private static boolean checkCol(GameField g, Mark mark, int y) {
        return mark.equals(g.gameField()[0][y]) && mark.equals(g.gameField()[1][y]) && mark.equals(g.gameField()[2][y]);
    }

    private static boolean checkDiag(GameField g, Mark mark) {
        return mark.equals(g.gameField()[0][0]) && mark.equals(g.gameField()[1][1]) && mark.equals(g.gameField()[2][2]);
    }

    private static boolean checkReversedDiag(GameField g, Mark mark) {
        return mark.equals(g.gameField()[0][2]) && mark.equals(g.gameField()[1][1]) && mark.equals(g.gameField()[2][0]);
    }
}
