package AutoController;

import AutoController.Interfaces.IVehicleController;
import BusinessLogic.*;
import BusinessLogic.Interfaces.ICarController;
import VehicleViews.DataObjects.CarViewDataObject;
import VehicleViews.CarView;

/**
 * Created by orkoman on 19.10.2014.
 */
public class CarController implements ICarController, IVehicleController {
    private Car m_car;
    private CarView m_view;

    public CarController()
    {
        m_car = new Car(this);
        m_view = new CarView();
    }

    public void showFullInformation(String name, int maxSpeed, int seats, boolean rented)
    {
        m_view.showFullInformationView(name, maxSpeed, seats, rented);
    }

    public void showFullInformationView()
    {
        m_car.show();
    }

    public void inputInformation()
    {
        CarViewDataObject obj = m_view.inputInformationView();
        m_car.updateModel(obj.getName(),obj.getMaxSpeed(),obj.getSeats());
    }
}
