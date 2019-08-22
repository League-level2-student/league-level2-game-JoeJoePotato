import java.awt.Color;
import java.awt.Graphics;

public class torpedo extends ship{
	boolean isactive=true;
	torpedo(int x, int y, int width, int height, int velocity, int pointvalue) {
		super(x, y, width, height, velocity,  pointvalue);
		// TODO Auto-generated constructor stub
	}
void update(Graphics g){
	g.setColor(Color.GRAY);
	g.fillRect(x,y,width,height);
}
void update(){
	y=y-velocity;
}
}
