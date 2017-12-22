// メニューを作る
import javax.swing.*;
import java.awt.*;

public class HelloMenu extends JFrame {
	// data
	// method
	HelloMenu(String title) {
		// JFrame
		setTitle(title);
		setSize(400, 400);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JMenuBar
		JMenuBar menubar = new JMenuBar();

		// JMenu
		JMenu menu1 = new JMenu("File");

		// JMenuItem
		JMenuItem menuItem1 = new JMenuItem("New");
		JMenuItem menuItem2 = new JMenuItem("Open");

		// set, add
		setJMenuBar(menubar);
		menubar.add(menu1);
		menu1.add(menuItem1);
		menu1.add(menuItem2);
	}
	// main
	public static void main(String[] args) {
		HelloMenu frame = new HelloMenu("ALOHA");
		frame.setVisible(true);
	}
}