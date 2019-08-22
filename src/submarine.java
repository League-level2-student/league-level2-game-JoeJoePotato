import java.awt.Color;
import java.awt.Graphics;

public class submarine extends ship{
	boolean isactive=true;
	submarine(int x, int y, int width, int height, int velocity, int pointvalue) {
		super(x, y, width, height, velocity, pointvalue);
		// TODO Auto-generated constructor stub
	}
void draw(Graphics g){
	g.setColor(Color.GRAY);
	g.fillRect(x,y,width,height);
}
void move() {
	 x=x+velocity;
}
}
