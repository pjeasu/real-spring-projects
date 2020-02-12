package edu.bit.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.bit.ex.member.Member;
import edu.bit.ex.student.StudentInformation;

//14강

/**
 * Handles requests for the application home page.
 */
@Controller
public class StudentController {

	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@RequestMapping("student/index")
	public String index() {
		logger.info("index");

		return "student/index";
	}
	
	//post 방식으로 받기위해선 파라미터 2개로 받아야한다 그러기위해서는 value, method 형식으로 받아야함
	//포스트 형식의 메소드를 받겠다는 뜻 
	@RequestMapping(value= "student/student", method = RequestMethod.POST)
	public String student(HttpServletRequest req, Model model) {
		logger.info("RequestMethod.POST");//디버깅코드
		
		String id = req.getParameter("id");
		System.out.println("id : " + id);
		
		model.addAttribute("id", id);
		
		return "student/student";
	}
	
	//Get 형식의 메소드만 받겠다는 뜻 
	//함수이름은 같지만 파라미터의 갯수가 다르고, 리턴타입이 다르므로 가능 > 오버로딩
	@RequestMapping(value= "student/student", method = RequestMethod.GET)
	public ModelAndView student(HttpServletRequest req) {
		logger.info("RequestMethod.GET");//디버깅코드
		
		String id = req.getParameter("id");
		System.out.println("id : " + id);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		mv.setViewName("student/student");
		
		return mv;
	}
	
	@RequestMapping("student/index2")
	public String index2() {
		logger.info("index2");

		return "student/index2";
	}
	

	//커맨드 객체 이름이 너무 길때, 객체의 이름을 변경할수있다
	@RequestMapping("student/studentView")
	public String studentView(@ModelAttribute("studentInfo") StudentInformation studentInformation) {
		logger.info("studentView");
		//post, get 방식을 지정하지 않아도, 커맨드 객체는 post 형식으로!

		return "student/studentView";
	}
	
	
	
	
	
}
