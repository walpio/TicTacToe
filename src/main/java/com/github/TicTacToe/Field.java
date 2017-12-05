package com.github.TicTacToe;

public class Field {

    private final Coordinates COORDINATES;
    private Symbol symbol;

    public Field(Coordinates COORDINATES, Symbol symbol) {
        this.COORDINATES = COORDINATES;
        this.symbol = symbol;
    }

    public Field(Coordinates coordinates) {
        this(coordinates, Symbol.DEFAULT);
    }

    public boolean isTaken() {
        return !symbol.equals(Symbol.DEFAULT);
    }
}
