import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable, MouseListener {

	public GamePanel() {
		// TODO Auto-generated constructor stub
		setVisible(true);
		setIgnoreRepaint(true);
		setDoubleBuffered(true);
		new Thread(this).start();

		//interactive components
		addMouseListener(this);
	}
	
	@Override
	public void paint(Graphics window) {
		
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
				Thread.sleep(10);
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
