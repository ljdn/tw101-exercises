package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by No Password on 9/14/2016.
 */
public class NumberGame {
    private int goal = (int) (Math.random()*100);
    private boolean hasWon = false;
    private int count;

    public void Start() {
        Player player = new Player();
        while (!hasWon) {
            player.setGuess();
            count++;
            System.out.println(CheckGuess(player.getGuess(), this.goal));
        }
    }

    private String CheckGuess(int playerGuess, int goal) {
        if (playerGuess > goal) {
            return "Too high! Keep guessing...";
        }
        else if (playerGuess < goal) {
            return "Too low! Keep guessing...";
        }
        else {
            this.hasWon = true;
            return "Correct! Good job...";
        }
    }
}
