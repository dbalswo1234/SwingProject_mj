package swingProject;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.SwingConstants;

public class LoginTest extends JFrame {
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField;

	public LoginTest() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Pictures\\이미지 048.png"));
		setTitle("로그인 테스트");
		setSize(558, 560);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("애플PC방");
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(162, 35, 222, 54);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(37, 472, 131, 39);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("회원가입");
		button.setBounds(383, 472, 131, 39);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("회원찾기");
		button_1.setBounds(239, 472, 131, 39);
		getContentPane().add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(208, 407, 85, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("패스워드");
		label.setFont(new Font("굴림", Font.PLAIN, 13));
		label.setBounds(208, 426, 74, 21);
		getContentPane().add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(277, 426, 160, 21);
		getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(277, 404, 160, 21);
		getContentPane().add(passwordField_1);
		
		JLabel label_1 = new JLabel("카드번호");
		label_1.setFont(new Font("굴림", Font.PLAIN, 12));
		label_1.setBounds(37, 407, 57, 15);
		getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(37, 426, 131, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setBounds(12, 380, 174, 76);
		getContentPane().add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("비회원 로그인");
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaptionBorder);
		panel_1.setBounds(198, 380, 335, 76);
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("회원 로그인");
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\PicPic\\이미지 047.png"));
		lblNewLabel_2.setBounds(0, 0, 542, 346);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(180, 25, 57, 15);
		getContentPane().add(lblNewLabel_5);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnNewButton, button, button_1, lblNewLabel_1, label, passwordField, passwordField_1, label_1, textField, panel, lblNewLabel_3, panel_1, lblNewLabel_4}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel_5, lblNewLabel_2, textField, getContentPane(), btnNewButton, button, button_1, lblNewLabel_1, label, passwordField, passwordField_1, label_1, panel, lblNewLabel_3, panel_1, lblNewLabel_4}));
		
		
		
		
		setVisible(true);

	}
}
