package creationalPatterns.builderPattern;

import creationalPatterns.builderPattern.houseBuilders.IglooHouseBuilder;
import creationalPatterns.builderPattern.interfaces.IHouseBuilder;

public class Builder {
    public static void main(String[] args) {
        IHouseBuilder iglooHouseBuilder = new IglooHouseBuilder();
        CivilEngineer civilEngineer = new CivilEngineer(iglooHouseBuilder);

        civilEngineer.constructHouse();

        House iglooHouse = iglooHouseBuilder.getHouse();
        System.out.println("Basement: " + iglooHouse.getBasement());
        System.out.println("Structure: " + iglooHouse.getStructure());
        System.out.println("Roof: " + iglooHouse.getRoof());
        System.out.println("Interior: " + iglooHouse.getInterior());
    }
}
