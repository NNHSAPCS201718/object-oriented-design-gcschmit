import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;


/**
 * This class demonstrates how to install an action listener.
 *
 * @author gcschmit
 * @version 12 February 2018
 */
public class ButtonViewer
{
    private final int FRAME_WIDTH = 100;
    private final int FRAME_HEIGHT = 100;
    
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    
    
    /**
     * Constructor for objects of class ButtonViewer
     */
    public ButtonViewer()
    {
        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.button = new JButton( "Click Me" );
        this.panel.add( this.button );
        
        this.label = new JLabel( "button was clicked 0 times" );
        this.panel.add( this.label );
        
        this.frame.add( this.panel );
        
        // 2. create listener object
        ClickListener listener = new ClickListener();
        
        // 3. register listener object with component that generates events
        this.button.addActionListener( listener );
        
        // configure the frame and show it
        this.frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.frame.setVisible( true );
    }

    public static void main( String[] args )
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}
