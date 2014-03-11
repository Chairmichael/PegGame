
import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/**
 * A PegTester.
 * 
 * @author Jefferson Henry
 * @version 3/10/2014
 */
public class PegTester
{
    public static void main()
    {
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setTitle("Some Pegs");
        frame.setVisible(true);
        
        JPanel
        JComponent peg1 = new PegEmpty(0.0, new Location(0, 0, false));
    }
}
