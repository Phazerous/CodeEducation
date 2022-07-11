package org.example;

public class Car {
    private String carName;
    private int carNumber;

    public Car(String carName, int carNumber) {
        this.carName = carName;
        this.carNumber = carNumber;
    }

    public String toString() {
        return String.format("%s %d", carName, carNumber);
    }

    public void move() {
        System.out.println("Www...");
    }
}
