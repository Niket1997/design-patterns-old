package creationalPatterns.factoryPattern.simpleFactoryImplementation.aircrafts;

import creationalPatterns.factoryPattern.cockpits.F16Cockpit;
import creationalPatterns.factoryPattern.engines.F16AEngine;

public class F16A extends F16 {
    F16AEngine engine;
    F16Cockpit cockpit;

    public F16A() {
        engine = new F16AEngine();
        cockpit = new F16Cockpit();
    }

    @Override
    public void taxi() {
        System.out.println("F16A is taxing on the runway !");
    }

    @Override
    public void fly() {
        taxi();
        System.out.println("F16A is in the air !");
    }
}
