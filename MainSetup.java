import java.awt.Dimension;

import javax.swing.JFrame;

public class MainSetup {
public static final int INTRO=1;
public static final int GAME=2;
public static final int CREDITS=3;
GamePanel g;
JFrame frame;
public static final int WIDTH=1000;
public static final int HEIGHT=1100;

MainSetup(){
	this.frame=frame;
}
public static void main(String[] args) {
MainSetup m= new MainSetup();		
m.setup();
}
public void setup() {
	Dimension d=new Dimension(WIDTH,HEIGHT);
	GamePanel gpanel=new GamePanel();
	frame.setVisible(true);
	frame.add(gpanel);
	frame.setPreferredSize(d);
	frame.addKeyListener(gpanel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.pack();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
