package com.aljoschazoeller.java.domain.base;

public class Motorcycle extends Vehicle {
    private String type;
    private boolean canAttachSidecar = false;

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "type='" + type + '\'' +
                ", canAttachSidecar=" + canAttachSidecar +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", maxPassengers=" + maxPassengers +
                '}';
    }
}
