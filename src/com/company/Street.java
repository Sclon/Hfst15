package com.company;

import java.util.Stack;

public class Street {
    private Stack<Car> cars;
    private Driveway driveway;

    public Street(Driveway driveway) {
        cars = new Stack<>();
        this.driveway = driveway;
    }

    public void addCar(Car car) {
        cars.push(car);
    }

    public void removeCar() {
        driveway.addCar(cars.pop());
    }

    public void peek() {
        cars.peek();
    }

    @Override
    public String toString() {
        return "" + cars;
    }
}
