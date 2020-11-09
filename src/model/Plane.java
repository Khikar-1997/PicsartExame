package model;

import java.util.Scanner;

public class Plane {
    //region Properties

    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private String engineType;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    //endregion

    //region Constructors

    public Plane() {

    }

    public Plane(String model, String country, int year, int hours, boolean military, String engineType, int weight, int wingspan, int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.military = military;
        this.engineType = engineType;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }

    //endregion

    //region Getters and Setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() > 0) {
            this.model = model;
        } else {
            System.out.println("The plane must have the model name. Please try again.");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() > 0) {
            this.country = country;
        } else {
            System.out.println("The plane must have name of the country, where it was made. Please try again.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020) {
            this.year = year;
        } else {
            System.out.println("Its not valid value. Please try again.");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10000) {
            this.hours = hours;
        } else {
            System.out.println("Its not valid value. Please try again.");
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if (engineType.length() > 0) {
            this.engineType = engineType;
        } else {
            System.out.println("The plane must have the engine type. Please try again.");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 1000 && weight <= 16000) {
            this.weight = weight;
        } else {
            System.out.println("Its not valid value. Please try again.");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        } else {
            System.out.println("Its not valid value. Please try again.");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed > 0) {
            this.topSpeed = topSpeed;
        } else {
            System.out.println("Its not valid value. Please try again.");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats > 0) {
            this.seats = seats;
        } else {
            System.out.println("Its not valid value. Please try again.");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            System.out.println("Its not valid value. Please try again.");
        }
    }

    //endregion
}
