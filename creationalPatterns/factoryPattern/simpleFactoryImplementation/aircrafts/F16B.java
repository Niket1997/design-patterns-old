package creationalPatterns.factoryPattern.simpleFactoryImplementation.aircrafts;

import creationalPatterns.factoryPattern.cockpits.F16Cockpit;
import creationalPatterns.factoryPattern.engines.F16BEngine;

public class F16B extends F16 {
    F16BEngine engine;
    F16Cockpit cockpit;

    public F16B() {
        engine = new F16BEngine();
        cockpit = new F16Cockpit();
    }

    @Override
    public void taxi() {
        System.out.println("F16B is taxing on the runway !");
    }

    @Override
    public void fly() {
        taxi();
        System.out.println("F16B is in the air !");
    }
}
