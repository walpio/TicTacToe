package com.github.TicTacToe;

public enum Symbol {

    CROSS("X"), CIRCLE("O"), DEFAULT("_");

    private final String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}