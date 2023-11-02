import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Country {
    private String name;
    private String player;
    private int age;
    private double[] dArray;

    public Country(String name, String player, int age, double[] dArray) {
        this.name = name;
        this.player = player;
        this.age = age;
        this.dArray = dArray;
    }

    public String getName() {
        return name;
    }

    public String getPlayer() {
        return player;
    }

    public int getAge() {
        return age;
    }

    public double[] getDArray() {
        return dArray;
    }

    public void setDArray(double[] dArray) {
        this.dArray = dArray;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Player: " + player);
        System.out.println("Age: " + age);
        System.out.println("Difficulty Array: " + Arrays.toString(dArray));
    }
}

class Diving {
    private static final int SIZE = 7;
    private Country name;
    private double[] score;
    private double[] difficulty;
    private double cf;
    private double fs;

    public Diving(Country name, double[] difficulty) {
        this.name = name;
        this.difficulty = difficulty;
        score = new double[SIZE];
        cf = 0;
        fs = 0;
    }

    public double[] getScore() {
        return score;
    }

    public double getCf() {
        return cf;
    }

    public void setCf(double cf) {
        this.cf = cf;
    }

    public double getFs() {
        return fs;
    }

    public void setFs(double fs) {
        this.fs = fs;
    }

    public void getSortedList() {
        ArrayList<Double> dummyList = new ArrayList<Double>();
        for (int i = 0; i < SIZE; i++) {
            dummyList.add(score[i]);
        }
        Collections.sort(dummyList);
    }

    public void displayInfo() {
        System.out.println("Country: " + name.getName());
        System.out.println("Player: " + name.getPlayer());
        System.out.println("Age: " + name.getAge());
        System.out.println("Scores: " + Arrays.toString(score));
        System.out.println("Difficulty: " + Arrays.toString(difficulty));
        System.out.println("Carried Forward: " + cf);
        System.out.println("Final Score: " + fs);
    }
}

public class Main {
    private static final int NUM_ROUNDS = 5;
    private static final String[] COUNTRIES = {"China 1", "China 2", "USA 1", "USA 2", "Russia 1", "Russia 2"};

    public static void main(String[] args) {
        Country[] participants = new Country[COUNTRIES.length];
        // Initialize the participants
        // For each participant, create a new Country object and initialize its attributes
        // Add the Country object to the participants array
        for (int i = 0; i < COUNTRIES.length; i++) {
            String name = COUNTRIES[i];
            String player = "Player " + (i+1);
            int age = 20 + i;
            double[] dArray = {2.5, 2.6, 2.7, }
        }
    }
} 
