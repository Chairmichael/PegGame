package Old;

 
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.BasicStroke;
import javax.swing.JComponent;

/**
 * A board.
 * 
 * @author Jefferson Henry 
 * @version 3/4/2014
 */
public class Board extends JComponent
{
    // The scale for the dementions.
    // private int s;
    
    private final int MARGIN_0 = 50;
    private final int DIAMETER = 50;
    // The multiplier for the Ellipse coorinates
    private final int MULT = 60;
    
    private double[][] coords = new double[15][2];
    
    /**
     * Draws the board.
     * 
     * @param g2 The current graphics state
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        
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
                
                System.out.println
                        ("Peg at i=" + i  + ", j=" + j + " = " + "(" + x + "," + y + ")");
            }
        }
    }
}
