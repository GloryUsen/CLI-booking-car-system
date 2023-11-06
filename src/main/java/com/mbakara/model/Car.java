package com.mbakara.model;

public class Car {

    private int id;
    private String carType;
    private boolean isElectric;
    private boolean isBooked;
    private boolean available;

    public Car(int id, String carType, boolean isElectric, boolean isBooked,boolean available) {
        this.id = id;
        this.carType = carType;
        this.isElectric = isElectric;
        this.isBooked = isBooked;
        this.available = available;
    }

    public Car(int id, String carType) {
        this.id = id;
        this.carType = carType;
    }

    public int getId() {
        return id;
    }
    public boolean getAvailable() {
        return available;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarType() {
        return carType;
    }



    public void setCarType(String carType) {
        this.carType = carType;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
    public void book() {
        isBooked = true;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carType='" + carType + '\'' +
                ", isElectric=" + isElectric +
                ", isBooked=" + isBooked +
                '}';
    }
}
