package VehicleViews.DataObjects;

/**
 * Created by orkoman on 18.10.2014.
 */
public class CarViewDataObject extends VehicleViewDataObject {

    private int m_seats = 0;

    public CarViewDataObject(String name, int maxSpeed, int seats)
    {
        super(name,maxSpeed);
        m_seats = seats;
    }

    public int getSeats() {
        return m_seats;
    }
}
