package creationalPatterns.builderPattern.houseBuilders;

import creationalPatterns.builderPattern.House;
import creationalPatterns.builderPattern.interfaces.IHouseBuilder;

public class TipiHouseBuilder implements IHouseBuilder {
    private House house;
    
    public TipiHouseBuilder() {
        house = new House();
    }

    public void buildBasement(){
        house.setBasement("Wooden Poles");
    }

    public void buildStructure(){
        house.setStructure("Wood and Ice");
    }

    public void buildRoof(){
        house.setRoof("Wood, caribou and seal skins");
    }

    public void buildInterior(){
        house.setInterior("Fire Wood");
    }

    public House getHouse() {
        return house;
    }
}
