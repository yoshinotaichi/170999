// btn clickで、checkbox を選択状態にするサンプル
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestCheckBox2 extends JFrame implements ActionListener{
	// data
	JCheckBox check;
	// method
	public void actionPerformed(ActionEvent e) {
		this.check.setSelected(true);
	}

	TestCheckBox2(String title) {
		// JFrame
		setTitle(title);
		setSize(400, 400);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JButton
		JButton btn = new JButton("click to check");
		btn.addActionListener(this);

		// JCheckBox
		this.check = new JCheckBox("check1");

		// JPanel
		JPanel panel = new JPanel();
		panel.add(check);
		panel.add(btn);

		// Container
		Container cp = getContentPane();
		cp.add(panel, BorderLayout.NORTH);
	}
	// main
	public static void main(String[] args) {
		TestCheckBox2 frame = new TestCheckBox2("ALOHA");
		frame.setVisible(true);
	}
}