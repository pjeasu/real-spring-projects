package edu.bit.ex.board4;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface BoardMapper4 {

	public List<BoardVO> selectBoardList();
	
	@Select("select bid from mvc_board order by bGroup desc, bStep asc")
	public List<BoardVO> selectBoardList_();
	//세번째, 네번째 방식은 같이 사용하는게 대부분이다.
	//내부적으로는 BoardVO 객체를 넣을때... 컬럼명과 BoardVo의 변수명을 맞춰서 setter함수를 호출해 값을 대입하는것 
	//bid만 불러와도 그 값만 입력하고 나머지 값은 입력하지 않으므로 오류는 나지 않고 bid만 출력된다 
	
	
	public void selectBoardWrite();
}

