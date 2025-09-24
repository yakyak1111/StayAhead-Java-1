package main;

import pojos.RightAngleTraingle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var triangle = new RightAngleTraingle();
        System.out.printf("Length of opp side: ");
        triangle.opposite = keyboard.nextDouble();
        System.out.printf("Length of adjacent side: ");
        triangle.adjacent = keyboard.nextDouble();

        System.out.printf("Unknown angle: %.2f\n", triangle.unknownAngle());
        System.out.printf("Unknown side:  %.2f\n", triangle.unknownSide());
    }
}
