


	import java.awt.Rectangle;

	public class ship {
	int x;
	int y;
	int width;
	int height;
	int velocity;
	Rectangle collisionbox;
	Boolean isActive=true;
	ship(int x, int y, int width, int height, int velocity){
		this.velocity=velocity;
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
		collisionbox=new Rectangle( x,y,width,height);
	}
	 void Cupdate(){
		
	}
	 
	 void move() {
		 x=x-velocity;
	 }
	 
	}

