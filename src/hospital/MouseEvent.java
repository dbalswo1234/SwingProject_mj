package hospital;

import java.awt.event.MouseListener;

public interface MouseEvent extends MouseListener {
	
	@Override
	default void mouseClicked(java.awt.event.MouseEvent e) {
		if(e.getButton()==1) {}  //클릭
		if(e.getClickCount()==2) {} //더블클릭
		if(e.getButton()==3) {}    //오른쪽버튼 클릭
 	}

}
