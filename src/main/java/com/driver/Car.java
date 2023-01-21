package com.driver;

public class Car extends Vehicle {
    private static int wheels;
    private static String type;
    private static int doors;
    private static int gears;
    private boolean isManual;
    private int currentGear;
    private static int seats;

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public static int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public static String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public static int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public static int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        setGears(gears);
        setDoors(doors);
        setWheels(wheels);
        setManual(isManual);
        setType(type);
        setSeats(seats);
        setCurrentGear(1);
    }

    public void changeGear(int newGear){
        setCurrentGear(newGear);
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
