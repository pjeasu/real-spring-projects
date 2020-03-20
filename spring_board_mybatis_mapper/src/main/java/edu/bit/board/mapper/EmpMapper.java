package edu.bit.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;

import edu.bit.board.page.Criteria;
import edu.bit.board.vo.BoardVO;
import edu.bit.board.vo.EmpVO;

public interface EmpMapper { //영속계층 : persistence layer
	
	@Select("select empno, ename, sal, job, mgr, hiredate, comm, deptno from emp")
	public List<EmpVO> selectBoardList();
	
	
	@Select("select * from emp where empno = #{empno}")
	public EmpVO selectBoardOne(String empno);
	
	
//	@Insert("insert into emp (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) values (mvc_board_seq.nextval, #{bName}, #{bTitle}, #{bContent}, 0, mvc_board_seq.currval, 0, 0 )")
//	public void insertBoard(EmpVO param);
//	

//	
//	@Select("select count(*) from mvc_board")
//	public int selectCountBoard();
//	//알아서 값을 int 형으로 값을 반환해준다
//	
//	@Update("update mvc_board set bStep = bStep + 1 where bGroup = #{bGroup} and bStep > #{bStep}")
//	public void updateShape(EmpVO empVO);
//	//객체로 인자를 받아올때는 @Param 사용하지 않아도됨
//	
//	@Insert("insert into mvc_board (bId, bName, bTitle, bContent, bGroup, bStep, bIndent) values (mvc_board_seq.nextval, #{bName}, #{bTitle},#{bContent}, #{bGroup}, #{bStep}+1, #{bIndent}+1)")
//	public void insertReply(EmpVO empVO);
//
//	@Update("update mvc_board set bName = #{bName}, bTitle = #{bTitle}, bContent = #{bContent} where bId = #{bId}")
//	public void updateBoard(EmpVO empVO);
//	
//	@Delete("delete from mvc_board WHERE bId = #{bId}")
//	public void delete(EmpVO empVO);
//	
//	@Update("update mvc_board set bHit = bHit+1 where bId = #{bId}")
//	public void upHit(String bId);

//	public List<BoardVO> selectBoardListPage(Criteria criteria);
}
