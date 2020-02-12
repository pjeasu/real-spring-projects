package edu.bit.ex.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.bit.ex.service.EmpService;
import edu.bit.ex.vo.EmpVO;


@RestController
@RequestMapping("/rest/*")
public class BoardRestController {

	@Inject
	EmpService empService;

	
	@RequestMapping("/emp")
	public List<EmpVO> emp(Model model) {
		System.out.println("emp()");
		
		return empService.selectBoardList();
	}

	
	
	
	
	
	
}
