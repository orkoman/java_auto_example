package BusinessLogic;

import BusinessLogic.Abstract.Vehicle;
import BusinessLogic.Interfaces.ICarController;

/**
 * Created by orkoman on 18.10.2014.
 */
public class Car extends Vehicle {
    protected int m_seats = 0;

    protected ICarController m_controller;

    public Car(ICarController controller)
    {
        m_controller = controller;

        //input();
    }

    public void updateModel(String name,int maxSpeed,int seats)
    {
        m_name = name;
        m_maxSpeed = maxSpeed;
        m_seats = seats;
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
            m_controller.showFullInformation(m_name, m_maxSpeed, m_seats, m_rented);
        }catch (Exception e)
        {
            return false;
        }

        return true;
    }

}
