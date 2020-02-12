package edu.bit.ex.board2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//두번째 방법
//1. interface는 필요없음
//2. sqlSession에서 제공하는 함수(selectList, selectOne..)을 이용함
//3. 쿼리구현을 위한 XML이 필요함. 해당 XML의 namespace는 개발자가 정한다.

@Controller
public class BController2 {
	
	@Autowired
	BService2 bservice;
	
	@RequestMapping("/list2")
	public String list2(Model model) throws Exception{
		System.out.println("list2()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
	}
	
	
}
