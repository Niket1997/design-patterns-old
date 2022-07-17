package creationalPatterns.factoryPattern.naiveImplementation;

import creationalPatterns.factoryPattern.cockpits.F16Cockpit;
import creationalPatterns.factoryPattern.engines.F16Engine;

public class F16 {
    F16Engine f16Engine;
    F16Cockpit f16Cockpit;

    protected void makeF16() {
        f16Engine = new F16Engine();
        f16Cockpit = new F16Cockpit();
    }

    public void fly() {
        System.out.println("F16 with bad design flying");
    }
}
