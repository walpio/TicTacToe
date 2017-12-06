package com.github.TicTacToe.CoreGame;

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

    @Override
    public String toString() {
        return String.format("%s", NAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (NAME != null ? !NAME.equals(player.NAME) : player.NAME != null) return false;
        return SYMBOL == player.SYMBOL;
    }

    @Override
    public int hashCode() {
        int result = NAME != null ? NAME.hashCode() : 0;
        result = 31 * result + (SYMBOL != null ? SYMBOL.hashCode() : 0);
        return result;
    }
}
