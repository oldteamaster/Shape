package org.example;

public abstract class Shape{
    private String name;

    public String getName() {
        return this.name;
    }
    Shape(String name){
        this.name = name;
    }
}