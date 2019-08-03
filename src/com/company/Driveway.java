package com.company;

import java.util.Stack;

public class Driveway {
    private Stack<Car> cars;
    private Street street;

    public Driveway() {
        street = new Street(this);
        cars = new Stack<>();
    }

    public void addCar(Car car) {
        cars.push(car);
    }

    public void removeCar() {
        cars.pop();
    }

    public void removeCar(Car car) {
        if (peek() == car) {
            cars.pop();
            return;
        }

        int counter = 0;
        while (cars.peek() != car) {
            street.addCar(cars.pop());
            counter++;
        }

        cars.pop();

        for (int i = 0; i < counter; i++) {
            street.removeCar();
        }
    }

    public Car peek() {
        return cars.peek();
    }

    @Override
    public String toString() {
        return "" + cars;
    }
}
