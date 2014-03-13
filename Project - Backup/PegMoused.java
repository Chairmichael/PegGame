
import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * A peg that has a mouse over it.
 * 
 * @author Jefferson Henry
 * @version 3/8/2014
 */
public class PegMoused extends Peg
{
    /**
     * Constructs a peg with a mouse over it 
     * with a random <code>Color</code>.
     * See <code>Peg</code>.
     * 
     * @param loc a <code>Location</code> object.
     */
    public PegMoused(double wrp, Location loc)
    {
        super(wrp, loc);
    }
    
    /**
     * Constructs a <code>Peg</code> that is smaller than the
     * normal peg. See <code>Peg</code>.
     * 
     * @param loc a <code>Location</code> object.
     * @param clr a <code>Color</code> object.
     * The color must be RED, BLUE, GREEN, or Orange.
     */
    public PegMoused(double wrp, Location loc, Color clr)
    {
       super(wrp, loc, clr); 
    }
    
    /**
     * Paints an Ellipse that is smaller than normal
     * 
     * @param g the current <code>Graphics</code> object.
     */
    public void paintComponent(Graphics g)
    {
        
    }
}
