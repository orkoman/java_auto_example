package BusinessLogic.Interfaces;

import BusinessLogic.Types.MotorcycleType;

/**
 * Created by orkoman on 18.10.2014.
 */
public interface IMotorcycleController
{
    void showFullInformation(String name, int maxSpeed, MotorcycleType type, int crashCount, boolean rented);
    void inputInformation();
}
