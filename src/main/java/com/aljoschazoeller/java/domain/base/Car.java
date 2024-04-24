package com.aljoschazoeller.java.domain.base;

public class Car extends Vehicle {
    private int numberOfDoors;

    public void printCar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
