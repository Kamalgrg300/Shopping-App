package edu.qc.seclass.fim;

public class Laminate extends Item{

    public String waterResistance;

    public String getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(String waterResistance) {
        this.waterResistance = waterResistance;
    }

    public Laminate (String color, int size, String brand, String type, float price, String waterResistance) {

        this.category = "Laminate";
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.type = type;
        //this.image = R.drawable.laminate_image;
        this.waterResistance = waterResistance;

    }//constructor

    public Laminate () {};

}
