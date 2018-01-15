import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Hello extends JFrame {
	// data
	// method
	Hello (String title) {
		setTitle(title);
		setSize(400, 400);
		setLocation(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JPanel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));

		// JLabel
		JLabel label = new JLabel("HELLO2018");

		// JTextField
		JTextField name = new JTextField("NAME");

		// JButton
		JButton okBtn = new JButton("OK");

		// JPanel
		panel.add(label);
		panel.add(name);
		panel.add(okBtn);

		// container
		Container cp = getContentPane();
		cp.add(panel, BorderLayout.NORTH);
	}
	// main
	public static void main(String[] args) {
		Hello frame = new Hello("ALOHA");
		frame.setVisible(true);
	}
}