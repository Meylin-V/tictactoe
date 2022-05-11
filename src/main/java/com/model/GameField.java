package com.model;

public record GameField(Mark[][] gameField) {
    public GameField() {
        this(new Mark[3][3]);
    }
}
