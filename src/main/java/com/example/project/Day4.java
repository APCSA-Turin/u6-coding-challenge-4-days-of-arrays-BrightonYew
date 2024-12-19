package com.example.project;
import java.util.Random;

public class Day4 {

    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int DistanceTraveled;

        private int runIndex;
        private int restIndex;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            DistanceTraveled = 0;

            runIndex = 0;
            restIndex = 0;
        }

        public String getName() {
            return name;
        }

        public int getDistanceTraveled(){ // this method is required
            return DistanceTraveled;
        }
        
        public void simulateSecond(){ // this method is required but not tested
            if (runIndex + 1 <= runDuration) { //ses if it can still run, else, rest
                DistanceTraveled += speed;
                runIndex++;
            } else {
                restIndex++;
            }
            if (restIndex == restDuration) { //checks if it is done resting
                runIndex = 0;
                restIndex = 0;
            }
        }
    }

    public static String simulateRace(int time, Reindeer[] reindeers) { // you will be tested on this method
        for (int second = 0; second <= time; second++) { //simulates each second for each reindeer
            for (int i = 0; i < reindeers.length; i++) {
                reindeers[i].simulateSecond();
            }
        }
        int highestDistance = 0;
        String winnerName = "";
        for (int i = 0; i < reindeers.length; i++) { //checks who has the highest distance
            if (reindeers[i].getDistanceTraveled() > highestDistance) {
                highestDistance = reindeers[i].getDistanceTraveled();
                winnerName = reindeers[i].getName();
            }
        }
        return winnerName;
    }

    public static void main(String[] args) { // for testing purposes
        Day4.Reindeer[] reindeers = {
            new Day4.Reindeer("Dasher", 100, 5, 2),
            new Day4.Reindeer("Dancer", 120, 4, 3),
            new Day4.Reindeer("Prancer", 110, 6, 1)
        };
        String winner = simulateRace(10, reindeers);
        System.out.println(winner);
    }
}
