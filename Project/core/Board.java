package core;


import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * A Board.
 * 
 * @author Jefferson Henry
 * @version 3/13/2014
 */
public class Board extends javax.swing.JComponent
{
    private boolean[][] pieces;
    private final int EXTRA = 20;
    
    /**
     * 
     */
    public Board(boolean[][] pieces)
    {
        this.pieces = pieces;
    }
    
    /**
     * Paints Board.
     * 
     * @param g the current <code>Graphics</code> context.
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new java.awt.BasicStroke(5));
        for (int i = 0; i < pieces.length; i++)
        {
            for (int j = 0; j < pieces[i].length; j++)
            {
                Ellipse2D.Double e = new Ellipse2D.Double(
                        Constants.COORDS_TRI[i][j][0] + EXTRA, Constants.COORDS_TRI[i][j][1],
                        Constants.DIAMETER, Constants.DIAMETER);
                if (pieces[i][j])
                {
                    g2.setColor(java.awt.Color.RED);
                    g2.fill(e);
                    g2.draw(e);
                }
                g2.setColor(java.awt.Color.BLACK);
                g2.draw(e);
            }
        }
        
        /* @Deprecated
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
        g2.setStroke(new java.awt.BasicStroke(5));
        for (Ellipse2D.Double[] arr : Constants.ELLIPSES)
            for (Ellipse2D.Double e : arr)
                g2.draw(e);
        */
    }
    
    /**
     * Checks to see if the coordinates are inside a peg
     * using this algirthm <code>(x - center_x)^2 + (y - center_y)^2 < radius^2</code>.
     * 
     * @param x the x coordinate to test with.
     * @param y the y coordinate to test with.
     * @param pieces the pegs on the board.
     * @return the <code>i</code> and <code>j</code> indexes in that order if there is a peg; 
     *         if a peg is not at the coordinates, <code>null</code> is returned.
     */
    public int[] checkBounds(int x, int y, boolean[][] pieces)
    {
        int[] result = null;
        for (int i = 0; i < pieces.length; i++)
        {
            for (int j = 0; j < pieces[i].length; j++)
            {
                int centerX = Constants.COORDS_TRI[i][j][0];
                int centerY = Constants.COORDS_TRI[i][j][1];
                if (Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2) < Math.pow((Constants.DIAMETER / 2), 2))
                    return result;
            }
        }
        return result;
    }
    
    /**
     * Returns a <code>String</code> representation of the object.
     * 
     * @return a string representation of the object.
     */
    @Override
    public String toString()
    {
        return null; // TODO: Create a string representation of the object
    }
}
