package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by No Password on 9/14/2016.
 */
public class Troll implements Monster {

    private String name = "Troll";
    private int hitPoints = 40;

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount / 2;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + " " + hitPoints);
    }
}
