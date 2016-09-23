package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int totalArea = 0;
        for (Rectangle rectangle :
                rectangles) {
            totalArea += rectangle.area();
        }

        return totalArea / rectangles.length;
    }
}
