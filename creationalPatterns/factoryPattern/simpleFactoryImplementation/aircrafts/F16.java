package creationalPatterns.factoryPattern.simpleFactoryImplementation.aircrafts;

import creationalPatterns.factoryPattern.cockpits.F16Cockpit;
import creationalPatterns.factoryPattern.engines.F16Engine;

public class F16 {
    F16Engine engine;
    F16Cockpit cockpit;

    public F16() {
        engine = new F16Engine();
        cockpit = new F16Cockpit();
    }

    public void taxi() {
        System.out.println("F16 is taxing on the runway !");
    }

    public void fly() {
        taxi();
        System.out.println("F16 is in the air !");
    }
}
