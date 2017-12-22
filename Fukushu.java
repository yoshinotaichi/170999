// 復習：チェックボックス、ボタン、ラベル1個ずつ
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fukushu extends JFrame implements ActionListener{
	// data
	JCheckBox check;
	JLabel label;

	// method
	public void actionPerformed(ActionEvent e) {
		// チェックボックスの状態を調べる
		Boolean jotai = this.check.isSelected();

		// 結果をラベルに書き込む
		if(jotai) {
			this.label.setText("selected!");
		} else {
			this.label.setText("NOT selected!");
		}
	}

	Fukushu(String title) {
		// JFrame
		setTitle(title);
		setSize(400, 400);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JCheckBox
		this.check = new JCheckBox("macOS");

		// JButton
		JButton btn = new JButton("push me");
		btn.addActionListener(this);

		// JLabel
		this.label = new JLabel("Here is a label");

		// JPanel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));
		panel.add(this.check);
		panel.add(btn);
		panel.add(label);

		// Container
		Container cp = getContentPane();
		cp.add(panel, BorderLayout.NORTH);
	}
	// main
	public static void main(String[] args) {
		Fukushu frame = new Fukushu("ALOHA");
		frame.setVisible(true);
	}
}