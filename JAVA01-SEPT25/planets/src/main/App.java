package main;

import pojos.Planet;

public class App {
    public static void main(String[] args) {

        var earth = new Planet();
        earth.name = "Earth";
        earth.avgDistFromSun = 92_956_050L;
        earth.radius = 3958.8;
        earth.isTerrestrial = true;
        earth.atmosphericConstituents = new String[] {"Nitrogen", "Oxygen"};

        var jupiter = new Planet();
        jupiter.name = "Jupiter";
        jupiter.avgDistFromSun = 483_638_564L;
        jupiter.radius = 43_440.7;
        earth.isTerrestrial = false;
        jupiter.atmosphericConstituents = new String[] {"Hydrogen", "Helium"};

        System.out.printf("Earth's first atmospheric constituent: %s\n", earth.atmosphericConstituents[0]);
        System.out.printf("Jupiter's first atmospheric constituent: %s\n", jupiter.atmosphericConstituents[0]);

        System.out.printf("Earth's circumfrence: %.2f miles\n", earth.cicumfrence());
        System.out.printf("Jupiter's circumfrence: %.2f miles\n", jupiter.cicumfrence());

        System.out.printf("Jupiter is %d x the distance from the sun compared with Earth\n", jupiter.relativeDistFromSunComparedWith(earth));
        System.out.printf("Jupiter is %s x the size of Earth\n", jupiter.relativeDistFromSunComparedWith(earth));
        System.out.printf("Jupiter is the same type of planet as is Earth: %s\n", jupiter.isTheSameTypeAs(earth));
    }
}
