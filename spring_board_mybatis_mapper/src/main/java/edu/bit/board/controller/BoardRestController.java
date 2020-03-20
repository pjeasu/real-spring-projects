package edu.bit.board.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.bit.board.page.Criteria;
import edu.bit.board.page.PageMaker;
import edu.bit.board.service.BoardService;
import edu.bit.board.service.EmpService;
import edu.bit.board.vo.BoardVO;
import edu.bit.board.vo.EmpVO;

@RestController
@RequestMapping("/rest/*")
public class BoardRestController {
	
	@Inject
	BoardService boardService;
	
	@Inject
	EmpService empService;
	

	@RequestMapping("/list2")
	public List<BoardVO> list2(Criteria criteria, Model model) {
		System.out.println("list2()");
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(criteria);
		
		System.out.println(criteria.getPerPageNum());
		System.out.println(criteria.getPage());
		
		//전체 값 세팅
		int totalCount = boardService.selectCountBoard();
		System.out.println("전체 게시물 수를 구함:" + totalCount);
		pageMaker.setTotalCount(totalCount);
		
//		List<BoardVO> boardList =  boardService.selectBoardListPage(criteria);
//		model.addAttribute("list", boardList);
		model.addAttribute("pageMaker", pageMaker);
		
		return boardService.selectBoardListPage(criteria);
	}

	
	
	@RequestMapping("/emp")
	public List<EmpVO> emp(Model model) {
		System.out.println("emp()");
		
		return empService.selectBoardList();
	}

	
	
	
	
	
	
}
