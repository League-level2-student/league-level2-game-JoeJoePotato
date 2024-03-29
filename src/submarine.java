import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class submarine extends ship{
	
	public BufferedImage image;
	public  boolean needImage = true;
	public  boolean gotImage = false;	
	Boolean loaded=true;

	submarine(int x, int y, int width, int height, int velocity, int pointvalue) {
		super(x, y, width, height, velocity, pointvalue);
		// TODO Auto-generated constructor stub
		if (needImage) {
		   if(this.pointvalue==0) {
			loadImage ("submareine.png");
		   }else if(this.pointvalue==50) {
			loadImage ("destroyer.png");
		   }else if(this.pointvalue==150) {
			loadImage ("tug.png");
		   }else if(this.pointvalue==300) {
			loadImage ("cargo.png");
		   }else if(this.pointvalue==500) {
			loadImage ("tanker.png");
		   }else if(this.pointvalue==825) {
			loadImage ("transport.png");
		   }
		   }
	}

	public torpedo getProjectile() {
 
		return new torpedo(x+width/2, y, 10,20, 5,0);
     
   
       
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
