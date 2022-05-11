package com.view;

import com.model.*;

public class ConsoleWriter {
    public void printResults(String winner) {
        System.out.println("Winner is: " + winner + "!");
    }

    public void printError(Point p) {
        System.out.printf("Please put correct coordinates from 0 to 2,%ncurrent: x = %d, y = %d", p.x(), p.y());
    }

    public void printGameField(GameField g) {
        for (int i = 0; i < g.gameField().length; i++) {
            StringBuilder oneLine = new StringBuilder();
            for (int j = 0; j < g.gameField()[i].length; j++) {
                oneLine.append(g.gameField()[i][j] == null ? "   " : " " + g.gameField()[i][j] + " ");
                if (j != g.gameField()[i].length - 1) {
                    oneLine.append("|");
                }
            }
            System.out.println(oneLine);
            if (i != g.gameField().length - 1) {
                System.out.println("-".repeat(11));
            }
        }
        System.out.println();
    }
}
