import java.awt.Point;

/**
 * A class that has the point of a place on the board and if it has a <code>Peg</code>.
 * 
 * @author Jefferson Henry
 * @version 3/6/2014
 */
public class Location extends Point
{
    boolean containsPeg;
    
    /**
     * Constucts a Location with the <code>Point</code> constructor and a boolean.
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
     * @return <code>true</code> if there is a <code>Peg</code> in the 
     * <code>Point</code> and <code>false</code> if there ins't
     */
    public boolean hasPeg()
    {
        return containsPeg;
    }
    
    /**
     * Creates and returns a representation of this object as a <code>String</code>.
     * 
     * @return The <code>x</code> and <code>y</code> coordinate, 
     * and if the <code>Point</code> contains a <code>Peg</code>
     */
    public String toString()
    {
        return "(" + this.x + "," + this.y + ") " + (containsPeg ? "Has peg." : "Not peg") + ".";
    }
    
    /**
     * Determines if the two <code>Location</code> objects have the same fields.
     * 
     * @param loc The <code>Location</code> object to be compared.
     * @return <code>true</code> or <code>false</code>.
     */
    public boolean equals(Location loc)
    {
        return (this.x == loc.x) && (this.y == loc.y) && (this.containsPeg == loc.containsPeg);
    }
    
    /**
     * Determines if the <code>Point</code> object and the 
     * <code>Location</code> object have the same x and y coordinates.
     * 
     * @param pnt The <code>Point</code> object to be compared.
     * @return <code>true</code> or <code>false</code>.
     */
    public boolean equals(Point pnt)
    {
        return (this.x == pnt.x) && (this.y == pnt.y);
    }
}
