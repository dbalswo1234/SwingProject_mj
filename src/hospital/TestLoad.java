package hospital;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TestLoad extends JFrame {
	
	public TestLoad() {
		setTitle("사진 불러오기");
		setSize(500, 500);
		JButton  btn1 = new JButton("이미지 로드");
		btn1.setBounds(148, 181, 162, 57);
		getContentPane().add(btn1);
		
		
//		JButton btn1 = new JButton("이미지 로드");
		getContentPane().setLayout(null);
		// 사진 등록을 위한 JFileChooser 객체 생성
		JFileChooser fileOpen = new JFileChooser();
		// 필터링 확장자 지정
		FileNameExtensionFilter fileName = new FileNameExtensionFilter("jpg", "jpg");
		// 확장자 추가
		fileOpen.addChoosableFileFilter(fileName);
		fileOpen.showOpenDialog(btn1);
		// 회원 사진 저장
		ImageIcon userIma = new ImageIcon(fileOpen.getSelectedFile().toString());
		String imageName = fileOpen.getSelectedFile().toString();
		
		System.out.println(imageName);
		int offset = btn1.getInsets().left;
//		btn1.setIcon(imageSize(userIma, btn1.getWidth() - offset, btn1.getHeight() - offset));
		
//		String result = new TCPClient1().userImage(user[0] + "\n" + imageName);
//		System.out.println(result);
		getContentPane().add(btn1);
		
		
		setVisible(true);
	}
}
