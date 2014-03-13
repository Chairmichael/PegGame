package Version_2;


import java.lang.Exception;
import java.lang.IllegalArgumentException;

/**
 * A MainFrame.
 * 
 * @author Jefferson Henry
 * @version //2014
 */
public class MainFrame
{
    /**
     * Constructs s MainFrame.
     */
    public MainFrame()
    {
        
    }
    
    /**
     * Compares an <code>MainFrame</code> object 
     * and <code>Object</code> object. <br />
     * Casts the <code>Object</code> to a <code>MainFrame</code> object.
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
            MainFrame name = obj;
            //TODO: Compare fields
            return false;
        }
        catch (ClassCastException e)
        {
            return false;
            throw new IllegalArgumentException
                    ("Can't cast object - Object not type of MainFrame 
                    or a valid child of a superclass.");
        }
        */
    }
    
    /**
     * Compares two <code>MainFrame</code> objects.
     *
     * @param obj A <code>MainFrame</code> object.
     * @return <code>true</code> or <code>false</code>.
     */
    public boolean equals(MainFrame obj)
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
