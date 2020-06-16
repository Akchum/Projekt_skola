import java.awt.Image;

import javax.swing.ImageIcon;

public class Cowboy {
	
	
	private int x,y;
	private boolean left = false, right = false, up = false, down = false;
	
	Image cowboy;
	
	
	ImageIcon cowboyImage = new ImageIcon(this.getClass().getResource("cowboy.png"));
	ImageIcon cowboyImageL = new ImageIcon(this.getClass().getResource("cowboyL.png"));
	ImageIcon cowboyImageJ = new ImageIcon(this.getClass().getResource("jump.png"));
	public Cowboy() {
		x = 0;
		y = 600;
		cowboy = cowboyImage.getImage();
		
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
	
	public boolean getLeft() {
		return left;
	}
	
	public boolean getRight() {
		return right;
	}
	
	public boolean getUp() {
		return up;
	}
	
	public boolean getDown() {
		return down;
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
		
		//cowboy = cowboyImageL.getImage();
		
		x -= 5;
		if(x <= -20)x = -20;
     }
	
    public void right() {
		
		cowboy = cowboyImage.getImage();
		
		x += 5;
		if(x >= 1600)x = 1600;
     }
    
    public void up() {
    	//cowboy = cowboyImageJ.getImage();
        y = 400;
    }
    
    public void down() {
    	y = 600;
    }
	
}
