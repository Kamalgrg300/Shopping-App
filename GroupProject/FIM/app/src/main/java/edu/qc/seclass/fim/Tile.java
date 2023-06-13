package edu.qc.seclass.fim;

public class Tile extends Item{

    public String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Tile (String color, int size, String brand, String type, float price, String material) {

        this.category = "Tile";
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.type = type;
        this.image = R.drawable.tile_image;
        this.material = material;

    }//constructor

    public Tile () {};


}//class
