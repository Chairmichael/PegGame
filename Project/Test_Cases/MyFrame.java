package Test_Cases;

import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComponent;
import javax.swing.SwingConstants;

/**
 * A MyFrame.
 * 
 * @author Jefferson Henry
 * @version //2014
 */
public class MyFrame extends JFrame
{
    JComponent clrN;
    JComponent clrB;
    JPanel panel;
    
    private boolean normPresent = true;
    
    /**
     * Constructs s MyFrame.
     */
    public MyFrame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 200);
        setTitle("Some Pegs");
        setVisible(true);
        
        clrN = new Circle(50, 50);
        clrN.addMouseListener(new Listener());
        add(clrN);
        clrB = new CircleBold(100, 50);
        add(clrB);       
    }
    
    public class Listener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
            System.out.println("Clicked");
            if (normPresent)
            {
                panel.remove(clrN);
                panel.add(clrB);
                clrB.addMouseListener(this);
            }
            else
            {
                panel.remove(clrB);
                panel.add(clrN);
                clrB.addMouseListener(this);                
            }
            normPresent = !normPresent;
            panel.updateUI();
        }
        
        public void mouseEntered(MouseEvent e)
        {
            
        }
        
        public void mouseExited(MouseEvent e)
        {
            
        }
        
        public void mousePressed(MouseEvent e) { }
        public void mouseReleased(MouseEvent e) { }
    }
}
