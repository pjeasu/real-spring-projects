package edu.bit.ex.board4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//네번째 방법
//1. 첫번째와 같은 방식임, 대신 sqlSession.getMapper 함수를 사용하지 않는다.
//2. 간단하고,, 심플하다,,
//3. <!-- 	Mapper Interface -->
//	 <mybatis-spring:scan base-package="edu.bit.ex.*"/> 
//	 root-context.xml에 추가해야함
//	 xml파일을 읽는게 아니라 인터페이스를 읽어들임

//첫번째 두번째 방법은 예전소스에서 많이 볼수있고 요즘은 네번째를 가장 많이 사용한다

@Controller
public class BController4 {
	
	@Autowired
	BService4 bservice;
	
	@RequestMapping("/list4")
	public String list4(Model model) throws Exception{
		System.out.println("list4()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
	}
	

	
	
}
