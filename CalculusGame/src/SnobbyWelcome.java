import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;

public class SnobbyWelcome {

	public JFrame frame;
	private final static ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the application.
	 */
	public SnobbyWelcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnLetsDoThis = new JButton("Let's do this!");
		btnLetsDoThis.setBackground(Color.CYAN);
		btnLetsDoThis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		buttonGroup.add(btnLetsDoThis);
		frame.getContentPane().add(btnLetsDoThis, BorderLayout.SOUTH);
		
		
	
			
		JTextArea txtrWelcomeToSpin = new JTextArea();
		txtrWelcomeToSpin.setEditable(false);
		txtrWelcomeToSpin.setWrapStyleWord(true);
		txtrWelcomeToSpin.setRows(1);
		txtrWelcomeToSpin.setLineWrap(true);
		txtrWelcomeToSpin.setBackground(Color.CYAN);
		txtrWelcomeToSpin.setText("Ready to learn some calculus?! The town of Schwetzia has been plagued by evil monsters! As Snobby Dragon, your task is to shoot fireballs at as many of the monsters as you can. A problem will pop up on the screen, and you will have some time to shoot a fireball at the monster with the correct answer. To shoot a fireball, simply click where you want to shoot.");
		frame.getContentPane().add(txtrWelcomeToSpin, BorderLayout.CENTER);
	}

}