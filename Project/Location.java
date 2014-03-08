import java.awt.Point;

/**
 * A class that has the point of a place on the board and if it has a 
 * 
 * @author Jefferson Henry
 * @version 3/6/2014
 */
public class Location extends Point
{
    boolean containsPeg;
    
    /**
     * Constucts a Location with the Point constructor and a boolean.
     * 
     * @param x The x coordinate
     * @param y The y coordinate
     * @param containsPeg If the <code>Point</code> has a peg
     */
    public Location(int x, int y, boolean containsPeg)
    {
        super(x, y);
        this.containsPeg = containsPeg;
    }
    
    /**
     * Determines if the <code>Point</code> has a peg.
     * 
     * @return True if there is a Peg in the Point and false if there ins't
     */
    public boolean hasPeg()
    {
        return containsPeg;
    }
}
