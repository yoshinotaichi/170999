// チェックボックスを作ってみる
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.Container;

public class TestCheckBox extends JFrame {
	// data
	// method
	TestCheckBox(String title) {
		// JFrame
		setTitle(title);
		setSize(400, 400);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JCheckBox
		JCheckBox check1 = new JCheckBox("Linux");
		JCheckBox check2 = new JCheckBox("macos");
		JCheckBox check3 = new JCheckBox("Android");

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