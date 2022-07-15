package creationalPatterns.builderPattern.houseBuilders;

import creationalPatterns.builderPattern.interfaces.IHouseBuilder;
import creationalPatterns.builderPattern.House;;

public class IglooHouseBuilder implements IHouseBuilder {
    private House house;

    public IglooHouseBuilder() {
        house = new House();
    }

    public void buildBasement(){
        house.setBasement("Ice Bars");
    }

    public void buildStructure(){
        house.setStructure("Ice Blocks");
    }

    public void buildRoof(){
        house.setRoof("Ice Dome");
    }

    public void buildInterior(){
        house.setInterior("Ice Carvings");
    }

    public House getHouse() {
        return house;
    }
}
