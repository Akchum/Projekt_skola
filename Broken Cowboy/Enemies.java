import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemies
{
    Image bizon;
    //
    ImageIcon bizonImage = new ImageIcon(this.getClass().getResource("bizon.png"));
    private int x,y;
    
    public Enemies(){
        bizon = bizonImage.getImage();
        x = 400;
        y = 660;
    }
    
    public int getX() {
		return x;
	}
	
    public int getY() {
		return y;
	}
	
	
	
    public void enemies(){
        bizon = bizonImage.getImage();
        
        
    }
}
