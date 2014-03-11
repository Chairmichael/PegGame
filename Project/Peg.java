
import java.lang.Exception;
import java.lang.IllegalArgumentException;

import javax.swing.JComponent;
import java.util.Random;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

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
    protected final int MARGIN = 50;
    protected final int DIAMETER = 50;
    protected final int MULT = 60;
    
    protected double wrapper; 
    protected double coordX;
    protected double coordY;   
    protected Location loc;
    protected Color clr;
    protected Ellipse2D.Double ellipse;
    
    private final Random RAN = new Random();
    private final Color[] COLORS = 
            { RED, BLUE, GREEN, ORANGE };
    
    /**
     * Constructs a <code>Peg</code> object with a <code>Location</code> object. <br />
     * Randomly gives the <code>Peg</code> a color.
     * 
     * @param loc The <code>Location</code> object.
     */
    protected Peg(double wrapper, Location loc)
    {
        this.wrapper = wrapper + MARGIN;
        this.coordX = loc.x * MULT + MARGIN + wrapper;
        this.coordY = loc.y * MULT + MARGIN;
        this.loc = loc;
        this.clr = COLORS[RAN.nextInt(4)];
    }
    
    /**
     * Constucts a <code>Peg</code> object with a <code>Location</code> object
     * and <code>Color</code> object for the color.
     * 
     * @param loc the <code>Location</code> object.
     * @param clr the <code>Color</code> object.
     */
    protected Peg(double wrapper, Location loc, Color clr)
    {
        if (!(clr.equals(RED) || clr.equals(BLUE) || 
               clr.equals(GREEN) || clr.equals(ORANGE)))
            throw new IllegalArgumentException
                   ("The color must be RED, BLUE, GREEN, or ORANGE.");
        this.wrapper = wrapper + MARGIN;
        this.coordX = loc.x * MULT + MARGIN + wrapper;
        this.coordY = loc.y * MULT + MARGIN;
        this.loc = loc;
        this.clr = clr;
    }
    
    /**
     * The method to paint the component to be overriden.
     * 
     * @param the current <code>Graphics</code> object.
     */
    protected void paintComponent(Graphics g) { }
    
    /**
     * Gets the <code>Location</code> object associated with this object.
     * 
     * @return the <code>Location</code> object associated with this object.
     */
    public Location getLoc()
    {
        return loc;
    }
}
