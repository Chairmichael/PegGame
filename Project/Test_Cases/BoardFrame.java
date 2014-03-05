package Test_Cases;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Write a description of class BoardFrame here.
 * 
 * @author Jefferson Henry 
 * @version 3/4/2014
 */
public class BoardFrame extends JFrame
{
    private final String FACENAME = "SansSerif"; // Fontface for the errors label.
    private final int STYLE = Font.PLAIN; // Style for the errors label.
    private final int SIZE = 15; // Size for the errors label.
    
    private JLabel errorsLabel;
    
    public BoardFrame()
    {
        errorsLabel = new JLabel("Errors: There's nothing here right now.", SwingConstants.LEFT);
        errorsLabel.setFont(new Font(FACENAME, STYLE, SIZE));
        add(errorsLabel, BorderLayout.SOUTH);
    }
}
