import java.awt.Graphics;
import java.lang.Math;

import com.madgag.gif.fmsware.GifDecoder;

public class FireBall extends Thing {

	private static GifDecoder fire = new GifDecoder("Fireball.gif");
	private int frame;
	private int startX, startY, endX, endY, changeX, changeY;
	private double distance;
	private int speed;
	private boolean isHit;

	public FireBall(int snobbyX, int snobbyY, int targetX, int targetY) {
		super(snobbyX, snobbyY);
		// TODO Auto-generated constructor stub
		frame = 0;
		isHit = false;
		createBox(30, 25);
		startX = snobbyX;
		startY = snobbyY;
		endX = targetX;
		endY = targetY;
		changeX = endX - startX;
		changeY = endY - startY;
		distance = Math.sqrt(Math.pow(startX - endX, 2) + Math.pow(startY - endY, 2));
		speed = 10;
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		int n = frame%fire.getFrameCount();
		if (isHit) {
			//nothing
		}
		else {
		window.drawImage(fire.getFrame(n), getXPos(), getYPos(), null);
		}
		frame++;
		if (frame == fire.getFrameCount()) {
			frame = 0;
		}
		moveX(getXPos() + (int)(speed/distance*changeX));
		moveY(getYPos() + (int)(speed/distance*changeY));
	}
	
	public void hit() {
		isHit = true;
		createBox(0,0);
	}

}
