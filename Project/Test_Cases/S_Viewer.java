package Test_Cases;

import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * A class that has the main method for 
 * testing the mechanics of a single peg.
 */
public class S_Viewer implements MouseListener
{
    public static void main()
    {
        JFrame frame = new JFrame();

        final int FRAME_WIDTH = 250;
        final int FRAME_HEIGHT = 250;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("A Single Peg");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PegNormal pegNorm = new PegNormal();
        frame.add(pegNorm);

        frame.setVisible(true);
    }

    public void mousePressed(MouseEvent e)
    {
        
    }

    public void mouseReleased(MouseEvent e) 
    {
        
    }

    public void mouseEntered(MouseEvent e) 
    {
        
    }

    public void mouseExited(MouseEvent e) 
    {
        
    }

    public void mouseClicked(MouseEvent e) 
    {
        
    }
}
