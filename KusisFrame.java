

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class KusisFrame{
	
	public static JFrame frame= new JFrame();
	public static WelcomePanel openingPanel;

	public static void main(String[] args) throws IOException {

		
		
		
		
		frame = new JFrame();
		frame.setTitle("KUSIS");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(UIConstants.width, UIConstants.height);      

		frame.setLayout(null);

		//add panels
		openingPanel = new WelcomePanel();
		openingPanel.setVisible(true);
		openingPanel.setSize(UIConstants.width, UIConstants.height);      
		frame.add(openingPanel);

		
		frame.setVisible(true);
		

	}

	


	
	



}

