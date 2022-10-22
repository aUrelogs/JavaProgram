package javalogs;

import javax.swing.JApplet;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import java.awt.Panel;
import javax.swing.JMenuBar;

public class AdventureCarRental extends JApplet {

	/**
	 * Create the applet.
	 */
	public AdventureCarRental() {
		
		Panel panel = new Panel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

	}

}
