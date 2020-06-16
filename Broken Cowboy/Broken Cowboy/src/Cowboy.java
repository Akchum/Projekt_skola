import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Cowboy {
	
	private int x,y;
	private boolean left = false, right = false, up = false, down = false;
	
	Image cowboy = ImageIO.read(new File("cowboy.png"));
	
	//ImageIcon cowboyImage = new ImageIcon(this.getClass().getResource("cowboy.png"));
	
	//ImageIcon marioImager = new ImageIcon(this.getClass().getResource("mario2.jpg"));
	
	public static BufferedImage img;
	
	
	
	public Cowboy() throws IOException {
		
		cowboy = ImageIO.read(new File("cowboy.png"));
		
		
		x = 100;
		y = 200;
	    
		
	}
	
	public void setLeft(boolean left) {
		this.left = left;
		
	}
	
	public void setRight(boolean right) {
		this.right = right;
	}
	
	public void setUp(boolean up) {
		this.up = up;
	}
	
	public void setDown(boolean down) {
		this.down = down;
	}
	
	public boolean getUp() {
		return up;
	}
	
	public boolean getDown() {
		return down;
	}
	
	public boolean getLeft() {
		return left;
	}
	
	public boolean getRight() {
		return right;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Image getImage() {
		return cowboy;
	}
	
	public void left() {
		x -= 2;
		if(x <= 0)
			x = 0;
	}
	
	public void right() {
		x += 2;
		if(x >= 460)
			x = 460;
	}
		
	public void up() {
		y = 100;
	}
	
	public void down() {
		y = 200;
	}
	
	

}
