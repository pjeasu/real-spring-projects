package edu.bit.ex;


import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.bit.ex.validator.Student;
import edu.bit.ex.validator.StudentValidator;

/**
 * Handles requests for the application home page.
 */
@Controller
public class StudentController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
//	@RequestMapping("/studentForm")
//	public String studentForm() {
//		logger.info("studentForm");
//		return "student/createPage";
//	}
//	
//	@RequestMapping("/student/create")
//	public String studentCreate(Student student, BindingResult result) {
//		logger.info("studentCreate");
//		String page = "student/createDonePage";
//		
//		StudentValidator validator = new StudentValidator();
//		validator.validate(student, result);
//		//error는 result의 부모클래스 > 다형성적용
//		if(result.hasErrors()) {
//			page = "student/createPage";
//		}
//		return page;
//	}
	
	
	
	
	@RequestMapping("/studentForm")
	public String studentForm() {
		logger.info("studentForm");
		return "student/createPage";
	}
	
	@RequestMapping("/student/create")
	public String studentCreate(@Valid Student student, BindingResult result) {
		logger.info("studentCreate");
		String page = "student/createDonePage";
		
//		StudentValidator validator = new StudentValidator();
//		validator.validate(student, result);
		//@Valid 사용하면 위의 코드를 사용할 필요없이 알아서 호출해줌
		
		
		if(result.hasErrors()) {
			page = "student/createPage";
		}
		
		return page;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new StudentValidator());
		//검증할 클래스, 커맨드 객체를 인자로 넣는다 
	}
	
	
	
}
