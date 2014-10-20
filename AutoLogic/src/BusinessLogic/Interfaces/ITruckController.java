package BusinessLogic.Interfaces;

/**
 * Created by orkoman on 18.10.2014.
 */
public interface ITruckController
{
    void showFullInformation(String name, int maxSpeed, int maxWeight, int axesCount, boolean rented);
    void inputInformation();
}
