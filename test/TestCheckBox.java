// checkboxのサンプル
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;

public class TestCheckBox extends JFrame {
	// data
	// method
	TestCheckBox(String title) {
		// JFrame
		setTitle(title);
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JCheckBox
		JCheckBox check1 = new JCheckBox("Java");
		JCheckBox check2 = new JCheckBox("Kotlin");
		JCheckBox check3 = new JCheckBox("Swift");

		// JPanel
		JPanel panel = new JPanel();
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);

		// Container
		Container cp = getContentPane();
		cp.add(panel, BorderLayout.NORTH);

	}
	// main
	public static void main(String[] args) {
		TestCheckBox frame = new TestCheckBox("ALOHA");
		frame.setVisible(true);
	}
}