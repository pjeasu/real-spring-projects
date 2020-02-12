package edu.bit.ex.board1;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class BService1 {
	
	//@Autowired로 해도 상관없음
	@Inject
	SqlSession sqlSession;	
	//mybatis객체 !!!
	//new해서 새로운 객체를 생성하는게 아니라 root-context.xml에 있는 SQLSession 객체의 주소를 가져오는것! 의존성 주입............! ! 
	
	public List<BoardVO> selectBoardList() throws Exception{
		IBDao dao = sqlSession.getMapper(IBDao.class);
		return dao.listDao();
	}
	
	

	

}
