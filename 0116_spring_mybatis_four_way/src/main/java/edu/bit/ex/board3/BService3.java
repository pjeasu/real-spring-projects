package edu.bit.ex.board3;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class BService3 {
	
	@Inject
	BoardMapper boardMapper;
	//마이바티스가 만들어둔 객체.. 인터페이스를 scan해서.. 해당 객체를 만드는것...

	public List<BoardVO> selectBoardList() throws Exception{
		return boardMapper.selectBoardList();
		
	}
}

