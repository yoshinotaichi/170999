import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import java.awt.Container;

public class TestGui extends JFrame {
	// data
	// method
	TestGui(String title) {
		setTitle(title);
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JTextField
		JTextField field = new JTextField("ALOHA");

		// JPanel
		JPanel panel = new JPanel();

		// JPasswordField
		JPasswordField pfield = new JPasswordField("ALOHA");

		// panel.add(field);
		// panel.add(pfield);
		panel.add(field, BorderLayout.NORTH);
		panel.add(pfield, BorderLayout.NORTH);

		Container cp = getContentPane();
		// cp.add(panel, BorderLayout.NORTH);
		cp.add(panel);
	}
	// main
	public static void main(String[] args) {
		TestGui frame = new TestGui("ALOHA");
		frame.setVisible(true);
	}
}