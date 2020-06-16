 
import sun.audio.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.JFrame;
import java.awt.Font;
public class Frame extends Sounds {
	
	public static void main(String[]args) {
		Coin c = new Coin();
	        Damn d = new Damn();
		JFrame f = new JFrame("Broken Cowboy");
		f.add(d);
		//JPanel p = new JPanel();
		//p.setSize(20,20);
		//JLabel j = new JLabel("SCORE:" );
		//j.setSize(20,20);
		//j.setFont(new Font("Verdana",1,20));
		
		//p.add(j);
		//f.add(p);
		
		music();
		f.setResizable(false);
		f.setSize(1900,1000);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
  }


   


}


