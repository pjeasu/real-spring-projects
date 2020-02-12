package edu.bit.ex.board2;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class BService2 {
	
	@Inject
	SqlSession sqlSession;	

	
	public List<BoardVO> selectBoardList() throws Exception{
		
		return sqlSession.selectList("board.selectBoardList");
		//selectList는 sqlSession에서 제공하는 함수
		//board.selectBoardList는 개발자가 직접 정의하는것 
	}

}


