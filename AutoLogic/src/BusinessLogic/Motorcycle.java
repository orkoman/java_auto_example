package BusinessLogic;

import BusinessLogic.Abstract.Vehicle;
import BusinessLogic.Interfaces.IMotorcycleController;
import BusinessLogic.Types.MotorcycleType;

import java.lang.*;

/**
 * Created by orkoman on 18.10.2014.
 */
public class Motorcycle extends Vehicle {
    protected MotorcycleType m_type = MotorcycleType.Chopper;
    protected int m_crashCount = 0;

    protected IMotorcycleController m_controller;

    public Motorcycle(IMotorcycleController controller)
    {
        m_controller = controller;

        //input();
    }

    public void updateModel(String name,int maxSpeed,MotorcycleType type, int crashCount )
    {
        m_name = name;
        m_maxSpeed = maxSpeed;
        m_type = type;
        m_crashCount = crashCount;
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
            m_controller.showFullInformation(m_name,m_maxSpeed,m_type,m_crashCount,m_rented);
        }catch (Exception e)
        {
            return false;
        }

        return true;
    }

}
