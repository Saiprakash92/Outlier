package com.example.ada.tucanocaffe;

public class Product {
    private final String name;
    private final String description;
    private final int imageResourceId;

    public Product(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
