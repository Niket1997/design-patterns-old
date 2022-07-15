package creationalPatterns.builderPattern;

import creationalPatterns.builderPattern.interfaces.IHousePlan;

public class House implements IHousePlan{
    private String basement;
    private String structure;
    private String roof;
    private String interior;

    public void setBasement(String basement){
        this.basement = basement;
    }

    public String getBasement(){
        return basement;
    }

    public void setStructure(String structure){
        this.structure = structure;
    }

    public String getStructure(){
        return structure;
    }

    public void setRoof(String roof){
        this.roof = roof;
    }

    public String getRoof(){
        return roof;
    }

    public void setInterior(String interior){
        this.interior = interior;
    }

    public String getInterior(){
        return interior;
    }

}
