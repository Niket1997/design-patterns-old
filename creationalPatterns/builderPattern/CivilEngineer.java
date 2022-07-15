package creationalPatterns.builderPattern;

import creationalPatterns.builderPattern.interfaces.IHouseBuilder;

public class CivilEngineer {
    private IHouseBuilder houseBuilder;

    public CivilEngineer(IHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        houseBuilder.buildBasement();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
