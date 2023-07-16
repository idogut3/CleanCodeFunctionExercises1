//
//  NumberGuessGame.java
//
//  Created by Apollo Zhu on 7/21/16.
//  Copyright © 2015-2016 WWITDC. All rights reserved.
//
package number_guess_game;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void printInstructions() {
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
    }

    private static int getGameResult(int userGuess, int answer) {
        return Math.abs(userGuess - answer);
    }

    private static void printGameResult(int deltaBetweenGuessAndAnswer) {
        System.out.printf("You were off by: %d\n", deltaBetweenGuessAndAnswer);
    }

    private static void printGuessAndAnswer(int userGuess, int answer) {
        System.out.printf("Your guess is: %d\n", userGuess);
        System.out.printf("The number I was thinking of is: %d\n", answer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printInstructions();

        int userGuess = scanner.nextInt();
        int answer = getRandomNumber();
        int gameResult = getGameResult(userGuess, answer);

        printGuessAndAnswer(userGuess, answer);

        printGameResult(gameResult);

    }
}
