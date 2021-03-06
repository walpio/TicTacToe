package com.github.TicTacToe.CoreGame;

public enum Symbol {

    CROSS("X"), CIRCLE("O"), DEFAULT("_");

    private final String SYMBOL;

    Symbol(String SYMBOL) {
        this.SYMBOL = SYMBOL;
    }

    public String getSYMBOL() {
        return SYMBOL;
    }

    @Override
    public String toString() {
        return getSYMBOL();
    }
}