package com.aljoschazoeller.java.domain.base;

public class Vehicle {
    protected String manufacturer;
    protected String model;
    protected int yearOfManufacture;
    protected int maxPassengers;

    public void printVehicle() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", maxPassengers=" + maxPassengers +
                '}';
    }
}
