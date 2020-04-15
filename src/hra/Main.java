package hra;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Main {

	public static void main(String[]args) throws IOException {
		JFrame f = new JFrame();
		Gameplay gamePlay = new Gameplay();
		
		f.setSize(1280,720);
		f.setTitle("I think this just might be my masterpiece");
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(gamePlay);
	}
}
