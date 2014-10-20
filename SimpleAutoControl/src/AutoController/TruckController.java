package AutoController;

import AutoController.Interfaces.IVehicleController;
import BusinessLogic.Interfaces.ITruckController;
import BusinessLogic.Truck;
import VehicleViews.DataObjects.TruckViewDataObject;
import VehicleViews.TruckView;

/**
 * Created by orkoman on 19.10.2014.
 */
public class TruckController implements ITruckController, IVehicleController {
    private Truck m_truck;
    private TruckView m_view;

    public TruckController()
    {
        m_truck = new Truck(this);
        m_view = new TruckView();
    }

    public void showFullInformation(String name, int maxSpeed, int maxWeight,int axesCount, boolean rented)
    {
        m_view.showFullInformationView(name, maxSpeed, maxWeight, axesCount, rented);
    }

    public void showFullInformationView()
    {
        m_truck.show();
    }

    public void inputInformation()
    {
        TruckViewDataObject obj = m_view.inputInformationView();
        m_truck.updateModel(obj.getName(),obj.getMaxSpeed(),obj.getMaxWeight(),obj.getAxesCount());
    }
}
