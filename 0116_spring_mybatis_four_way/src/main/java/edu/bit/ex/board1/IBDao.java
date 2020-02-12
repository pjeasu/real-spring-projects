package edu.bit.ex.board1;

import java.util.ArrayList;

public interface IBDao {
	//인터페이스므로 자식클래스가 구현을 해줘야하지만 mybatis가 해준다..  >> sqlmap/board1.xml
	public ArrayList<BoardVO> listDao();
	
}

