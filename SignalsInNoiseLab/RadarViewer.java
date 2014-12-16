import javax.swing.JFrame;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @zmswartz
 * @version 15 December 2014
 */
public class RadarViewer
{
    /**
     * main method for the program which creates and configures the frame for the program
     * @pre     both dx and dy are positive integers
     * @pre     both dx and dy are less than or equal to 5
     * @param   dx  the velocity in the x direction
     * @param   dy  the velocity in the y direction
     */
    public static void main(String[] args, int dx, int dy) throws InterruptedException
    {
        // create the radar, set the monster location, and perform the initial scan
        final int ROWS = 100;
        final int COLS = 100;
        Radar radar = new Radar(ROWS, COLS);
        radar.setNoiseFraction(0.01);
        radar.scan();
        
        JFrame frame = new JFrame();
        
        frame.setTitle("Signals in Noise Lab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the radar component and add it to the frame
        RadarComponent component = new RadarComponent(radar);
        frame.add(component);
        
        // set the size of the frame to encompass the contained component
        frame.pack();
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // perform scans of the radar wiht a slight pause between each until the monster leaves the frame
        // after each scan, instruct the Java Run-Time to redraw the window
        while ( Math.abs(radar.monsterLocationRow) < 100 && Math.abs(radar.monsterLocationCol) < 100)
        {
            Thread.sleep(100); // sleep 100 milliseconds (1/10 second)
            
            radar.scan();  //perform the scan
            
            frame.repaint();  //repaints frame
            radar.setMonsterLocation(radar.monsterLocationRow + dy, radar.monsterLocationCol + dx);  //moves the monster based on the entered velocity
        }
        System.out.println(radar.findMax());
    }
    

}
