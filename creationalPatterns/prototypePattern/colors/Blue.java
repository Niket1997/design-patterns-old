package creationalPatterns.prototypePattern.colors;

import creationalPatterns.prototypePattern.prototypes.Color;

public class Blue extends Color {
    public Blue() {
        this.colorName = "Blue";
    }

    @Override
    public void addColor() {
        System.out.println("Blue color added");
    }    
}
