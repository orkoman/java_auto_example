package VehicleViews.DataObjects;

/**
 * Created by orkoman on 18.10.2014.
 */
public class VehicleViewDataObject {
    private String m_name = "";
    private int m_maxSpeed = 0;
    private boolean m_rented = false;

    public VehicleViewDataObject(String name, int maxSpeed)
    {
        m_name = name;
        m_maxSpeed = maxSpeed;
    }

    public String getName() {
        return m_name;
    }

    public int getMaxSpeed() {
        return m_maxSpeed;
    }

}
