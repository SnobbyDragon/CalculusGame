import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable, MouseListener {
	
	private KeyLis keyboard;
	
	private class KeyLis extends KeyAdapter {
	      @Override
	      public void keyPressed(KeyEvent e) {
	         switch (e.getKeyCode()) {
	         case KeyEvent.VK_LEFT:
	        	 	snobby.move(false);
	            break;
	         case KeyEvent.VK_RIGHT:
	            snobby.move(true);
	            break;
	         case KeyEvent.VK_UP:
	        	 	
	        	 	break;
	         }
	      }
	   }

	private SnobbyDragon snobby;
	private Background background;
	private ArrayList<FireBall> fire;
	private ArrayList<Answer> answers;
	public static Question quest;
	
	public GamePanel() {
		// TODO Auto-generated constructor stub
		setSize(Runner.WIDTH, Runner.HEIGHT);
		setVisible(true);
		setFocusable(true);
	    requestFocus();
		setDoubleBuffered(true);
		new Thread(this).start();

		//interactive components
		addMouseListener(this);
		keyboard = new KeyLis();
	    addKeyListener(keyboard);
		
		snobby = new SnobbyDragon(50, 100);
		background = new Background();
		fire = new ArrayList<FireBall>();
		answers = new ArrayList<Answer>();
		answers.add(new Answer(-420, 100));
		answers.add(new Answer(-420, 300));
		answers.add(new Answer(-420, 500));
		quest = new Question(100, 0);
	}
	
	@Override
	public void paint(Graphics window) {
		background.draw(window);
		snobby.draw(window);
		quest.draw(window);
		for (Answer a : answers) {
			a.draw(window);
		}
		for (FireBall f : fire) {
			f.draw(window);
			for (Answer a : answers) {
				if (f.getBox().intersects(a.getBox())) {
					if (quest.getCurrent() == a.getCurrent()) { //correct answer
						quest.randomQ();
						System.out.println("CORRECT");
					}
					else {
						System.out.println("WRONG");
					}
					f.hit();
					a.hit();
				}
			}
		}
	}
	
	@Override
	public void update(Graphics window) {
		paint(window);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				Thread.currentThread();
				Thread.sleep(25);
				repaint();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		fire.add(new FireBall(snobby.getXPos() + 100, snobby.getYPos() + 80, e.getX(), e.getY()));
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
