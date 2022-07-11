package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Bugatti", 1337);
        ElectricCar electricCar = new ElectricCar("Lada", 228, 1000);

        Car anonymous = new Car("Mazda", 1448) {
            @Override
            public void move() {
                System.out.println("OOo-ram-zam-zam");
            }
        };

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(electricCar);
        cars.add(anonymous);

        showCarInfo(cars);
    }

    public static void showCarInfo(List<? extends Car> list) {
        for (Car car : list) {
            car.move();
        }
    }
}