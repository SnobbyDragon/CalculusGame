import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Runner extends JFrame {
	
	public static final int WIDTH = 900, HEIGHT = 600;

	public Runner() {
		// TODO Auto-generated constructor stub
		super("Calculus Game");
		setVisible(true);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		add(new GamePanel());
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	            Runner run = new Runner();
	         }
	      });
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SnobbyWelcome window = new SnobbyWelcome();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	   }

}
