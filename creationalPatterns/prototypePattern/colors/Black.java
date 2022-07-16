package creationalPatterns.prototypePattern.colors;

import creationalPatterns.prototypePattern.prototypes.Color;

public class Black extends Color {
    public Black() {
        this.colorName = "Black";
    }

    @Override
    public void addColor() {
        System.out.println("Black color added");
    }
}
