// JPasswordFieldを使うサンプル
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;

public class TestPwd extends JFrame{
	// data
	// method
	TestPwd(String title) {
		// JFrame
		setTitle(title);
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JLabel
		JLabel nameLabel = new JLabel("name");
		JLabel pwdLabel = new JLabel("password");

		// JTextField
		JTextField nameField = new JTextField("", 10);

		// JPasswordField
		JPasswordField pwdField = new JPasswordField("", 10);

		// JPanel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(pwdLabel);
		panel.add(pwdField);

		// Container
		Container cp = getContentPane();
		cp.add(panel, BorderLayout.NORTH);
	}
	// main
	public static void main(String[] args) {
		TestPwd frame = new TestPwd("ALOHA");
		frame.setVisible(true);
	}
}