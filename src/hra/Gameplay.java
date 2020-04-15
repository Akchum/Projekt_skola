package hra;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.Timer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
	private boolean play = false;
	
	private int score = 0;
	public static BufferedImage img,img2;
	
	
	private int totalcoins = 30;
	
	
	private Timer timer;
	private int delay = 8;
	
	private int playerX = 10;
	
	public Gameplay() throws IOException {
		 img = ImageIO.read(new File("scaryforest.jpg"));
		 
		 timer = new Timer(delay, this);
		 timer.start();
		 repaint();
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(1,1,1280,720);
		
        
		  g.drawImage(Gameplay.img, 0,0, 1280,720, null);
		  
		  g.setColor(Color.CYAN);
		  g.fillRect(0,120, 90, 10);
		  g.fillRect(0,320, 200, 10);
		  g.fillRect(220,510, 120, 10);
		  g.fillRect(0,570, 90, 10);
		  
		  g.setColor(Color.GREEN);
		  g.fillRect(playerX, 550, 100, 8);
		  repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
		repaint();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	

	@Override
	public void keyPressed(KeyEvent e) {
		 if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			 if(playerX >= 1280) {
				 playerX = 1280;
			 } else {
				 moveRight();
			 }
		 }
		 if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			 if(playerX <= 10) {
				 playerX = 10;
			 } else {
				 moveLeft();
			 }
		 }
		
	}
	
	 public void moveRight() {
  	   playerX+=10;
     }
     
     public void moveLeft() {
  	 playerX-=10;  
     }

	

}
