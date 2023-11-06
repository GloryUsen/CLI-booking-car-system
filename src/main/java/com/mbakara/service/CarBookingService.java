package com.mbakara.service;

import com.mbakara.model.Car;
import com.mbakara.model.User;

public class CarBookingService {
    private Car[] cars;
    private User[] users;
    private int carCount;

    public CarBookingService(int maxCars) {
        cars = new Car[maxCars];
        carCount = 0;
    }

    public void addCar(String carType) {
        Car car = new Car(++carCount, carType);
        cars[carCount - 1] = car;
    }

    public void bookCar(String userId, String carType){
        if (isValidUser(userId)) {
            for (Car car : cars) {
                if (car != null && !car.isBooked() && car.getCarType().equalsIgnoreCase(carType)) {
                    car.book();
                    System.out.println("Car booked successfully.");
                    return;
                }
            }
            System.out.println("Car not available for booking.");
        } else {
            System.out.println("Invalid user ID. Please provide a valid user ID.");
        }
    }

    public boolean isValidUser(String userId) {
        for (User user : users) {
            if (user != null && user.getUserId() == userId) {
                return true;
            }
        }
        return false;
    }
}
