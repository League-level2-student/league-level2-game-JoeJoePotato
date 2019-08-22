import java.util.ArrayList;
import java.util.Random;

public class Objectmanager {
submarine s;
Random random=new Random();

ArrayList<torpedo> up = new ArrayList<torpedo>();

ArrayList<torpedo> down = new ArrayList<torpedo>();

ArrayList<submarine> ships = new ArrayList<submarine>();

Objectmanager(submarine s){
		this.s=s;
	}
	
void update() {
	
}

void addShip1(){
ships.add(new submarine(550,0,50,150, 18,50));
}

void addShip2(){
ships.add(new submarine(450,0,50,100, 15,150));
}

void addShip3(){
ships.add(new submarine(350,0,50,150, 12,250));
}

void addShip4(){
ships.add(new submarine(250,0,50,150, 9,500));
}

void addShip5(){
ships.add(new submarine(150,0,50,150, 5,825));
}

void addtorp(){
up.add(new torpedo(s.x,750,10,20, 18,0));
}

void adddepthc(){
down.add(new torpedo(random.nextInt(1000),0,10,20, 18,0));
}

}
