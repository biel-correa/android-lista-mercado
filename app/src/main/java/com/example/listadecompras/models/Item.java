package com.example.listadecompras.models;

public class Item {
    private int Id;
    private String Name;
    private String Description;
    private double Price;

    public Item(int id, String name, double price, String description) {
        Id = id;
        Name = name;
        Price = price;
        Description = description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return Price;
    }

    public String getFormattedPrice() {
        return String.format("R$ %.2f", Price);
    }

    public void setPrice(double price) {
        Price = price;
    }
}
