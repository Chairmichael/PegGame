
import java.lang.Exception;
import java.lang.IllegalArgumentException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.BorderLayout;
import java.awt.Font;

/**
 * A MainFrame.
 * 
 * @author Jefferson Henry
 * @version 3/13/2014
 */
public class MainFrame extends JFrame implements Resetable
{
    private JPanel lowerPanel;
    private JPanel statsPanel;
    private JButton resetBtn;
    
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
    
    /**
     * Constructs the MainFrame.
     */
    public MainFrame()
    {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("The Peg Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO: Graphics here

        setVisible(true);
        setResizable(false);
        setSize(650, 500);
        setLookandFeel();
        
        // Panels
        lowerPanel = new JPanel(new BorderLayout());
        add(lowerPanel, BorderLayout.SOUTH);
        statsPanel = new StatsPanel();
        
        // Errors labels
        errorsTitle = new JLabel(" Errors: ", SwingConstants.LEFT);
        errorsTitle.setFont(new Font(FACENAME_0, STYLE_0, SIZE_0));
        lowerPanel.add(errorsTitle, BorderLayout.WEST);
        errorsLabel = new JLabel(" There's nothing here right now.", SwingConstants.LEFT);
        errorsLabel.setFont(new Font(FACENAME_0, STYLE_0, SIZE_2));
        lowerPanel.add(errorsLabel, BorderLayout.SOUTH);
        
        // Names label
        creditsLabel = new JLabel("Jefferson Henry, Daniel Leonard, Jason Hansalman ", SwingConstants.RIGHT);
        creditsLabel.setFont(new Font(FACENAME_1, STYLE_1, SIZE_1));
        lowerPanel.add(creditsLabel, BorderLayout.EAST);
        
        // Reset buttonresetBtn.setText("RESET");
        resetBtn = new JButton("RESET");
        resetBtn.setPreferredSize(new java.awt.Dimension(100, 50));
        //resetBtn.
        resetBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                System.out.println("RESET button clicked");
                //statsPanel.resetAll();
                //resetAll();
            }
        });
        lowerPanel.add(resetBtn, BorderLayout.EAST);
    }
    
    public void setLookandFeel()
    {
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            System.out.println("Can't find Nimbus look and feel in: javax.swing.UIManager.LookAndFeelInfo");
        } catch (InstantiationException ex)
        {
            System.out.println("Can't find Nimbus look and feel in: javax.swing.UIManager.LookAndFeelInfo");
        } catch (IllegalAccessException ex)
        {
            System.out.println("Can't find Nimbus look and feel in: javax.swing.UIManager.LookAndFeelInfo");
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            System.out.println("Can't find Nimbus look and feel in: javax.swing.UIManager.LookAndFeelInfo");
        }
    }
    
    /**
     * Resets the 
     */
    @Override
    public void resetAll()
    {
        
    }
    
    /**
     * Sets the text in the errors label.
     * 
     * @param str the <code>String</code> to be put in the errors label.
     */
    public void setErrors(String str)
    {
        errorsLabel.setText(str);
    }
    
    
    public static void main()
    {
        new MainFrame().setVisible(true);
    }
}
