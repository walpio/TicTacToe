package com.github.TicTacToe;

public class Field {

    private final Coordinates COORDINATES;
    private Symbol symbol;

    public Field(Coordinates COORDINATES, Symbol symbol) {
        this.COORDINATES = COORDINATES;
        this.symbol = symbol;
    }
}
