package org.example;

public class ElectricCar extends Car {
    private int chargeTime;

    public ElectricCar(String carName, int carNumber, int chargeTime) {
        super(carName, carNumber);
        this.chargeTime = chargeTime;
    }

    public void move() {
        System.out.println("Ka-chow");
    }
}
