import java.awt.Image;

import javax.swing.ImageIcon;

public class Coin
{
    Cowboy cowboy;
    Image coin;
    ImageIcon coinImage = new ImageIcon(this.getClass().getResource("coin.png"));
    int Score = 0;
    private int x,y;
    public Coin(){
        coin = coinImage.getImage();
        int x = 100;
        int y = 100;
    }
    
    public Image getImage() {
		return coin;
    }
    
    public int getX() {
		return x;
    }
	
    public int getY() {
		return y;
    }
    //public void score(){
        //cowboy = new Cowboy();
        //if(cowboy.getX() == x && cowboy.getY() == y)Score++;
        
    
}
