package com.github.TicTacToe;

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
            System.out.printf("Player: %s, Move number: %d", activePlayer.toString(), moveCount);
            System.out.println(board.toString());
            switchPlayers();
            moveCount++;
        }
        System.out.printf("Player %s wins!", activePlayer.toString());
        
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
        firstPlayer = new Player(secondPlayerName, Symbol.CROSS);

        activePlayer = firstPlayer;

    }
}
