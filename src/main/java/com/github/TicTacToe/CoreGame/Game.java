package com.github.TicTacToe.CoreGame;

public class Game {

    private final UserInputReader userInputReader;
    private final GameBoard board;
    private Player firstPlayer;
    private Player secondPlayer;
    private Player activePlayer;
    private int moveCount = 1;

    public Game() {
        this.userInputReader = new UserInputReader();
        this.board = new GameBoard(3, 3);
    }

    public void run() {
        initializePlayers();

        while (!board.isVictoryOrDraw()) {
            System.out.printf("Player: %s, Move number: %d \n", activePlayer.toString(), moveCount);
            System.out.println(board.toString());
            Coordinates move;
            move = getCoordinatesFromPlayer();
            board.takeField(move, activePlayer.getSYMBOL());
            moveCount++;
        }
        System.out.printf("Player %s wins!", activePlayer.toString());

    }

    private Coordinates getCoordinatesFromPlayer() {
        System.out.println("Type coordinates (X,Y):");
        String coordinatesLine = userInputReader.readLine();
        String[] coordinatesSplit = coordinatesLine.split(",");
        return new Coordinates(Integer.parseInt(coordinatesSplit[0]), Integer.parseInt(coordinatesSplit[1]));
    }

    private void switchPlayers() {
        if (activePlayer.equals(firstPlayer)) {
            activePlayer = secondPlayer;
        } else {
            activePlayer = firstPlayer;
        }
    }

    private void initializePlayers() {
        System.out.println("Player O name:");
        String firstPlayerName = userInputReader.readLine();
        firstPlayer = new Player(firstPlayerName, Symbol.CIRCLE);
        System.out.println("Player X name:");
        String secondPlayerName = userInputReader.readLine();
        secondPlayer = new Player(secondPlayerName, Symbol.CROSS);

        activePlayer = firstPlayer;

    }
}
