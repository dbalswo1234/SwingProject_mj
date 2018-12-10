package hospital;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class TestMain extends JFrame{

	public TestMain() {
		JPanel panel = new JPanel();
		setTitle("테스트용");
		setSize(1100, 279);
		try {
			TableListAll all = new TableListAll();
			getContentPane().add(all, BorderLayout.NORTH);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new TestMain();
	}

}
