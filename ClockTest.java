import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClockTest {
	
	private static JLabel label;
	private static ClockIcon clock;
	
	public static void main(String [] args){
		
		JFrame frame = new JFrame();
		
		
		clock = new ClockIcon(0,0,500);
		label = new JLabel(clock);
		
		
	    frame.setLayout(new FlowLayout());
	
	    frame.add(label);

	    ActionListener listener = new 
	            ActionListener()
	            {
	               public void actionPerformed(ActionEvent event)
	               {
	                  label.repaint();
 	               }
	            };

	         final int DELAY = 1000; 
	            // milliseconds between timer ticks
	         Timer t = new Timer(DELAY, listener);
	         t.start();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setVisible(true);
	
	}

}
