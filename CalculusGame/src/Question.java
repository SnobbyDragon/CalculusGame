import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.Math;
import javax.imageio.ImageIO;

import java.util.ArrayList;

public class Question extends Thing {

	private static ArrayList<BufferedImage> questions;
	private int current;

	public Question(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		questions = new ArrayList<BufferedImage>();
		BufferedImage img = null;
		try {
			for (int a = 1; a <= 8; a++) {
				img = ImageIO.read(new File("IQ" + a + ".png"));
				questions.add(img);
			}
			for (int a = 1; a <= 6; a++) {
				img = ImageIO.read(new File("TQ" + a + ".png"));
				questions.add(img);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		randomQ();
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.drawImage(questions.get(current), getXPos(), getYPos(), null);
	}
	
	public void randomQ() { //changes the question
		current = (int)(Math.random()*questions.size());
	}
	
	public int getCurrent() {
		return current;
	}


}
