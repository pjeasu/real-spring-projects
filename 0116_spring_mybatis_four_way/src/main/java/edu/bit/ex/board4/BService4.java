package edu.bit.ex.board4;

import java.util.List;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class BService4 {
	
	@Inject
	BoardMapper4 boardMapper;

	public List<BoardVO> selectBoardList() throws Exception{
		return boardMapper.selectBoardList();
	}
	
	public List<BoardVO> selectBoardList_() throws Exception{
		return boardMapper.selectBoardList_();
	}

	
	
	public void selectBoardWrite(String bName, String bTitle, String bContent) {
		boardMapper.selectBoardWrite();
	}
}

