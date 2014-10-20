import AutoController.CarController;
import AutoController.Interfaces.IVehicleController;
import AutoController.MotorcycleController;
import AutoController.VehicleControllerManager;
import VehicleViews.MenuView;

/**
 * Created by orkoman on 19.10.2014.
 */
public class MenuController {
    MenuView menuView;

    public MenuController()
    {
        menuView = new MenuView();
    }

    public void show()
    {
        boolean m_end = false;

        while (!m_end) {
            menuView.showMenuView();
            int choice = menuView.showInputView();

            switch (choice)
            {
                case 0:
                    m_end = true;
                    break;

                case 1:
                    menuView.show("Show all vehicles");
                    System.out.println();
                    for(int n=0;n < VehicleControllerManager.getCount();n++)
                    {
                        IVehicleController vehicleController = VehicleControllerManager.getVehicle(n);
                        vehicleController.showFullInformationView();
                    }

                    break;

                case 2:
                    menuView.show("Input new car");

                    CarController carController = new CarController();
                    carController.inputInformation();
                    VehicleControllerManager.addVehicle(carController);

                    break;
                case 3:
                    menuView.show("Input new motorcycle");

                    MotorcycleController motorcycleController = new MotorcycleController();
                    motorcycleController.inputInformation();
                    VehicleControllerManager.addVehicle(motorcycleController);

                    break;

                case -1:
                    m_end = true;
                    break;

                default:
                    menuView.show("No such menu item");
                    break;
            }

            menuView.showEndMenu();
        }

    }
}
