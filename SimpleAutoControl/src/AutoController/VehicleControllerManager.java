package AutoController;

import AutoController.Interfaces.IVehicleController;

import java.util.*;

/**
 * Created by orkoman on 18.10.2014.
 */
public final class VehicleControllerManager {
    private static List<IVehicleController> m_vehicleControllers = new ArrayList <IVehicleController>();

    public static void addVehicle(IVehicleController vehicleController)
    {
        m_vehicleControllers.add(vehicleController);
    }

    public static IVehicleController getVehicle(int index)
    {
        return m_vehicleControllers.get(index);
    }

    public static int getCount()
    {
        return m_vehicleControllers.size();
    }

    private VehicleControllerManager()
    {
    }
}
