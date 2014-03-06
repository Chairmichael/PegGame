package Test_Cases;

import javax.swing.JFrame;

/**
 * Creates a frame for the graphics.
 * 
 * @author Jefferson Henry
 * @version 3/4/2014
 */
public class G_Viewer
{
    public static void main()
    {
        JFrame frame = new BoardFrame();

        final int FRAME_WIDTH = 750;
        final int FRAME_HEIGHT = 600;

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("The Peg Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BoardComponent component = new BoardComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
