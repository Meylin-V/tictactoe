package com.view;

import com.model.Player;
import com.model.Point;

import java.util.Scanner;

public class ConsoleReader {
    public Point readCoordinates(Player player) {
        System.out.println("Current player: " + player.mark());
        int x = readParam("X");
        int y = readParam("Y");
        return new Point(x, y);
    }

    private int readParam(String mark) {
        Scanner in = new Scanner(System.in);
        System.out.print("Move to " + mark + ": ");
        return in.nextInt();
    }
}
