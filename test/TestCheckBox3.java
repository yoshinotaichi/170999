// checkbox に mnemonic を設定する
// ↑　動作せず。Macでは動かない？Winでは未確認。
// 20171206
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.BorderLayout;

public class TestCheckBox3 extends JFrame {
	// data
	// method
	TestCheckBox3(String title) {
		// JFrame
		setTitle(title);
		setSize(400, 400);
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JCheckBox
		JCheckBox check1 = new JCheckBox("Linux");
		check1.setMnemonic(KeyEvent.VK_L);
		JCheckBox check2 = new JCheckBox("Mac");
		check2.setMnemonic(KeyEvent.VK_M);
		JCheckBox check3 = new JCheckBox("Windows");
		check3.setMnemonic(KeyEvent.VK_W);

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
		TestCheckBox3 frame = new TestCheckBox3("ALOHA");
		frame.setVisible(true);
	}
}