package core;


import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.util.ArrayList;

/**
 * A Engine.
 * 
 * @author Jefferson Henry
 * @version 3/13/2014
 */
public class Engine implements Resetable
{
    private boolean[][] pieces = 
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
    
    private ArrayList<boolean[][]> prevBoards;
    private boolean gameOver = false;
    public int[] selected = {-1, -1};
    
    /**
     * Tests if a peg can be moved from an array index, to an array index.
     * 
     * @param iFr the first array index from.
     * @param jFr the second array index from.
     * @param iTo the first array index to.
     * @param jTo the second array index to.
     * @return <code>true</code> or <code>false</code>.
     */
    public boolean canMove(int iFr, int jFr, int iTo, int jTo)
    {
        if (iFr < 5 && iFr >= 0 && iTo < 5 && iTo >= 0 && jFr <= iFr && jTo <= iTo)
        {   // Handle invalid method input and make sure j is not larger than i.
            //System.out.println("- (iFr + iTo) / 2.0 = " + (iFr + iTo) / 2.0);
            //System.out.println("- (jFr + jTo) / 2.0 = " + (jFr + jTo) / 2.0);
            if (((iFr + iTo) / 2.0 % 1 == 0.0) && ((jFr + jTo) / 2.0 % 1 == 0.0))
            {   // Pegs must be inline to move.
                for (int[] arr : Constants.MOVE_EXECPTIONS)
                    for (int i = 0; i < arr.length; i++)
                        if (iFr == arr[0] && jFr == arr[1] && iTo == arr[2] && jTo == arr[3])
                            return false;
                if (pieces[iFr][jFr] && !pieces[iTo][jTo] && pieces[(iFr + iTo) / 2][(jFr + jTo) / 2])
                {   // Must have a peg from, in middle, and not where the peg is moving.
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Moves a peg to a certain postion and removes the jumped peg.
     * 
     * @param iFr the first array index from.
     * @param jFr the second array index from.
     * @param iTo the first array index to.
     * @param jTo the second array index to.
     */
    public void move(int iFr, int jFr, int iTo, int jTo)
    {
        System.out.println(" iFr=" + iFr + ",jFr=" + jFr);
        System.out.println(" iTo=" + iTo + ",jTo=" + jTo);
        pieces[(iFr + iTo) / 2][(jFr + jTo) / 2] = false;
        pieces[iFr][jFr] = false;
        pieces[iTo][jTo] = true;
        selected[0] = -1;
        selected[1] = -1;
    }
    
    /**
     * Determines if the game is over.
     * If no peg can move to a valid position on the board, the game is over.
     * 
     * @return if the game is over.
     */
    public boolean isGameOver()
    {
        for (int i = 0; i < pieces.length - 1; i++)
            for (int j = 0; j < pieces[i].length - 1; j++)
                for (int[] arr : getValPos(i, j))
                    if (canMove(i, j, arr[0], arr[1]))
                        return false;
        return true;
    }
    
    /**
     * Gets all valid position around a peg that will not cause 
     * out of bounds exceptions when used with the pieces array.
     * 
     * @return all the valid positions.
     */
    public int[][] getValPos(int i, int j)
    {
        int[][] array =
        {
            {i, j + 2},
            {i + 2, j + 2},
            {i + 2, j},
            {i, j - 2},
            {i - 2, j - 2},
            {i - 2, j}
        };
        
        for (int k = 0; k < array.length; k++)
        {
            if (array[k][0] < 0)
            // If i position is below 0, then
                array[k] = null;
            else if (array[k][1] < 0)
            // If j position is below 0, then
                array[k] = null;
            else if (array[k][0] > Constants.PIECES.length - 1)
            // If i position is too large, then
                array[k] = null;
            else if (array[k][0] == 0 && array[k][1] > 0) array[k] = null;
            else if (array[k][0] == 1 && array[k][1] > 1) array[k] = null;
            else if (array[k][0] == 2 && array[k][1] > 2) array[k] = null;
            else if (array[k][0] == 3 && array[k][1] > 3) array[k] = null;
            else if (array[k][0] == 4 && array[k][1] > 4) array[k] = null;
            // If j position is too large, then
            else if (pieces[array[k][0]][array[k][1]])
            // If position has a peg, then
                array[k] = null;
            else if (!pieces[(i + array[k][0]) / 2][(i + array[k][1]) / 2])
            // If there is not a peg to jump over, then
                array[k] = null;
        }
    
        int count = 0;
        for (int k = 0; k < array.length; k++)
            if (array[k] != null)
                count++;
        
        int[][] result = new int[count][2];
        int l = 0;
        for (int k = 0; k < array.length; k++)
            if (array[k] != null)
            {
                result[l] = array[k];
                l++;
            }
        System.out.println("-   Valid positions   -");
        for (int[] arr : result) System.out.println("-     i=" + arr[0] + ",j=" + arr[1]);
        return result;
    }
    
    /**
     * Gets the board pieces.
     * 
     * @return a 2D array of <code>boolean</code>s (pegs).
     */
    public boolean[][] getBoard()
    {
        return pieces;
    }
    
    /**
     * Determines if a number has a decimal. <br />
     * Will return <code>false</code> if <code>14.0</code>.
     * Will return <code>true</code> if <code>14.1</code>.
     * 
     * @param num a number.
     * @return <code>true</code> or <code>false</code>.
     */
    @Deprecated
    public static boolean hasDec(double num)
    {
        return !((int) num == num);
    }
    
    /**
     * Finds the peg that is in between two pegs.
     * 
     * @param iFr the first array index from.
     * @param jFr the second array index from.
     * @param iTo the first array index to.
     * @param jTo the second array index to.
     * @return the <code>i</code> and <code>j</code> indexes.
     */
    @Deprecated
    public static int[] getMiddle(int iFr, int jFr, int iTo, int jTo)
    {
        int[] result = {(iFr + iTo) / 2, (jFr + jTo) / 2};
        return result;
    }
    
    /**
     * Tests to see if a number is negative.
     * 
     * @param num the number to test.
     * @return <code>true</code> or <code>false</code>.
     */
    public static boolean hasNegative(int num)
    {
        return num < 0;
    }
    
    /**
     * Tests to see if any numbers in an array is negative.
     * 
     * @param num the interage array to test.
     * @return <code>true</code> or <code>false</code>.
     */
    public static boolean hasNegative(int[] nums)
    {
        for (int num : nums) if (num < 0) return true;
        return false; 
    }
    
    /**
     * Resets the booleans in the <code>pieces</code> array.
     */
    @Override
    public void resetAll()
    {
        // Set board to defualt
        this.pieces = Constants.PIECES;
        
        /* @Deprecated
        for (boolean[] array : pieces)
            for (boolean peg : array)
                peg = true;
        pieces[0][0] = false;
        */
    }
}
