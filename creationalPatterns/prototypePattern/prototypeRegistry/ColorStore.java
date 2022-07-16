package creationalPatterns.prototypePattern.prototypeRegistry;

import java.util.HashMap;
import java.util.Map;

import creationalPatterns.prototypePattern.colors.Black;
import creationalPatterns.prototypePattern.colors.Blue;
import creationalPatterns.prototypePattern.prototypes.Color;

public class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<String, Color>();

    static {
        colorMap.put("Blue", new Blue());
        colorMap.put("Black", new Black());
    }

    public static Color getColor(String colorName) {
        return (Color) colorMap.get(colorName).clone();
    }
}
