 
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A board.
 * 
 * @author Jefferson Henry 
 * @version 3/4/2014
 */
public class Board
{
    // The scale for the dementions.
    // private int s;
    
    private final int MARGIN_0 = 50;
    private final int DIAMETER = 50;
    // The multiplier for the Ellipse coorinates
    private final int MULT = 60;
    
    private double[][] coords = new double[15][2];
    
    /**
     * Constructs a board with a scale of 1.
     */
    public Board()
    {
        //this.s = 1;
    }
    
    /*
     * Constructs a board with a scale of <code>s</code>.
     * @param s The scale
     /
    public Board(int s)
    {
        this.s = s;
    }*/
    
    /**
     * Draws the board.
     * 
     * @param g2 The current graphics state
     */
    public void draw(Graphics2D g2)
    {
        double k = 2.5;
        int l = 0;
        for (int i = 0; i < 5; i++)
        {
            k -= 0.5 * 1.2;
            for (int j = 0; j < i + 1; j++)
            {
                double x = j*MULT + MARGIN_0 + k*MARGIN_0;
                double y = i*MULT + MARGIN_0;
                Ellipse2D.Double e = new Ellipse2D.Double(x, y, DIAMETER, DIAMETER);
                g2.draw(e);
                coords[l][0] = x;
                coords[l][1] = y;
                l++;
            }
        }
    }
}
