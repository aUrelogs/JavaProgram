package javalogs;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ashlogs {

	public static void main(String[] args) {
		
		/*
		 int[ ] values = {6, 2, 1, 7, 12, 5};
	     int min = values[1]; 
	     
	     for (int val : values)
	     {
	       if (val < min) 
	           min = val;
	     }
	     System.out.println("Min is " + min ); 
	     */
		
		 int[ ] values = {6, 2, 1, 7, 12, 5};
	     int  f = values[0];
	     int j = 0;
		for (int i = 0; j < values.length; i++)
	     {
	        // if it's not the last element, copy the next one over
	       if (i < values.length - 1)
	       {
	           values[i] = values[i+1];
	       }
	       else {
	          int first = 0;
			// last element gets first
	          values[i] = first;
	         }
	     }
	     // print them out to see the results
	     for (int val : values)
	     {
	        System.out.print(val + " ");
	     }

		
	}
	

}
