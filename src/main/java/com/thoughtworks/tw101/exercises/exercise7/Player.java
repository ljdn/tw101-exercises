package com.thoughtworks.tw101.exercises.exercise7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by No Password on 9/17/2016.
 */
public class Player {
    private int guess;

    public void setGuess() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your guess: ");
        try {
            this.guess = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public int getGuess() {
        return this.guess;
    }
}
