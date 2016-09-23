package com.thoughtworks.tw101.exercises.exercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by No Password on 9/17/2016.
 */
public class Player {
    private int guess;
    private ArrayList<Integer> guesses = new ArrayList<>();

    public void setGuess() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            try {
                System.out.println("Enter your guess: ");
                this.guess = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("That's not a number! Guess again...");
            } catch (IOException e) {
                e.getMessage();
            }
        }
        guesses.add(guess);
    }

    public int getGuess() {
        return this.guess;
    }

    public void printGuesses() {
        System.out.println("Guesses: " + guesses);
    }
}
