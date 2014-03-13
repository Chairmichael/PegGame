package Test_Cases;

import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.lang.Math;

/**
 * A Move_Tester.
 * 
 * @author Jefferson Henry
 * @version //2014
 */
public class Move_Tester
{
    public static void main()
    {
        int iFr = 3, jFr = 2, iTo = 1, jTo = 0;
        boolean result;
        
        boolean[][] pieces =
        {
            {
                        true
            },
            {
                      false, true
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
        
        result = iFr < 5 && iFr > 0 && iTo < 5 && iTo > 0 && jFr <= iFr && jTo <= iTo && 
                   pieces[iFr][jFr] && !pieces[iTo][jTo] && 
                   pieces[Math.abs(iFr - iTo)][Math.abs(jFr - jTo)] && 
                   (iFr == iTo - 2 || iFr == iTo + 2) && 
                   (jFr == jTo || jFr == jTo - 2 || jFr == jTo + 2);
        
        System.out.println(result);
    }
}
