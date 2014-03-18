
import java.lang.Exception;
import java.lang.IllegalArgumentException;

import javax.swing.JLabel;
import java.awt.GridLayout;

/**
 * A StatsFrame.
 * 
 * @author Jefferson Henry
 * @version //2014
 */
public class StatsPanel extends javax.swing.JPanel implements Resetable
{
    private int timesClicked;
    private int timesMoved;
    
    /**
     * Constructs s StatsPanel.
     */
    public StatsPanel()
    {
        timesClicked = 0;
        timesMoved = 0;
    }
    
    @Override
    public void resetAll()
    {
        timesClicked = 0;
        timesMoved = 0;
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
