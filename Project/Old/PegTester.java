package Old;


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
 * @version 3/11/2014
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
        
        JComponent peg2 = new PegNormal(2.5, new Location(3, 0, true));
        JComponent peg1 = new PegNormal(10.0, new Location(0, 0, false));
        frame.add(peg2);
        frame.add(peg1);
    }
}
