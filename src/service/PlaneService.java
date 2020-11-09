package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {

    public Plane create(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter plane model");
        String model = scanner.next();
        System.out.println("Enter country name");
        String country = scanner.next();
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter hours");
        int hours = scanner.nextInt();
        System.out.println("Enter military");
        boolean military = scanner.hasNext();
        String s = scanner.next();
        System.out.println("Enter engine type");
        String engineType = scanner.next();
        System.out.println("Enter weight");
        int weight = scanner.nextInt();
        System.out.println("Enter wingspan");
        int wingspan = scanner.nextInt();
        System.out.println("Enter top speed");
        int topSpeed = scanner.nextInt();
        System.out.println("Enter seats");
        int seats = scanner.nextInt();
        System.out.println("Enter cost");
        double cost = scanner.nextDouble();
        return new Plane(model,country,year,hours,military,engineType,weight,wingspan,topSpeed,seats,cost);
    }

    public void printPlaneInfo(Plane plane) {
        System.out.println(plane.getModel() + "," + plane.getCountry() + "," + plane.getYear() + "," + plane.getHours() + "," + plane.isMilitary()
                + "," + plane.getEngineType() + "," + plane.getWeight() + "," + plane.getWingspan() + "," + plane.getTopSpeed() + "," +
                plane.getSeats() + "," + plane.getCost());
    }

    public void isMilitary(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println(plane.getCost() + "," + plane.getTopSpeed());
        }
    }

    public Plane newerPlane(Plane plane1, Plane plane2) {
        if (plane1.getYear() >= plane2.getYear()) {
            return new Plane(plane1.getModel(), plane1.getCountry(), plane1.getYear(), plane1.getHours(), plane1.isMilitary(), plane1.getEngineType(), plane1.getWeight(), plane1.getWingspan(), plane1.getTopSpeed(), plane1.getSeats(), plane1.getCost());
        } else {
            return new Plane(plane2.getModel(), plane2.getCountry(), plane2.getYear(), plane2.getHours(), plane2.isMilitary(), plane2.getEngineType(), plane2.getWeight(), plane2.getWingspan(), plane2.getTopSpeed(), plane2.getSeats(), plane2.getCost());
        }
    }

    public String biggerWingspan(Plane plane1, Plane plane2) {
        if (plane2.getWingspan() >= plane1.getWingspan()) {
            return plane2.getModel();
        } else {
            return plane1.getModel();
        }
    }

    public Plane highestCost(Plane plane1, Plane plane2, Plane plane3) {
        if (plane1.getCost() > plane2.getCost() && plane1.getCost() > plane3.getCost() || plane1.getCost() == plane2.getCost() && plane1.getCost() == plane3.getCost()) {
            return new Plane(plane1.getModel(), plane1.getCountry(), plane1.getYear(), plane1.getHours(), plane1.isMilitary(), plane1.getEngineType(), plane1.getWeight(), plane1.getWingspan(), plane1.getTopSpeed(), plane1.getSeats(), plane1.getCost());
        } else if (plane2.getCost() > plane1.getCost() && plane2.getCost() > plane3.getCost()) {
            return new Plane(plane2.getModel(), plane2.getCountry(), plane2.getYear(), plane2.getHours(), plane2.isMilitary(), plane2.getEngineType(), plane2.getWeight(), plane2.getWingspan(), plane2.getTopSpeed(), plane2.getSeats(), plane2.getCost());
        } else {
            return new Plane(plane3.getModel(), plane3.getCountry(), plane3.getYear(), plane3.getHours(), plane3.isMilitary(), plane3.getEngineType(), plane3.getWeight(), plane3.getWingspan(), plane3.getTopSpeed(), plane3.getSeats(), plane3.getCost());
        }
    }

    public void printsmallestSeats(Plane plane1, Plane plane2, Plane plane3) {
        if (plane1.getSeats() < plane2.getSeats() && plane1.getSeats() < plane3.getSeats() || plane1.getSeats() == plane2.getSeats() && plane1.getSeats() == plane3.getSeats()) {
            System.out.println(plane1.getCountry());
        } else if (plane2.getSeats() < plane1.getSeats() && plane2.getSeats() < plane3.getSeats()) {
            System.out.println(plane2.getCountry());
        } else {
            System.out.println(plane3.getCountry());
        }
    }

    public void printAllNonMilitaryPlanes(Plane[] planes) {
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                printPlaneInfo(plane);
                System.out.println("\n");
            }
        }
    }

    public void printAllMilitaryPlanesWhichWereInAreMoreThanHundredHours(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getHours() > 100) {
                printPlaneInfo(plane);
                System.out.println("\n");
            }
        }
    }

    public Plane minimalWeightPlane(Plane[] planes) {
        Plane minimalWeightPlane = planes[0];
        for (Plane plane : planes) {
            if (plane.getWeight() <= minimalWeightPlane.getWeight())
                minimalWeightPlane = plane;
        }

        return minimalWeightPlane;
    }

    public void printAscendingOrderByYear(Plane[] planes) {
        Plane[] planes1 = new Plane[planes.length];

        for (int i = 0; i < planes.length; i++)
            planes1[i] = planes[i];

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < planes1.length - 1; i++) {
                if (planes1[i].getYear() > planes1[i + 1].getYear()) {
                    Plane p = planes1[i];
                    planes1[i] = planes1[i + 1];
                    planes1[i + 1] = p;

                    flag = true;
                }
            }
        }

        for (Plane plane : planes1) {
            printPlaneInfo(plane);
        }
    }

    public void printNoNMilitaryBySeatsDescending(Plane[] planes) {
        Plane[] planes1 = new Plane[planes.length];

        for (int i = 0; i < planes.length; i++) {
            planes1[i] = planes[i];
        }

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < planes1.length - 1; i++) {
                if (planes1[i].getSeats() < planes1[i + 1].getSeats()) {
                    Plane p = planes1[i];
                    planes1[i] = planes1[i + 1];
                    planes1[i + 1] = p;

                    flag = true;
                }
            }
        }

        for (Plane plane : planes1) {
            if (!plane.isMilitary()) {
                printPlaneInfo(plane);
            }
        }
    }
}
