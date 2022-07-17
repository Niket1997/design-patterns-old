package creationalPatterns.factoryPattern.factoryImplementation.aircrafts;

import creationalPatterns.factoryPattern.engines.F16BEngine;

public class F16B extends F16 {
    @Override
    public F16 makeF16() {
        super.makeF16();
        engine = new F16BEngine();
        return this;
    }
}
