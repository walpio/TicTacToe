package com.github.TicTacToe.CoreGame;

public class Coordinates {

    private final int X;
    private final int Y;

    public Coordinates(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    @Override
    public String toString() {
        return String.format("%d, %d", X, Y);
    }
}