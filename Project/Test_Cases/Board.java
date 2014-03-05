package Test_Cases;

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
    private final int MARGIN_TOP = 10;
    private final int MARGIN_LEFT = 10;
    
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
     * @param g2 The current graphics state
     */
    public void draw(Graphics2D g2)
    {
        
    }
}
