  // ラジオボタン3つ、ボタン1つ、ラベル1つ
  import javax.swing.JFrame;
  import javax.swing.JLabel;
  import javax.swing.JPanel;
  import javax.swing.JRadioButton;
  import javax.swing.JButton;
  import javax.swing.ButtonGroup;
  import java.awt.Container;
  import java.awt.BorderLayout;
  import java.awt.GridLayout;
  import java.awt.event.ActionListener;
  import java.awt.event.ActionEvent;
  
  public class HelloJRadioButton extends JFrame implements ActionListener{
    // data
    private JLabel label;
    private JRadioButton rbtn1;
    private JRadioButton rbtn2;
    private JRadioButton rbtn3;

    // method
    public void actionPerformed(ActionEvent e) {
      // ラジオボタンの状態を調べる
      Boolean kekka1 = this.rbtn1.isSelected();
      Boolean kekka2 = this.rbtn2.isSelected();
      Boolean kekka3 = this.rbtn3.isSelected();

      // 調べた結果をラベルに書き込む
      String msg = "";
      if(kekka1) {
        msg = this.rbtn1.getText()+"が選択されています。";
        this.label.setText(msg);
      }
      if(kekka2) {
        msg = this.rbtn2.getText()+"が選択されています。";
        this.label.setText(msg);
      }
      if(kekka3) {
        msg = this.rbtn3.getText()+"が選択されています。";
        this.label.setText(msg);
      }
    }

    HelloJRadioButton(String title) {
      // JFrame
      setTitle(title);
      setSize(400, 400);
      setLocation(400, 400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // JRadioButton
      this.rbtn1 = new JRadioButton("Mac");
      this.rbtn2 = new JRadioButton("Linux");
      this.rbtn3 = new JRadioButton("Windows");

      // ButtonGroup
      ButtonGroup rBtnGroup = new ButtonGroup();
      rBtnGroup.add(rbtn1);
      rBtnGroup.add(rbtn2);
      rBtnGroup.add(rbtn3);

      // JButton
      JButton btn = new JButton("click me");
      btn.addActionListener(this);
      
      // JLabel
      this.label = new JLabel("here is a label.");
      
      // JPanel
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(5, 1));
      panel.add(rbtn1);
      panel.add(rbtn2);
      panel.add(rbtn3);
      panel.add(btn);
      panel.add(this.label);
      
      // Container
      Container cp = getContentPane();
      cp.add(panel, BorderLayout.NORTH);
    }
    // main
    public static void main(String[] args) {
      HelloJRadioButton frame = new HelloJRadioButton("ALOHA");
      frame.setVisible(true); 
    }
  }
