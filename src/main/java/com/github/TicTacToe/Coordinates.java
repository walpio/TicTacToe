package com.github.TicTacToe;

public class Coordinates {

    private final byte X;
    private final byte Y;

    public Coordinates(byte x, byte y) {
        this.X = x;
        this.Y = y;
    }

    public byte getX() {
        return X;
    }

    public byte getY() {
        return Y;
    }
}