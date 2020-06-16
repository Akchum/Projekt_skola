import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Damn extends JPanel implements ActionListener {
	Timer t;

	Image cloud;
	Image back;
	Image bizon;
	//
	Coin coin;
	Cowboy cowboy;
	Enemies enemies;
	public Damn() {
		
		addKeyListener((KeyListener) new Action());
		ImageIcon i = new ImageIcon(this.getClass().getResource("back.jpg"));
		ImageIcon c = new ImageIcon(this.getClass().getResource("cloud.png"));
		//ImageIcon b = new ImageIcon(this.getClass().getResource("bizon.png"));
		//
		cowboy = new Cowboy();
		coin = new Coin();
		enemies = new Enemies();
		//
		t = new Timer(70, this);
		t.start();
		//
		back = i.getImage();
		cloud = c.getImage();
		//bizon = b.getImage();
		//
		setFocusable(true);
		
		
		
		
		
             Thread move = new Thread(new Runnable() {
			
			public void run() {
				
				while(true)
					try {
						if(cowboy.getLeft()== true) {
							cowboy.left();
						}
						if(cowboy.getUp()== true) {
							cowboy.up();
						}
						if(cowboy.getDown()== true) {
							cowboy.down();
						}
						if(cowboy.getRight()== true) {
							cowboy.right();
						}
						
						Thread.sleep(9);
						
						
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				
			}	
			
		});
		move.start();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
	
	public void paintComponent(Graphics g) {
	        
		g.drawImage(back, 0,0,null);
		g.drawImage(cloud,800,500,300,150,null);
		//g.drawImage(enemies.getImage(),enemies.getX(),enemies.getY(),400,250,null);
		g.drawImage(coin.getImage(),600,650,50,50,null);
		g.drawImage(cowboy.getImage(),cowboy.getX(), cowboy.getY(),600,350,null);
		repaint();
		
	}
	
	 private class Action extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			
			int keyCode = e.getKeyCode();
			
			if(keyCode == KeyEvent.VK_LEFT) {
				cowboy.setLeft(true);
			}
			
			if(keyCode == KeyEvent.VK_RIGHT) {
				cowboy.setRight(true);
			}
			
			if(keyCode == KeyEvent.VK_SPACE) {
				cowboy.setDown(false);
				cowboy.setUp(true);
			}
		}
		
		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				cowboy.setLeft(false);
			}
			
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				cowboy.setRight(false);
			}
			
			if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				cowboy.setDown(true);
			}
		}
   }
	
         
}
