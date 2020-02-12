package edu.bit.ex;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */

@Controller
public class contentController {
	
	private static final Logger logger = LoggerFactory.getLogger(contentController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping("/board/content")
	public String content(Model model) {
		model.addAttribute("id", 30);
		return "board/content";
	}
}


