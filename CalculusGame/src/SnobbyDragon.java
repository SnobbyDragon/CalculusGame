

import java.awt.Graphics;

import com.madgag.gif.fmsware.GifDecoder;

public class SnobbyDragon extends Thing {

	private static GifDecoder walking = new GifDecoder("Snobby Walk.gif");
	private int isWalking, isMoving, isJump, time, speed; 
	private final static int WALKING_RATE = 2;

	public SnobbyDragon(int x, int y) {
		super(x, y);	
		isWalking = 0;
		isMoving = 0;
		isJump = 0;
		time = 4;
		speed = 5;
		createBox(0,0);
	}
	
	@Override
	public void draw(Graphics window) {
		int n = isWalking/WALKING_RATE%walking.getFrameCount();
		window.drawImage(walking.getFrame(n), getXPos(), getYPos(), null);
		if (isWalking == WALKING_RATE*walking.getFrameCount()) {
			isWalking = 0;
		}
		else {
			isWalking++;
		}
		if (isMoving > 0) {
			moveX(getXPos() + speed);
			isMoving--;
		}
		else if (isMoving < 0) {
			moveX(getXPos() - speed);
			isMoving++;
		}
	}
	
	public void move(boolean isRight) {
		if (isRight) {
			isMoving = time;
		}
		else {
			isMoving = -1*time;
		}
	}
	
	public void jump() {
		isJump = 5;
	}

}
