package main;

import pojos.Journey;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        var journey = new Journey();
        journey.distance = 100d;
        journey.averagespeed = 40d;
        System.out.println(journey.getTime());

//Taking in variable from the keyboard

        var keyboard = new Scanner(System.in);
        var journey1 = new Journey();
        System.out.printf("Distance (miles): ");
        journey1.distance = keyboard.nextDouble();
        System.out.printf("Average speed (miles/hour): ");
        journey1.averagespeed = keyboard.nextDouble();
        System.out.printf("Journey time: %s hours", journey1.getTime());
    }
}
