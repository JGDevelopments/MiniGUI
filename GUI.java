package javaGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory; //gotta love swing 
import javax.swing.JButton;
import javax.swing.JFrame; //so we can use JFrame to create our window and all that fun stuff 
import javax.swing.JLabel;
import javax.swing.JPanel; //this little guy creates our panel 

public class GUI implements ActionListener {
	
	private int count = 0; // want this to have a global scope
	private JLabel label; // were just making these private for good practice so that the user doesn't have to worry about these variables 
	private JFrame frame; 
	private JPanel panel; 
	
	public GUI(){ //this guy is our little constructor, I'm treating this like a method
		
		frame = new JFrame(); 
		
		JButton button = new JButton("Please Click me");
		button.addActionListener(this);
		
		label = new JLabel("Number of Clicks: ");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); //these are measured in pixels 
		panel.setLayout(new GridLayout()); //If your reading this. I had to google most of this :)
		panel.add(button); //adding the little button
		panel.add(label); 
		
		frame.add(panel, BorderLayout.CENTER); //adds panel to the frame 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what occurs upon closing the frame 
		frame.setTitle("Our GUI"); // sets the title 
		frame.pack(); // sets the window to match a particular size 
		frame.setVisible(true); // sets window to be visible and in focus
	}
	
	public static void main(String[] args) {
		new GUI(); //creates a GUI object from the GUI class		
	}

	@Override
	public void actionPerformed(ActionEvent e) { //the unimplemented method required upon adding the ActionListener import 
		count++;
		label.setText("Number of Clicks: " + count);
	}
}
