package Test_Cases;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/**
 * The normal peg component.
 * 
 * @author Jefferson Henry
 * @version 3/4/2014
 */
public class PegNormal extends JComponent
{  
    final private Color GREEN = Color.GREEN;
    final private Color RED = Color.RED;
    final private Color BLUE = Color.BLUE;
    final private Color YELLOW = Color.YELLOW;
    
    final private double DIAMETER = 75;
    
    private Ellipse2D.Double e;

    public void paintComponent(Graphics g)
    {  
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        
        e = new Ellipse2D.Double(75, 75, DIAMETER, DIAMETER);
        g2.draw(e);
    }
}
