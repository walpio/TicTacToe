package com.github.TicTacToe;

public class GameBoard {

    private final int WIDTH;
    private final int HEIGHT;
    private final Field[][] FIELD;

    public GameBoard(int HEIGHT, int WIDTH) {
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        FIELD = new Field[WIDTH][HEIGHT];
        initFields();
    }

    private void initFields() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                FIELD[i][j] = new Field(new Coordinates(i, j));
            }
        }
    }
}
