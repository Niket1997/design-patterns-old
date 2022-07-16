package creationalPatterns.prototypePattern;

import creationalPatterns.prototypePattern.prototypeRegistry.ColorStore;

public class Client {
    public static void main(String[] args) {
        ColorStore.getColor("Blue").addColor();
        ColorStore.getColor("Black").addColor();
        ColorStore.getColor("Black").addColor();
        ColorStore.getColor("Blue").addColor();
        ColorStore.getColor("Black").addColor();
    }
}
