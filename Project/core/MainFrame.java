package core;


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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
    private Engine eng;
    private Graphics2D g2;
    private JComponent board;
    
    private JPanel lowerPanel;
    private JPanel statsPanel;
    private JPanel mainPanel;
    private JButton resetBtn;
    
    private JLabel statusTitle;
    private JLabel statusLabel;
    private final String FACENAME_0 = "Blackletter"; // Fontface for the status label.
    private final int STYLE_0 = Font.PLAIN; // Style for the status label.
    private final int SIZE_0 = 15; // Size for the status title label.
    private final int SIZE_2 = 12; // Size for status label
    
    private JLabel creditsLabel;
    private final String FACENAME_1 = "Blackletter"; // Fontface for the credits label.
    private final int STYLE_1 = Font.PLAIN; // Style for the credits label.
    private final int SIZE_1 = 9; // Size for the credits label.
    
    // Frame width and height
    private final int FRAME_WIDTH = 650;
    private final int FRAME_HEIGHT = 500;
    
    /**
     * Constructs the MainFrame.
     */
    public MainFrame()
    {
        eng = new Engine();
        
        // Initialize frame with set methods
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("The Peg Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLookandFeel();
        setVisible(true);
        
        // Panels
        //statsPanel = new StatsPanel();
        //mainPanel = new JPanel();
        board = new Board(eng.getBoard());
        
        // Add containers
        add(board, BorderLayout.CENTER);
        //add(statsPanel, BorderLayout.EAST);
        //lowerPanel = new JPanel(new BorderLayout());
        //lowerPanel.setBackground(Color.LIGHT_GRAY);
        
        //JLabel status = new JLabel("Nothing here...");
        //add(status, BorderLayout.WEST);
        
        // Add listeners
        board.addMouseListener(new MouseAdapter() 
        {
            public void mouseReleased(MouseEvent evt)
            {
                System.out.println("Mouse clicked on board");
                if (eng.isGameOver())
                {
                    System.out.println("    +-----------+");
                    System.out.println("    | GAME OVER |");
                    System.out.println("    +-----------+");
                }
                else
                {
                    int[] peg = checkBounds(evt.getX(), evt.getY(), eng.getBoard());
                    if (peg == null)
                    {
                        System.out.println("Didn't click on a peg");
                        System.out.println("  Reset selected peg");
                        eng.selected[0] = -1;
                        eng.selected[1] = -1;
                    }
                    else
                    {
                        System.out.println("eng.selected[0] != peg[0] : " + (eng.selected[0] != peg[0]));
                        System.out.println("eng.selected[1] != peg[1] : " + (eng.selected[1] != peg[1]));
                        for (int i = 0; i < 2; i++) System.out.println("eng.selected[" + i + "] = " + eng.selected[i]);
                        
                        if (eng.selected[0] == peg[0] && eng.selected[1] == peg[1])
                        {   // Clicked on the selected peg
                            System.out.println("  Reset selected peg");
                            eng.selected[0] = -1;
                            eng.selected[1] = -1;
                        }
                        else if (/*eng.selected[0] != peg[0] && eng.selected[1] != peg[1] &&*/ !eng.hasNegative(eng.selected))
                        {   // If Clicked on a peg & a peg is selected, then continue.
                            // User wants to move peg.
                            System.out.println("  Mouse clicked on peg: i=" + peg[0] + ",j=" + peg[1]);
                            if (eng.canMove(eng.selected[0], eng.selected[1], peg[0], peg[1]))
                            {
                                eng.move(eng.selected[0], eng.selected[1], peg[0], peg[1]);
                                repaint();
                            }
                            else
                            {
                                System.out.println("  Can't move to: i=" + peg[0] + ",j=" + peg[1]);
                                eng.selected[0] = -1;
                                eng.selected[1] = -1;
                                for (int i = 0; i < 2; i++) System.out.println("eng.selected[" + i + "] = " + eng.selected[i]);
                            }
                        }
                        else if (eng.getBoard()[peg[0]][peg[1]] && eng.hasNegative(eng.selected))
                        {   // If clicked on a peg & no peg is selected
                            eng.selected[0] = peg[0];
                            eng.selected[1] = peg[1];
                            System.out.println("  Peg selected i=" + peg[0] + ",j=" + peg[1]);
                        }
                        else
                        {
                            System.out.println("  Reset selected peg");
                            eng.selected[0] = -1;
                            eng.selected[1] = -1;
                        }
                    }
                }
                System.out.println();
                
                if (eng.isGameOver())
                {
                    System.out.println("    +-----------+");
                    System.out.println("    | GAME OVER |");
                    System.out.println("    +-----------+");
                }
            }
        });
        board.addMouseMotionListener(new MouseMotionAdapter() 
        {
            public void mouseMoved(MouseEvent evt)
            {
                //System.out.println("Mouse moved to (" + evt.getX()+","+evt.getY() + ")");
            }
        });
        /*
        // Status label title
        statusTitle = new JLabel(" Status: ", SwingConstants.LEFT);
        statusTitle.setFont(new Font(FACENAME_0, STYLE_0, SIZE_0));
        
        // Main status label content
        statusLabel = new JLabel(" There's nothing here right now.", SwingConstants.LEFT);
        statusLabel.setFont(new Font(FACENAME_0, STYLE_0, SIZE_2));
        
        // Add labels
        lowerPanel.add(statusTitle, BorderLayout.WEST);
        lowerPanel.add(statusLabel, BorderLayout.SOUTH);
        
        // Reset button
        resetBtn = new JButton("RESET");
        resetBtn.setPreferredSize(new java.awt.Dimension(100, 50));
        resetBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                System.out.println("RESET button clicked");
                resetAll();
            }
        });
        lowerPanel.add(resetBtn, BorderLayout.EAST);
        add(lowerPanel, BorderLayout.SOUTH);*/
    }
    
    /**
     * Called when <code>repaint</code> is called.
     * 
     * @param g the current <code>Graphics</code> context.
     */
    @Override
    public void update(Graphics g)
    {
        remove(board);
        drawBoard();
    }
    
    /**
     * Checks to see if the coordinates are inside a peg
     * using this algorithm <code>(x - center_x)^2 + (y - center_y)^2 < radius^2</code>.
     * 
     * @param x the x coordinate to test with.
     * @param y the y coordinate to test with.
     * @param pieces the pegs on the board.
     * @return the <code>i</code> and <code>j</code> indexes in that order if there is a peg; 
     *         if a peg is not at the coordinates, <code>null</code> is returned.
     */
    public int[] checkBounds(int x, int y, boolean[][] pieces)
    {
        int[] result = {-1, -1};
        for (int i = 0; i < pieces.length; i++)
        {
            result[0] = i;
            for (int j = 0; j < pieces[i].length; j++)
            {
                result[1] = j;
                int centerX = Constants.COORDS_TRI[i][j][0] + Constants.DIAMETER / 2;
                int centerY = Constants.COORDS_TRI[i][j][1] + Constants.DIAMETER / 2;
                if (Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2) < Math.pow((Constants.DIAMETER / 2), 2))
                    return result;
            }
        }
        return null;
    }
    
    /**
     * Paints the board according to array of
     * <code>boolean</code>s in <code>Engine</code>.
     * 
     * @param g the current graphics context.
     */
    public void drawBoard()
    {
        board = new Board(eng.getBoard());
        add(board);
    }
    
    /** 
     * Uses the <code>java.awt.Graphics.fillOval()</code>
     * to draw the pegs.
     * 
     * @param g the current <code>graphics</code> context.
     */
    @Deprecated
    public static void drawDefaultPegs(Graphics g)
    {
        g.fillOval(2,2,2,2);
    }
    
    /**
     * Iniationalizes the frame with the appropiate methods.
     */
    @Deprecated
    public void initFrame()
    {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("The Peg Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    /**
     * Defines contains and adds them to frame with the appropiate layout; adds listeners, if needed.
     */
    @Deprecated
    public void setupContainers()
    {
        // Panels
        lowerPanel = new JPanel(new BorderLayout());
        lowerPanel.setBackground(Color.LIGHT_GRAY);
        
        statsPanel = new StatsPanel();
        mainPanel = new JPanel();
        
        // JComponent
        board = new Board(eng.getBoard());
        
        // Add containers
        //add(lowerPanel, BorderLayout.SOUTH);
        //add(statsPanel, BorderLayout.EAST);
        //add(board);
        
        // Add listeners
        board.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent evt)
            {
                System.out.println("Mouse clicked on board");
                int[] peg = checkBounds(evt.getX(), evt.getY(), eng.getBoard());
                if (peg != null)
                    System.out.println("  Mouse clicked on peg: i=" + peg[0] + ",j=" + peg[1]);
            }
        });
        board.addMouseMotionListener(new MouseMotionAdapter() 
        {
            public void mouseMoved(MouseEvent evt)
            {
                //System.out.println("Mouse moved to (" + evt.getX()+","+evt.getY() + ")");
            }
        });
    }
    
    /**
     * Defines the labels and adds them to a panel with the appropiate layout.
     */
    @Deprecated
    public void setupLabels()
    {
        // Status label title
        statusTitle = new JLabel(" Status: ", SwingConstants.LEFT);
        statusTitle.setFont(new Font(FACENAME_0, STYLE_0, SIZE_0));
        
        // Main status label content
        statusLabel = new JLabel(" There's nothing here right now.", SwingConstants.LEFT);
        statusLabel.setFont(new Font(FACENAME_0, STYLE_0, SIZE_2));
        
        // Names label
        creditsLabel = new JLabel("Jefferson Henry, Daniel Leonard, Jason Hansalman ", SwingConstants.RIGHT);
        creditsLabel.setFont(new Font(FACENAME_1, STYLE_1, SIZE_1));
        
        // Add labels
        lowerPanel.add(statusTitle, BorderLayout.WEST);
        lowerPanel.add(creditsLabel, BorderLayout.EAST);
        lowerPanel.add(statusLabel, BorderLayout.SOUTH);
    }
    
    /**
     * Sets the look and feel for the frame
     */
    public static void setLookandFeel()
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
     * Resets everything to defaults.
     */
    @Override
    public void resetAll()
    {
        //statsPanel.resetAll();
        eng.resetAll();
    }
    
    /**
     * Sets the text in the status label.
     * 
     * @param str the <code>String</code> to be put in the status label.
     */
    public void setStatus(String str)
    {
        statusLabel.setText(str);
    }
    
    
    public static void main()
    {
        new MainFrame();
    }
}
