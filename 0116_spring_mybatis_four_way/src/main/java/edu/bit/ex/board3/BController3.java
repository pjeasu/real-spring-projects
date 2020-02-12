package edu.bit.ex.board3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//세번째 방법
//1. 인터페이스 안에 있는 메소드에 @을 붙이는 방법
//2. XML파일과, sqlSession 객체 필요없음
//3. 쿼리가 길어지면 사용하기 힘들다
//4. <!-- 	Mapper Interface -->
//	 <mybatis-spring:scan base-package="edu.bit.ex.*"/> 
//	 root-context.xml에 추가해야함
//	 xml파일을 읽는게 아니라 인터페이스를 읽어들임

@Controller
public class BController3 {
	
	@Autowired
	BService3 bservice;
	
	@RequestMapping("/list3")
	public String list3(Model model) throws Exception{
		System.out.println("list3()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
	}
	
	
}
