package VehicleViews.DataObjects;

import BusinessLogic.Types.MotorcycleType;

/**
 * Created by orkoman on 18.10.2014.
 */
public class MotorcycleViewDataObject extends VehicleViewDataObject {
    private MotorcycleType m_type;
    private int m_crashCount = 0;

    public MotorcycleViewDataObject(String name, int maxSpeed, MotorcycleType type, int crashCount)
    {
        super(name,maxSpeed);
        m_type = type;
        m_crashCount = crashCount;
    }

    public MotorcycleType getType() {
        return m_type;
    }

    public int getCrashCount() {
        return m_crashCount;
    }
}
