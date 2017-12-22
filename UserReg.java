// メールアドレスとパスワードを入力するウィンドウを作る
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;

public class UserReg extends JFrame {
	// data
	// method
	UserReg(String title) {
		// JFrame
		setTitle(title);
		setSize(400, 400);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JLabel
		JLabel mailLabel = new JLabel("mail");
		JLabel pwdLabel = new JLabel("password");

		// JTextField
		JTextField mailField = new JTextField("mail address", 20);

		// JPasswordField
		JPasswordField pwdField = new JPasswordField("aloha", 20);

		// JPanel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		panel.add(mailLabel);
		panel.add(mailField);
		panel.add(pwdLabel);
		panel.add(pwdField);

		// Container
		Container cp = getContentPane();
		cp.add(panel, BorderLayout.NORTH);
	}
	// main
	public static void main(String[] args) {
		UserReg frame = new UserReg("ALOHA");
		frame.setVisible(true);
	}
}