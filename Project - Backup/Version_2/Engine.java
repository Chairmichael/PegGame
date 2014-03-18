
import java.lang.Exception;
import java.lang.IllegalArgumentException;

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
        return iFr < 5 && iFr > 0 && iTo < 5 && iTo > 0 && jFr <= iFr && jTo <= iTo && 
                pieces[iFr][jFr] && !pieces[iTo][jTo] && 
                pieces[Math.abs(iFr - iTo)][Math.abs(jFr - jTo)] && 
                (iFr == iTo - 2 || iFr == iTo + 2) && 
                (jFr == jTo || jFr == jTo - 2 || jFr == jTo + 2);
    }
    
    /**
     * Resets the booleans in the <code>pieces</code> array.
     */
    @Override
    public void resetAll()
    {
        // Set board to defualt
        for (boolean[] array : pieces)
        {
            for (boolean peg : array)
            {
                peg = true;
            }
        }
        pieces[0][0] = false;
    }
}
