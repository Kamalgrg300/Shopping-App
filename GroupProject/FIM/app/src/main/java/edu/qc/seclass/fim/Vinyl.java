package edu.qc.seclass.fim;

public class Vinyl extends Item{


    public String getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(String waterResistance) {
        this.waterResistance = waterResistance;
    }

    public String waterResistance; //can be Water Resistant or Water Proof

    public Vinyl (String color, int size, String brand, String type, float price, String waterResistance) {

        this.category = "Vinyl";
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.type = type;
        //this.image = R.drawable.vinyl_image;
        this.waterResistance = waterResistance;

    }//constructor

}
