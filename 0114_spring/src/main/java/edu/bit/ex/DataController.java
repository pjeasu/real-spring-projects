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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.bit.ex.member.Member;
import edu.bit.ex.student.StudentInformation;

//13°­

/**
 * Handles requests for the application home page.
 */
@Controller
public class DataController {

	private static final Logger logger = LoggerFactory.getLogger(DataController.class);

	@RequestMapping("form/confirm")
	public String confirm(HttpServletRequest req, Model model) {
		logger.info("confirm");

		String id = req.getParameter("id");
		String pw = req.getParameter("pw");

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "form/confirm";
	}

	@RequestMapping("form/check")
	public String check(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model) {
		logger.info("check");

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "form/confirm";
	}

	@RequestMapping("/member/join")
	public String join(Member member) {
		logger.info("join");

		return "member/join";
	}
	
	@RequestMapping("student/{studentId}")
	public String getStudent(@PathVariable String studentId, Model model) {
		logger.info("getStudent");
		model.addAttribute("studentId", studentId);

		return "student/studentView2";
	}
	
	
}
