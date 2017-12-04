package com.github.TicTacToe;

public class Field {

    private final Coordinates coordinates;
    private Symbol symbol;

    public Field(Coordinates coordinates, Symbol symbol) {
        this.coordinates = coordinates;
        this.symbol = symbol;
    }
}
