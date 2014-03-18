package old;


import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.BasicStroke;

/**
 * A PegNormal.
 * 
 * @author Jefferson Henry
 * @version //2014
 */
public class PegNormal extends Peg
{
    /**
     * Constructs a peg with a mouse over it 
     * with a random <code>Color</code>.
     * See <code>Peg</code>.
     * 
     * @param wrp the wapper for pushing over the pegs.
     * @param loc a <code>Location</code> object.
     */
    public PegNormal(double wrp, Location loc)
    {
        super(wrp, loc);
    }
    
    /**
     * Constructs a <code>Peg</code> that is normal is size.
     * See <code>Peg</code>.
     * 
     * @param wrp the wapper for pushing over the pegs.
     * @param loc a <code>Location</code> object.
     * @param clr a <code>Color</code> object.
     * The color must be RED, BLUE, GREEN, or ORANGE.
     */
    public PegNormal(double wrp, Location loc, Color clr)
    {
       super(wrp, loc, clr); 
    }
    
    /**
     * Paints an Ellipse that is normal in size.
     * 
     * @param g the current <code>Graphics</code> object.
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        ellipse = new Ellipse2D.Double(coordX, coordY, DIAMETER, DIAMETER);
        g2.setStroke(new BasicStroke(5));
        g2.setColor(clr);
        if (loc.hasPeg) // Solid ellipse
            g2.fill(ellipse);
            
        g2.draw(ellipse);
    }
    
    /**
     * Compares two <code>PegNormal</code> objects.
     *
     * @param obj A <code>PegNormal</code> object.
     * @return <code>true</code> or <code>false</code>.
     * @throws IllegalArgumentException
     */
    public boolean equals(PegNormal obj)
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
