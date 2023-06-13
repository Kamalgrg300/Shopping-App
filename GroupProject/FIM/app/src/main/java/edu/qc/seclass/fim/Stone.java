package edu.qc.seclass.fim;

public class Stone extends Item {

    public String material;


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public Stone (String color, int size, String brand, String type, float price, String material) {

        this.category = "Stone";
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.type = type;
        this.image = R.drawable.stone_image;
        this.material = material;

    }//constructor


    public Stone () {};



}//class
