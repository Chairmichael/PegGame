
import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.BasicStroke;

/**
 * A PegEmpty.
 * 
 * @author Jefferson Henry
 * @version //2014
 */
public class PegEmpty extends Peg
{
    /**
     * Constructs a peg with a mouse over it 
     * with a random <code>Color</code>.
     * See <code>Peg</code>.
     * 
     * @param loc a <code>Location</code> object.
     */
    public PegEmpty(double wrp, Location loc)
    {
        super(wrp, loc);
    }
    
    /**
     * Constructs a <code>Peg</code> that is smaller than the
     * normal peg. See <code>Peg</code>.
     * 
     * @param loc a <code>Location</code> object.
     * @param clr a <code>Color</code> object.
     * The color must be RED, BLUE, GREEN, or ORANGE.
     */
    public PegEmpty(double wrp, Location loc, Color clr)
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
        Graphics2D g2 = (Graphics2D) g;
        ellipse = new Ellipse2D.Double(coordX, coordY, DIAMETER, DIAMETER);
        g2.setStroke(new BasicStroke(5));
        g2.setColor(clr);
        g2.draw(ellipse);
    }
}
