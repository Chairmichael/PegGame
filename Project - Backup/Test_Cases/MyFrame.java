package Test_Cases;

import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Graphics2D;
import java.awt.Graphics;
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
        clrB = new CircleBold(100, 50);
        
        clrN.addMouseListener(new Listener());
        add(clrN);
    }
    
    public class Listener implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
            System.out.println("Clicked");
            if (normPresent)
            {
                remove(clrN);
                clrB.addMouseListener(this);
                add(clrB);
            }
            else
            {
                remove(clrB);
                clrN.addMouseListener(this);
                add(clrN);              
            }
            normPresent = !normPresent;
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
