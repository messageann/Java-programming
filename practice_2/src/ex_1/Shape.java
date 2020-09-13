package ex_1;

import java.text.MessageFormat;

public class Shape {
    String figure;

    public String Description (int sides) {
        if (sides == 0) figure = "circle";
        else if (sides == 3) figure = "triangle";
        else if (sides == 4) figure = "square";
        else figure = "... oh, i don't know, what it is";
        return figure;
    }

    public String toString() {
        return MessageFormat.format("Your shape is {0}", figure);
    }
}
