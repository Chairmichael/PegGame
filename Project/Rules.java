import java.util.ArrayList;
import java.lang.Integer;

/**
 * Contains an ArrayList of locations and controls whether a move is valid
 * @author Dan Leonard
 */
public class Rules
{
    ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
    
    /**
     * Empty constructor
     */
    public Rules()
    {
        
    }
    
    public boolean isValid(Location from, Location to)
    {
        if (from.hasPeg())
        {
            
        }
        
        return true;
    }
}
