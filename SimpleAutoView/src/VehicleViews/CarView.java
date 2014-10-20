package VehicleViews;

import VehicleViews.DataObjects.CarViewDataObject;
import VehicleViews.DataObjects.VehicleViewDataObject;

import java.util.Scanner;

/**
 * Created by orkoman on 19.10.2014.
 */
public class CarView{
    public void showFullInformationView(String name, int maxSpeed, int seats, boolean rented)
    {
        VehicleViewHelper.showFullInformationViewBegin(name, maxSpeed);
        System.out.println("Number of seats : " + seats);
        VehicleViewHelper.showFullInformationViewEnd(rented);
    }

    public CarViewDataObject inputInformationView()
    {
        try
        {
            VehicleViewDataObject obj = VehicleViewHelper.inputInformationView();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Seats count: ");
            int seats = scanner.nextInt();

            return new CarViewDataObject(obj.getName(),obj.getMaxSpeed(),seats);
        }
        catch (Exception e)
        {
            System.out.println("Wrong input!!!");
            return null;
        }
    }
}
