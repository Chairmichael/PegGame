package Version_2;


import java.lang.Exception;
import java.lang.IllegalArgumentException;

/**
 * A Engine.
 * 
 * @author Jefferson Henry
 * @version //2014
 */
public class Engine
{
    /**
     * Constructs s Engine.
     */
    public Engine()
    {
        
    }
    
    /**
     * Compares an <code>Engine</code> object 
     * and <code>Object</code> object. <br />
     * Casts the <code>Object</code> to a <code>Engine</code> object.
     * 
     * @param obj A <code>Object</code> object.
     * @return <code>true</code> or <code>false</code>.
     */
    public boolean equals(Object obj)
    {
        if (obj == null) throw new IllegalArgumentException
                ("Object can't be null");
        /*
        try
        {
            Engine name = obj;
            //TODO: Compare fields
            return false;
        }
        catch (ClassCastException e)
        {
            return false;
            throw new IllegalArgumentException
                    ("Can't cast object - Object not type of Engine 
                    or a valid child of a superclass.");
        }
        */
    }
    
    /**
     * Compares two <code>Engine</code> objects.
     *
     * @param obj A <code>Engine</code> object.
     * @return <code>true</code> or <code>false</code>.
     */
    public boolean equals(Engine obj)
    {
        if (obj == null) throw new IllegalArgumentException
                ("Object can't be null");
        //TODO: Compare fields
        return false;
    }
    
    /**
     * Returns a <code>String</code> representation of the object.
     * 
     * @return a string representation of the object.
     */
    public String toString()
    {
        return ""; // TODO: Create a string representation of the object
    }
}
