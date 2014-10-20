package VehicleViews;

import VehicleViews.DataObjects.TruckViewDataObject;
import VehicleViews.DataObjects.VehicleViewDataObject;

import java.util.Scanner;

/**
 * Created by orkoman on 19.10.2014.
 */
public class TruckView {
    public void showFullInformationView(String name, int maxSpeed, int maxWeight, int axesCount, boolean rented)
    {
        VehicleViewHelper.showFullInformationViewBegin(name, maxSpeed);
        System.out.println("Max weight      : " + maxWeight);
        System.out.println("Axes count      : " + axesCount);
        VehicleViewHelper.showFullInformationViewEnd(rented);
    }

    public TruckViewDataObject inputInformationView()
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            VehicleViewDataObject obj = VehicleViewHelper.inputInformationView();

            System.out.print("Max weight: ");
            int maxWeight = scanner.nextInt();
            System.out.print("Axes count: ");
            int axesCount = scanner.nextInt();

            return new TruckViewDataObject(obj.getName(),obj.getMaxSpeed(),maxWeight,axesCount);
        }
        catch (Exception e)
        {
            System.out.println("Wrong input!!!");
            return null;
        }
    }
}
