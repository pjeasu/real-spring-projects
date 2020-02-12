package edu.bit.ex.board1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 첫번째 방법 !!
// 1. interface IBDao를 XML namespace에 매핑 <mapper namespace="edu.bit.ex.board1.IBDao">
// 2. sqlSession.getMapper(IBDao.class)를 이용
// 요즘은 잘 사용하지 않는 방법임

@Controller
public class BController1 {
	
	@Autowired
	BService1 bservice;
	
	@RequestMapping("/list1")
	public String list1(Model model) throws Exception{
		System.out.println("list1()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
	}
	
	
}
