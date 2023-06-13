package edu.qc.seclass.fim;

public class Item {

    public String name;
    public String category;
    String color;
    String brand;
    int size;

    int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String type;

    float price;
    int image;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Item(String color, String brand, int size, float price, int image) {
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.image = image;
    }


    public Item(String category, String color, String brand, int size, float price, int image){

        this.category= category;
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.image = image;

    }


    public Item() {};
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
