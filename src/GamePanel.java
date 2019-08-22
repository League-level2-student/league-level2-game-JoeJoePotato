import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel  extends JPanel implements ActionListener, KeyListener {
	public static final int INTRO=1;
	public static final int GAME=2;
	public static final int CREDITS=3;
	submarine s=new submarine(500, 750,50,100, 12,0);
	 Font titleFont = new Font("Arial", Font.PLAIN, 48);
	Timer frameDraw;
	int currentstate=INTRO;
		GamePanel() {
			frameDraw = new Timer(1000 / 60, this);
			frameDraw.start();
			
		
	
		}
		
	void	updateMenuState() { }
		void updateGameState() {  }
	void	 updateEndState()  {  }
	void drawMenuState(Graphics g) {  
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, MainSetup.WIDTH, MainSetup.HEIGHT);
		
		g.fillRect(0, 0, MainSetup.WIDTH, MainSetup.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Torpedo Away!\n  \n  ", 100, 100);
		g.drawString("a Graham Garibaldi Game",100, 200); 	
		g.drawString("press enter to play",100, 300);
		g.drawString("press space for instructions",100, 400);
	}
	void  drawGameState(Graphics g) {  
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, MainSetup.WIDTH, MainSetup.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Score: "+"Torpedos: ", 100, 100);
s.draw(g);
	}
	void  drawEndState(Graphics g)  {  
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, MainSetup.WIDTH, MainSetup.HEIGHT);
	}
		
		@Override
		public void paintComponent(Graphics g){
		
			if(currentstate == INTRO){
			    drawMenuState(g);
			}else if(currentstate == GAME){
			    drawGameState(g);
			}else if(currentstate == CREDITS){
			    drawEndState(g);
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(currentstate == INTRO){
			    updateMenuState();
			}else if(currentstate == GAME){
			    updateGameState();
			}else if(currentstate == CREDITS){
			    updateEndState();
			}
			repaint();
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		
		}
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

			if (e.getKeyCode() == 10 ) {
			
				if (currentstate == CREDITS) {
					currentstate = INTRO;
					
				}else {
					
					currentstate++;
				
				}
		}
			if(currentstate==GAME) {
				if (e.getKeyCode()==KeyEvent.VK_UP) {
				    System.out.println("UP");
				}
				if (e.getKeyCode()==KeyEvent.VK_DOWN) {
				    System.out.println("down");
				}
				if (e.getKeyCode()==KeyEvent.VK_LEFT) {
				    System.out.println("left");
				s.velocity=-12;
				s.move();
				}
				if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
				    System.out.println("right");
				s.velocity=12;
				s.move();
				}
			
			}
			
			
			
			
			
			
		
		}	
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	
	
	
	
}
