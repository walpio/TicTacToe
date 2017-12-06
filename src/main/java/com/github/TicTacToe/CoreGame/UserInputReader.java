package com.github.TicTacToe.CoreGame;

import java.util.Scanner;

public class UserInputReader {

    private final Scanner SCANNER;

    public UserInputReader() {
        SCANNER = new Scanner(System.in);
    }

    public String readLine() {
        return SCANNER.nextLine();
    }
}
