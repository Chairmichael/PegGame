package Test_Cases;

import java.lang.Exception;
import java.lang.IllegalArgumentException;

/**
 * A ImNotHere.
 * 
 * @author Jefferson Henry
 * @version 3/12/2014
 */
public class ImNotHere
{
    public static void main()
    {
        String[] array = 
        {
            "145.0,50.0",
            "115.0,110.0",
            "175.0,110.0",
            "85.0,170.0",
            "145.0,170.0",
            "205.0,170.0",
            "55.0,230.0",
            "115.0,230.0",
            "175.0,230.0",
            "235.0,230.0",
            "25.0,290.0",
            "85.0,290.0",
            "145.0,290.0",
            "205.0,290.0",
            "265.0,290.0"
        };
        
        for (String str : array)
        {
            String temp;
            for (int i = 0; i < str.length(); i++)
            {
                if (str.equals(".")) System.out.print(str.substring(0 , i+1));
            }
            System.out.println();
        }
    }
}
