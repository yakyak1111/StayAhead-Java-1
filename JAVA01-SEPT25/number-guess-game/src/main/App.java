package main;

import pojos.NumberGuessGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var game = new NumberGuessGame();
        while (!game.over){
            System.out.printf("Guess the number between %d and %d: ", NumberGuessGame.MIN, NumberGuessGame.MAX);
            var number  = keyboard.nextInt();
            var message = game.guess(number);
            System.out.println(message);
            System.out.println();
        }
    }
}
