package AutoController;

import AutoController.Interfaces.IVehicleController;
import BusinessLogic.Interfaces.IMotorcycleController;
import BusinessLogic.Types.MotorcycleType;
import VehicleViews.DataObjects.MotorcycleViewDataObject;
import VehicleViews.MotorcycleView;
import BusinessLogic.*;

/**
 * Created by orkoman on 18.10.2014.
 */
public class MotorcycleController implements IMotorcycleController, IVehicleController {
    private Motorcycle m_motorCycle;
    private MotorcycleView m_view;

    public MotorcycleController()
    {
        m_motorCycle = new Motorcycle(this);
        m_view = new MotorcycleView();
    }

    public void showFullInformation(String name, int maxSpeed, MotorcycleType type, int crashCount, boolean rented)
    {
        m_view.showFullInformationView(name, maxSpeed, type,crashCount, rented);
    }

    public void inputInformation()
    {
        MotorcycleViewDataObject obj = m_view.inputInformationView();
        m_motorCycle.updateModel(obj.getName(),obj.getMaxSpeed(),obj.getType(),obj.getCrashCount());
    }

    public void showFullInformationView()
    {
        m_motorCycle.show();
    }
}
