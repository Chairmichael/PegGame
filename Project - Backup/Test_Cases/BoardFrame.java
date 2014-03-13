package Test_Cases;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * The BoardFrame.
 * 
 * @author Jefferson Henry 
 * @version 3/4/2014
 */
public class BoardFrame extends JFrame
{
    private JPanel panel;
    
    private JLabel errorsLabel;
    private final String FACENAME_0 = "SansSerif"; // Fontface for the errors label.
    private final int STYLE_0 = Font.PLAIN; // Style for the errors label.
    private final int SIZE_0 = 15; // Size for the errors label.
    
    private JLabel creditsLabel;
    private final String FACENAME_1 = "SansSerif"; // Fontface for the credits label.
    private final int STYLE_1 = Font.PLAIN; // Style for the credits label.
    private final int SIZE_1 = 9; // Size for the credits label.
    
    public BoardFrame()
    {
        panel = new JPanel(new BorderLayout());
        add(panel, BorderLayout.SOUTH);
        
        errorsLabel = new JLabel(" Errors: There's nothing here right now.", SwingConstants.LEFT);
        errorsLabel.setFont(new Font(FACENAME_0, STYLE_0, SIZE_0));
        panel.add(errorsLabel, BorderLayout.WEST);
        
        creditsLabel = new JLabel("Jefferson Henry, Daniel Leonard, Jason Hansalman ", SwingConstants.RIGHT);
        creditsLabel.setFont(new Font(FACENAME_1, STYLE_1, SIZE_1));
        panel.add(creditsLabel, BorderLayout.EAST);
    }
}
