
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Thing {
	private int xPosition, yPosition; //position
	private Rectangle box;
	
	public Thing(int x ,int y) {
		xPosition = x;
		yPosition = y;
	}
	
	public abstract void draw(Graphics window);
	
	public void createBox(int width, int height) {
		box = new Rectangle(xPosition, yPosition, width, height);
	}
	
	public Rectangle getBox() {
		return box;
	}
	
	public int getXPos() {
		return xPosition;
	}
	
	public int getYPos() {
		return yPosition;
	}
	
	public void moveX(int x) {
		// moves the x-position to x
		xPosition = x;
		box.setLocation(xPosition, yPosition);
	}
	
	public void moveY(int y) {
		// moves the y-position to y
		yPosition = y;
		box.setLocation(xPosition, yPosition);
	}
	
}
