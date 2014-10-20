package VehicleViews.DataObjects;

/**
 * Created by orkoman on 18.10.2014.
 */
public class TruckViewDataObject extends VehicleViewDataObject {
    private int m_maxWeight = 0;
    private int m_axesCount = 0;

    public TruckViewDataObject(String name, int maxSpeed, int maxWeight, int axesCount)
    {
        super(name,maxSpeed);
        m_maxWeight = maxWeight;
        m_axesCount = axesCount;
    }

    public int getMaxWeight() {
        return m_maxWeight;
    }

    public int getAxesCount() {
        return m_axesCount;
    }
}
