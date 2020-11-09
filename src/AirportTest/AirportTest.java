package AirportTest;

import model.Plane;
import service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService planeService = new PlaneService();
        Plane plane1 = planeService.create();
        Plane plane2 = planeService.create();
        Plane plane3 = planeService.create();
        planeService.printPlaneInfo(plane1);
        planeService.isMilitary(plane1);
        System.out.println(planeService.newerPlane(plane1, plane2));
        System.out.println(planeService.biggerWingspan(plane1, plane2));
        System.out.println(planeService.highestCost(plane1, plane2, plane3));
        planeService.printsmallestSeats(plane1,plane2,plane3);
        Plane[] planes = new Plane[]{plane1, plane2, plane3};
        planeService.printAllNonMilitaryPlanes(planes);
        planeService.printAllMilitaryPlanesWhichWereInAreMoreThanHundredHours(planes);
        planeService.minimalWeightPlane(planes);
        planeService.printAscendingOrderByYear(planes);
        planeService.printNoNMilitaryBySeatsDescending(planes);
    }
}
