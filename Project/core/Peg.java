package core;


import java.lang.Math;
import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * A Peg.
 *                        
 * @author Jefferson Henry
 * @version 3/13/2014
 */
@Deprecated
public class Peg extends javax.swing.JComponent
{    
    private int i;
    private int j;
    private boolean selected;
    
    /**
     * Constructs s Peg.
     */
    public Peg(int i, int j, boolean selected)
    {
        this.i = i;
        this.j = j;
    }
    
    /**
     * 
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new java.awt.BasicStroke(5));
        Ellipse2D.Double e = new Ellipse2D.Double(
                Constants.COORDS_TRI[i][j][0], Constants.COORDS_TRI[i][j][1], 
                Constants.DIAMETER, Constants.DIAMETER);
        g2.fill(e);
        if (selected) 
            g2.setColor(Color.RED);
        else
        {
            g2.setColor(Color.YELLOW);
            g2.fill(e);
        }
            
        g2.draw(e);
    }
            
    /**
     * Compares two <code>Peg</code> objects.
     *
     * @param obj A <code>Peg</code> object.
     * @return <code>true</code> or <code>false</code>.
     */
    public boolean equals(Peg obj)
    {
        if (obj == null) return false;
        
        return Math.round(this.i) - Math.round(obj.i) < 0.5 && Math.round(this.i) - Math.round(obj.i) > -0.5 && 
                Math.round(this.j) - Math.round(obj.j) < 0.5 && Math.round(this.j) - Math.round(obj.j) > -0.5;
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
