package Test_Cases;

import java.lang.Exception;
import java.lang.IllegalArgumentException;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
 * A Ellipse_Tester.
 * 
 * @author Jefferson Henry
 * @version //2014
 */
public class Ellipse_Tester
{
    public static void main()
    {
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 200);
        frame.setTitle("Some Pegs");
        frame.setVisible(true);
        
        JComponent peg1 = new CircleBold(50, 50);
        frame.add(peg1);
    }
}
