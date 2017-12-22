import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJCheckBox extends JFrame implements ActionListener{
	// data
	JCheckBox check1;
	JCheckBox check2;
	JCheckBox check3;
	JLabel label1;
	JLabel label2;
	JLabel label3;

	// method
	public void actionPerformed(ActionEvent e) {
		System.out.println("CLICK!");

		// もしチェックボックス1が選択されていたら
		if(this.check1.isSelected()){
			this.label1.setText("1は選択されている");
		}
	}
	HelloJCheckBox(String title) {
		// JFrame
		setTitle(title);
		setSize(400, 400);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JCheckBox
		this.check1 = new JCheckBox("A");
		this.check2 = new JCheckBox("B");
		this.check3 = new JCheckBox("C");

		// JLabel
		this.label1 = new JLabel("test");
		this.label2 = new JLabel("test");
		this.label3 = new JLabel("test");

		// JButton
		JButton btn = new JButton("Click me!");
		btn.addActionListener(this);

		// JPanel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(7, 1));

		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(btn);

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