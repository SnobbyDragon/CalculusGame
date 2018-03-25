import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Answer extends Thing {
	
	private static ArrayList<BufferedImage> answers;
	private int current;
	private boolean isHit;

	public Answer(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		createBox(200, 50);
		isHit = false;
		answers = new ArrayList<BufferedImage>();
		BufferedImage img = null;
		try {
			for (int a = 1; a <= 8; a++) {
				img = ImageIO.read(new File("IA" + a + ".png"));
				answers.add(img);
			}
			for (int a = 1; a <= 6; a++) {
				img = ImageIO.read(new File("TA" + a + ".png"));
				answers.add(img);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		if (isHit) {
			//do nothing
		}
		else {
		window.drawImage(answers.get(current), getXPos(), getYPos(), null);
		}
		if (getXPos() < -100) {
			moveX(Runner.WIDTH);
			randomA(GamePanel.quest.getCurrent());
			isHit = false;
			createBox(200, 50);
		}
		else {
			moveX(getXPos() - 5);
		}
	}
	
	public void randomA(int i) {
		current = (int)(Math.random()*answers.size());
		if (Math.random() < 0.25) {
			current = i;
		}
	}
	
	
	public int getCurrent() {
		return current;
	}
	
	public void hit() {
		isHit = true;
		createBox(0,0);
	}

}
