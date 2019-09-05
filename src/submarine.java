import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class submarine extends ship{
	
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	Boolean loaded=true;

	submarine(int x, int y, int width, int height, int velocity, int pointvalue) {
		super(x, y, width, height, velocity, pointvalue);
		// TODO Auto-generated constructor stub
		if (needImage) {
		    loadImage (null);
		}
	}

	public torpedo getProjectile() {
       if(loaded==true){
		return new torpedo(x+width/2, y, 10,20, 5,0);
     
       }else {
    	   return new torpedo(x+width/2,-1, 10,20, 5,0);
       }
       
       } 
	
	
	
	
	void draw(Graphics g){

	if (gotImage) {
		g.drawImage(image, x, y, width, height, null);
	} else {
	g.setColor(Color.GRAY);
	g.fillRect(x,y,width,height);
	}
}
void move() {
	 x=x+velocity;
     super.Cupdate();
}



void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}
}
