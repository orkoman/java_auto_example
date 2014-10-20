package VehicleViews;

import BusinessLogic.Types.MotorcycleType;
import VehicleViews.DataObjects.MotorcycleViewDataObject;
import VehicleViews.DataObjects.VehicleViewDataObject;

import java.util.Scanner;

/**
 * Created by orkoman on 19.10.2014.
 */
public class MotorcycleView {
    public void showFullInformationView(String name, int maxSpeed, MotorcycleType type, int crashCount, boolean rented)
    {
        VehicleViewHelper.showFullInformationViewBegin(name, maxSpeed);
        System.out.println("Type             : " + type.toString());
        System.out.println("Count of crashes : " + crashCount);
        VehicleViewHelper.showFullInformationViewEnd(rented);
    }

    public MotorcycleViewDataObject inputInformationView()
    {
        try
        {
            VehicleViewDataObject obj = VehicleViewHelper.inputInformationView();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Motorcycle type (0 " + MotorcycleType.values()[0] +
                                             ",1 " + MotorcycleType.values()[1] +
                                             ",2 " + MotorcycleType.values()[2] +
                                             "): ");
            int iType = scanner.nextInt();
            MotorcycleType type = MotorcycleType.values()[iType];
            System.out.print("Crashes count: ");
            int crashCount = scanner.nextInt();

            return new MotorcycleViewDataObject(obj.getName(),obj.getMaxSpeed(),type,crashCount);
        }
        catch (Exception e)
        {
            System.out.println("Wrong input!!!");
            return null;
        }
    }
}
