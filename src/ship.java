


	import java.awt.Rectangle;

	public class ship {

		int x;
	int y;
	int width;
	int height;
	int velocity;
	int pointvalue;
	Rectangle collisionbox;
	Boolean isActive=true;
	ship(int x, int y, int width, int height, int velocity, int pointvalue){
		this.velocity=velocity;
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
		this.pointvalue=pointvalue;
		collisionbox=new Rectangle( x,y,width,height);
	}
	 void Cupdate(){
	        collisionbox.setBounds(x, y, width, height);

	}
	 
	
	 
	}

