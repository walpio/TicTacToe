package com.github.TicTacToe;

public class Player {

    private final String NAME;
    private final Symbol SYMBOL;

    public Player(String NAME, Symbol SYMBOL) {
        this.NAME = NAME;
        this.SYMBOL = SYMBOL;
    }

    public String getNAME() {
        return NAME;
    }

    public Symbol getSYMBOL() {
        return SYMBOL;
    }
}
