import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloJCheckBox extends JFrame implements ActionListener{
	// data
	JLabel label;

	// method
	public void actionPerformed(ActionEvent e) {
		System.out.println("CLICK!");

		this.label.setText("CLICK!");
	}
	HelloJCheckBox(String title) {
		// JFrame
		setTitle(title);
		setSize(400, 400);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JCheckBox
		JCheckBox check1 = new JCheckBox("iPhone", true);
		JCheckBox check2 = new JCheckBox("Palm");
		JCheckBox check3 = new JCheckBox("BlackBerry");

		// JButton
		JButton btn = new JButton("CHECK");
		btn.addActionListener(this);

		// JLabel
		this.label = new JLabel("This is a JLabel.");

		// JPanel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 1));
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		panel.add(btn);
		panel.add(label);

		// Container
		Container cp = getContentPane();
		cp.add(panel, BorderLayout.NORTH);
	}
	// main
	public static void main(String[] args) {
		HelloJCheckBox frame = new HelloJCheckBox("ALOHA");
		frame.setVisible(true);
	}
}