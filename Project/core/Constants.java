package core;


import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.awt.geom.Ellipse2D;

/**
 * A abstract class that has only static constant variables.
 * 
 * @author Jefferson Henry
 * @version 3/13/2014
 */
public abstract class Constants
{
    public static final int[][] COORDS_FIL = 
    {
        { 145, 50 },
        { 115, 110 },
        { 175, 110 },
        { 85, 170 },
        { 145, 170 },
        { 205, 170 },
        { 55, 230 },
        { 115, 230 },
        { 175, 230 },
        { 235, 230 },
        { 25, 290 },
        { 85, 290 },
        { 145, 290 },
        { 205, 290 },
        { 265, 290 }
    };
    
    public static final int[][][] COORDS_TRI =
    {
        {
                                    { 145, 50 }
        },
        {
                              { 115, 110 }, { 175, 110 }
        },
        {
                        { 85, 170 }, { 145, 170 }, { 205, 170 }
        },
        {
                  { 55, 230 }, { 115, 230 }, { 175, 230 }, { 235, 230 }       
        },
        {
            { 25, 290 }, { 85, 290 }, { 145, 290 }, { 205, 290 }, { 265, 290 }
        }
    };
    
    public static final boolean[][] PIECES = 
    {
        {
                       false
        },
        {
                     true, true
        },
        {
                  true, true, true
        },
        {
               true, true, true, true
        },
        {
            true, true, true, true, true
        }
    };
    
    public static final Ellipse2D.Double[][] ELLIPSES= 
    {
        {
            new Ellipse2D.Double(COORDS_TRI[0][0][0], COORDS_TRI[0][0][1], 50, 50)
        },
        {
            new Ellipse2D.Double(COORDS_TRI[1][0][0], COORDS_TRI[1][0][1], 50, 50),
            new Ellipse2D.Double(COORDS_TRI[1][1][0], COORDS_TRI[1][1][1], 50, 50)
        },
        {
            new Ellipse2D.Double(COORDS_TRI[2][0][0], COORDS_TRI[2][0][1], 50, 50),
            new Ellipse2D.Double(COORDS_TRI[2][1][0], COORDS_TRI[2][1][1], 50, 50),
            new Ellipse2D.Double(COORDS_TRI[2][2][0], COORDS_TRI[2][2][1], 50, 50)
        },
        {
            new Ellipse2D.Double(COORDS_TRI[3][0][0], COORDS_TRI[3][0][1], 50, 50),
            new Ellipse2D.Double(COORDS_TRI[3][1][0], COORDS_TRI[3][1][1], 50, 50),
            new Ellipse2D.Double(COORDS_TRI[3][2][0], COORDS_TRI[3][2][1], 50, 50),
            new Ellipse2D.Double(COORDS_TRI[3][3][0], COORDS_TRI[3][3][1], 50, 50)
        },
        {
            new Ellipse2D.Double(COORDS_TRI[4][0][0], COORDS_TRI[4][0][1], 50, 50),
            new Ellipse2D.Double(COORDS_TRI[4][1][0], COORDS_TRI[4][1][1], 50, 50),
            new Ellipse2D.Double(COORDS_TRI[4][2][0], COORDS_TRI[4][2][1], 50, 50),
            new Ellipse2D.Double(COORDS_TRI[4][3][0], COORDS_TRI[4][3][1], 50, 50),
            new Ellipse2D.Double(COORDS_TRI[4][4][0], COORDS_TRI[4][4][1], 50, 50)
        }
    };
    
    public static final int[][] MOVE_EXECPTIONS = 
    {
        {4, 0  ,  2, 2},
        {4, 4  ,  2, 0},
        {0, 0  ,  4, 0},
        {0, 0  ,  4, 4},
        {4, 0  ,  4, 4},
        
        {2, 2  ,  4, 0},
        {2, 0  ,  4, 4},
        {4, 0  ,  0, 0},
        {4, 4  ,  0, 0},
        {4, 4  ,  4, 0}
    };
    
    public static final int DIAMETER = 50;
}
