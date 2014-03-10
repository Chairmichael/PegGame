 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

import javax.swing.JComponent;

import java.util.Random;

/**
 * A peg.
 * 
 * @author Jefferson Henry 
 * @version 3/8/2014
 */
public class Peg extends JComponent
{
    protected final Color RED = Color.RED;
    protected final Color BLUE = Color.BLUE;
    protected final Color GREEN = Color.GREEN;
    protected final Color ORANGE = Color.ORANGE;
    protected final int DIAMETER = 30;
    
    protected Location loc;
    protected Color clr;
    
    private final Random RAN = new Random(4);
    private final Color[] COLORS = {
        Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
    
    /**
     * Constructs a <code>Peg</code> object with a <code>Location</code> object.
     * Randomly gives the <code>Peg</code> a color.
     * 
     * @param loc The <code>Location</code> object
     */
    protected Peg(Location loc)
    {
        this.loc = loc;
        this.clr = COLORS[RAN.nextInt()];
    }
    
    /**
     * Constucts a <code>Peg</code> object with a <code>Location</code> object
     * and <code>Color</code> object for the color.
     * 
     * @param loc The <code>Location</code> object
     * @param clr The <code>Color</code> object
     */
    protected Peg(Location loc, Color clr)
    {
        if (!(clr.equals(RED) || clr.equals(BLUE) || 
                clr.equals(GREEN) || clr.equals(ORANGE)))
            throw new IllegalArgumentException(
                    "The color must be RED, BLUE, GREEN, or ORANGE.");
        this.loc = loc;
        this.clr = clr;
    }
    
    /**
     * The method to paint the component to be overriden.
     * 
     * @param the current <code>Graphics</code> object.
     */
    protected void paintComponent(Graphics g) { }
}
