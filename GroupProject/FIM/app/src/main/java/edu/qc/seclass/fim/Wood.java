package edu.qc.seclass.fim;

public class Wood extends Item{

    String woodSpecies;

    public String getWoodSpecies() {
        return woodSpecies;
    }

    public void setWoodSpecies(String woodSpecies) {
        this.woodSpecies = woodSpecies;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    String woodType;

    public Wood(String color, int size, String brand, String type, float price, String woodType, String woodSpecies) {
        this.category = "Wood";
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.type = type;
        this.image = R.drawable.wood_image;
        this.woodSpecies = woodSpecies;
        this.woodType = woodType;

    }


    public Wood ()  {

    }

}//class
