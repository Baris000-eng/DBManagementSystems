

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class WelcomePanel extends JPanel {

	private JLabel userLabel;
	private JButton logInButton;
	
	private JLabel welcome;
	private JLabel introImage;
	
	private JLabel logoImage;
	
	private JLabel secondLogoImage;
	
	private JOptionPane guideMessage;
	private JButton guideButton;

	public WelcomePanel() {
		super();
		Color[]colorArr = {Color.GREEN,Color.RED,Color.YELLOW,Color.CYAN};
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int length = colorArr.length;
		int index = rand.nextInt(length);
		
		
		
		logInButton = new JButton("Log In");
		guideButton = new JButton("Guide");
		welcome= new JLabel();
		welcome.setText("Welcome to KUSIS");
		
		
		ImageIcon imageIcon = new ImageIcon("kusis image.jpeg"); 
		Image image = imageIcon.getImage(); 
		Image newimg = image.getScaledInstance(UIConstants.height*2/5, UIConstants.height*2/5,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg); 
		introImage= new JLabel(imageIcon);
		
		ImageIcon logo = new ImageIcon("lg.png");
		Image logoIm = logo.getImage();
		Image newLogo = logoIm.getScaledInstance(UIConstants.height/10, UIConstants.height/10,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		logo = new ImageIcon(newLogo);
		logoImage= new JLabel(logo);
		
		
		ImageIcon secondlogo = new ImageIcon("lg.png");
		Image secondlogoIm = secondlogo.getImage();
		Image secondnewLogo = secondlogoIm.getScaledInstance(UIConstants.height/10, UIConstants.height/10,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		secondlogo = new ImageIcon(secondnewLogo);
		secondLogoImage= new JLabel(secondlogo);
		
		
		
		
		
		introImage.setBounds((UIConstants.width-UIConstants.height*2/5)/2,0,UIConstants.height*2/5,UIConstants.height*2/5);
		
		welcome.setBounds(UIConstants.middleX+15,UIConstants.height*2/5+UIConstants.heightButton,250,UIConstants.heightButton);
		
		logInButton.setBounds(UIConstants.middleX,UIConstants.height*2/5+3*UIConstants.heightButton,UIConstants.widthButton,UIConstants.heightButton);
		
		
		logoImage.setBounds(5,5,100,100);
		
		secondLogoImage.setBounds(UIConstants.width-105,5,100,100);
		
		
		this.add(logInButton);
		this.add(welcome);
		this.add(guideButton);
		this.add(introImage);
		this.add(logoImage);
		this.add(secondLogoImage);

		this.setBackground(colorArr[index]);
		this.setLayout(null);
	}


	


	public JLabel getUserLabel1() {
		return userLabel;
	}


	public JButton getLogInButton() {
		return logInButton;
	}


	
	public JButton getGuideButton() {
		return guideButton;
	}
	
	public JOptionPane getGuideMessage() {
		return guideMessage;
	}

	public JLabel getWelcome() {
		return welcome;
	}


	public void setUserLabel1(JLabel userLabel) {
		this.userLabel = userLabel;
	}


	public void setLogInButton(JButton logInButton) {
		this.logInButton = logInButton;
	}


	

	public void setWelcome(JLabel welcome) {
		this.welcome = welcome;
	}
	




}