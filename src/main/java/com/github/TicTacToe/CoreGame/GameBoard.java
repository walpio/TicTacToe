package com.github.TicTacToe.CoreGame;

public class GameBoard {

    private final int WIDTH;
    private final int HEIGHT;
    private final Field[][] FIELDS;

    public GameBoard(int HEIGHT, int WIDTH) {
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        FIELDS = new Field[WIDTH][HEIGHT];
        initFields();
    }

    private void initFields() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                FIELDS[i][j] = new Field(new Coordinates(i, j));
            }
        }
    }

    public void takeField(Coordinates coordinates, Symbol symbol) {
        if (areCoordinatesVaild(coordinates.getX(), coordinates.getY())) {
            Field field = FIELDS[coordinates.getX()][coordinates.getY()];
            if (field.isTaken()) {
                System.out.printf("The field %s is taken", coordinates.toString());
            } else {
                System.out.printf("Coordinates %s are invalid", coordinates);
            }
        }
    }

    public boolean isVictoryOrDraw() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                if (FIELDS[i][j].equals(Symbol.DEFAULT)) {
                    System.out.println(FIELDS[i][j]);
                }
            }
        }
        return false;
    }

    private boolean areCoordinatesVaild(int X, int Y) {
        return X >= 0 && X < WIDTH && Y >= 0 && Y < HEIGHT;
    }

    @Override
    public String toString() {
        StringBuilder boardString = new StringBuilder();
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                boardString.append(FIELDS[i][j].getSymbol().toString());
                boardString.append(" ");
            }
            boardString.append("\n");
        }
        return boardString.toString();
    }
}
