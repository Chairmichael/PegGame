package Test_Cases;

import javax.swing.JFrame;

/**
 * A class that has the main method for 
 * testing the mechanics of a single peg.
 */
public class S_Viewer
{
    public static void main()
    {
        JFrame frame = new JFrame();

        final int FRAME_WIDTH = 250;
        final int FRAME_HEIGHT = 250;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("A Single Peg");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PegComponent component = new PegComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
