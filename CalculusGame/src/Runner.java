import javax.swing.JFrame;

public class Runner extends JFrame {
	
	private static final int WIDTH = 1000, HEIGHT = 800;

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
		Runner run = new Runner();
	}

}
