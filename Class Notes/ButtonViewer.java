import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class demonstrates how to install an action listener.
 *
 * @author gcschmit
 * @version 12 February 2018
 */
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;

    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JLabel label;

    /**
     * Constructor for objects of class ButtonViewer
     */
    public ButtonViewer()
    {
        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.buttonA = new JButton( "A" );
        this.panel.add( this.buttonA );
        this.buttonB = new JButton( "B" );
        this.panel.add( this.buttonB );

        this.label = new JLabel( "No button clicked." );
        this.panel.add( this.label );

        this.frame.add( this.panel );

        // 2. create listener object
        ActionListener listenerA = new ClickListener();
        ActionListener listenerB = new ClickListener();

        // 3. register listener object with component that generates events
        buttonA.addActionListener( listenerA );
        buttonB.addActionListener( listenerB );

        // configure the frame and show it
        this.frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.frame.setVisible( true );
    }

    public static void main( String[] args )
    {
        ButtonViewer viewer = new ButtonViewer();
    }

    class ClickListener implements ActionListener
    {
        private int numClicks = 0;
        
        public void actionPerformed( ActionEvent event )
        {
            numClicks++;
            label.setText( "Button " + event.getActionCommand() +
                    " was clicked " + numClicks + " times!" );
        }
    }
}
