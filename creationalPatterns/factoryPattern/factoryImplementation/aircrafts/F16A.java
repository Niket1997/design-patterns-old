package creationalPatterns.factoryPattern.factoryImplementation.aircrafts;

import creationalPatterns.factoryPattern.engines.F16AEngine;

public class F16A extends F16 {
    @Override
    public F16 makeF16() {
        super.makeF16();
        engine = new F16AEngine();
        return this;
    }
}
