// JPasswordFieldを使うサンプル
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import java.awt.Container;

public class TestJPasswordField extends JFrame {
	// data
	// method
	TestJPasswordField(String title) {
		// JFrame
		setTitle(title);
		setSize(400, 400);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JPanel
		JPanel panel = new JPanel();

		// JPasswordField
		JPasswordField field = new JPasswordField("ALOHA", 10);
		panel.add(field);

		// Container
		Container cp = getContentPane();
		cp.add(panel, BorderLayout.NORTH);
	}
	// main
	public static void main(String[] args) {
		TestJPasswordField frame = new TestJPasswordField("ALOHA");
		frame.setVisible(true);
	}
}