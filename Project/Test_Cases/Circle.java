package Test_Cases;

import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.BasicStroke;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/**
 * A Circle.
 * 
 * @author Jefferson Henry
 * @version //2014
 */
public class Circle extends JComponent
{
    private int x;
    private int y;
    
    public Circle(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void paintComponent(Graphics g)
    {  
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        
        Ellipse2D.Double e = new Ellipse2D.Double(x, x, 50, 50);
        g2.draw(e);
    }
}
