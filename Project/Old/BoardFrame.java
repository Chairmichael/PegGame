package Old;

 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
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
    
    private JLabel errorsTitle;
    private JLabel errorsLabel;
    private final String FACENAME_0 = "Blackletter"; // Fontface for the errors label.
    private final int STYLE_0 = Font.PLAIN; // Style for the errors label.
    private final int SIZE_0 = 15; // Size for the errors title label.
    private final int SIZE_2 = 12; // Size for errors label
    
    private JLabel creditsLabel;
    private final String FACENAME_1 = "Blackletter"; // Fontface for the credits label.
    private final int STYLE_1 = Font.PLAIN; // Style for the credits label.
    private final int SIZE_1 = 9; // Size for the credits label.
    
    private final int FRAME_WIDTH = 750;
    private final int FRAME_HEIGHT = 600;
    
    public BoardFrame()
    {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("The Peg Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new Board());
        setPegs();

        setVisible(true);
        setSize(650, 500);
        
        panel = new JPanel(new BorderLayout());
        add(panel, BorderLayout.SOUTH);
        
        // Errors labels
        errorsTitle = new JLabel(" Errors: ", SwingConstants.LEFT);
        errorsTitle.setFont(new Font(FACENAME_0, STYLE_0, SIZE_0));
        panel.add(errorsTitle, BorderLayout.WEST);
        errorsLabel = new JLabel(" There's nothing here right now.", SwingConstants.LEFT);
        errorsLabel.setFont(new Font(FACENAME_0, STYLE_0, SIZE_2));
        panel.add(errorsLabel, BorderLayout.SOUTH);
        
<<<<<<< HEAD:Project/BoardFrame.java
        creditsLabel = new JLabel("Jefferson Henry, Daniel Leonard, and possibly Jason Hansalman ", SwingConstants.RIGHT);
        creditsLabel.setFont(new Font(FACENAME_1, STYLE_1, SIZE_1));
        panel.add(creditsLabel, BorderLayout.EAST);
        
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
=======
        // Names label
        creditsLabel = new JLabel("Jefferson Henry, Daniel Leonard, Jason Hansalman ", SwingConstants.RIGHT);
        creditsLabel.setFont(new Font(FACENAME_1, STYLE_1, SIZE_1));
        panel.add(creditsLabel, BorderLayout.EAST);
        
        //setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }
    
    /**
     * Sets up the Pegs
     */
    public void setPegs()
    {
        
>>>>>>> origin/v2:Project/Old/BoardFrame.java
    }
}