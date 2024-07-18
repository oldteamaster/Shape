package org.example;

public class Main {
    public static void main(String[] args) {

        Shape s = new Ring();

        NameShape nameShape = new NameShape();
        System.out.println("Назва фігури - " + nameShape.getNameShape(s));
    }
}