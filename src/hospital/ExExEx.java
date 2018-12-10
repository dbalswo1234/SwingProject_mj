package hospital;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExExEx extends JFrame {
	
	
	public ExExEx() {
		JButton btn1 = new JButton();
		setTitle("테스트용");
		setSize(500, 500);
		setLayout(null);
		add(btn1);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ExExEx();
	}

}
