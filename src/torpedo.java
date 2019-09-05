import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class torpedo extends ship{
	boolean isactive=true;
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	torpedo(int x, int y, int width, int height, int velocity, int pointvalue) {
		super(x, y, width, height, velocity,  pointvalue);
		// TODO Auto-generated constructor stub
		if (needImage) {
		    loadImage (null);
		}}
	
void draw(Graphics g){
	g.setColor(Color.GRAY);
	g.fillRect(x,y,width,height);
}
void update(){
	y=y-velocity;
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
