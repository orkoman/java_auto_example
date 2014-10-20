package BusinessLogic.Abstract; /**
 * Created by orkoman on 18.10.2014.
 */

import java.lang.*;

public abstract class Vehicle {
    protected String m_name;
    protected int m_maxSpeed;
    protected boolean m_rented = false;

    public abstract boolean input();
    public abstract boolean show();

    public boolean rent()
    {
        if (m_rented)
        {
            return false;
        }
        else
        {
            m_rented = true;
            return true;
        }
    }

}
