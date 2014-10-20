package BusinessLogic;

import BusinessLogic.Abstract.Vehicle;
import BusinessLogic.Interfaces.ITruckController;

/**
 * Created by orkoman on 18.10.2014.
 */

public class Truck extends Vehicle {
    protected int m_maxWeight = 0;
    protected int m_axesCount = 0;

    protected ITruckController m_controller;

    public Truck(ITruckController controller)
    {
        m_controller = controller;
    }

    public void updateModel(String name,int maxSpeed,int maxWeight, int axesCount)
    {
        m_name = name;
        m_maxSpeed = maxSpeed;
        m_maxWeight = maxWeight;
        m_axesCount = axesCount;
    }

    @Override
    public boolean input()
    {
        try {
            m_controller.inputInformation();
        }catch (Exception e)
        {
            return false;
        }

        return true;
    }

    @Override
    public boolean show() {
        try {
            m_controller.showFullInformation(m_name,m_maxSpeed,m_maxWeight,m_axesCount,m_rented);
        }catch (Exception e)
        {
            return false;
        }

        return true;
    }

}


