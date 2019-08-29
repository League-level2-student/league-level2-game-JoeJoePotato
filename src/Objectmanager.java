import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Objectmanager implements ActionListener {
submarine s;
Random random=new Random();

ArrayList<torpedo> up = new ArrayList<torpedo>();

ArrayList<torpedo> down = new ArrayList<torpedo>();

ArrayList<submarine> ships = new ArrayList<submarine>();

Objectmanager(submarine s){
		this.s=s;
	}
	
void update() {
for (int i = 0; i <ships.size(); i++) {
	submarine jeb=ships.get(i);
	if (jeb.x>1000) {
		jeb.isActive=false;
	}
}	
	for (int j = 0; j <up.size(); j++) {
		torpedo jed=up.get(j);
		if (jed.y<0) {
			jed.isActive=false;
		}
		}
	
	
for (int z = 0; z <down.size(); z++) {
	torpedo zed=down.get(z);
	if (zed.y>1100) {
		zed.isActive=false;
	}
}	
}



void purgeObjects() {
for (int i = 0; i <ships.size(); i++) {
	submarine jeb=ships.get(i);
	if (jeb.isActive==false) {
		ships.remove(i);
	}
}	
	for (int j = 0; j <up.size(); j++) {
		torpedo jed=up.get(j);
		if (jed.isActive==false) {
			ships.remove(j);
		}
	}
	
for (int z = 0; z <down.size(); z++) {
	torpedo zed=down.get(z);
	if (zed.isActive==false) {
		ships.remove(z);
	}
}	
}








void draw(Graphics g) {
	for (int i = 0; i <ships.size(); i++) {
		submarine jeb=ships.get(i);
		jeb.move();
		jeb.draw(g);
	
	}	
		for (int j = 0; j <up.size(); j++) {
			torpedo jed=up.get(j);
		jed.update();
			jed.draw(g);
		
		}
		
	for (int z = 0; z <down.size(); z++) {
		torpedo zed=down.get(z);
		zed.draw(g);
	}	
s.draw(g);

}

void addShip1(){
ships.add(new submarine(0,550,125,30, 18,50));
}

void addShip2(){
ships.add(new submarine(0,450,100,50, 8,150));
}

void addShip3(){
ships.add(new submarine(0,350,150,50, 6,250));
}

void addShip4(){
ships.add(new submarine(0,250,150,50, 5,500));
}

void addShip5(){
ships.add(new submarine(0,150,125,60, 3,825));
}

void addtorp(torpedo t){
up.add(t);
}

void adddepthc(){
down.add(new torpedo(random.nextInt(1000),0,10,20, 18,0));
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
int p=	random.nextInt(5);
if(p==0) {
	addShip1();
}else if(p==1) {
	addShip2();
}else if(p==2) {
	addShip3();
}else if(p==3) {
	addShip4();
}else if(p==4){
	addShip5();
}

}

}
