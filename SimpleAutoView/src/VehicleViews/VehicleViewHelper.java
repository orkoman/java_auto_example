package VehicleViews;

import VehicleViews.DataObjects.VehicleViewDataObject;

import java.util.Scanner;

/**
 * Created by orkoman on 19.10.2014.
 */
final class VehicleViewHelper {
    public static void showFullInformationViewBegin(String name, int maxSpeed) {
        System.out.println("-------------------------------");
        System.out.println("Name            : " + name);
        System.out.println("Max speed       : " + maxSpeed);
    }

    public static void showFullInformationViewEnd(boolean rented) {
        if (rented) {
            System.out.println("Rented          : yes");
        }
        else
        {
            System.out.println("Rented          : no");
        }
        System.out.println("-------------------------------");
    }

    public static VehicleViewDataObject inputInformationView()
    {
        try
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("-------------------------------");
            System.out.println("Input new car");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Max speed: ");
            int maxSpeed = scanner.nextInt();
            return new VehicleViewDataObject(name,maxSpeed);
        }
        catch (Exception e)
        {
            System.out.println("Wrong input!!!");
            return null;
        }
    }

    private VehicleViewHelper()
    {}
}
