package edu.bit.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;

@Controller
public class BoardController {
	
	
	@Autowired
	private BoardService boardservice;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		
		List<BoardVO> list =  boardservice.getBoardList();
		model.addAttribute("list", list);
		
		return "list";
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		System.out.println("write_view()");
		
		
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(BoardVO boardVO) {//커맨드객체 이용하기! 
		System.out.println("write()");
		int rn = boardservice.boardWrite(boardVO.getbName(), boardVO.getbTitle(), boardVO.getbContent());
		
		System.out.println("결과 값 : " + rn);
		
		return "redirect:list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(Model model, BoardVO boardVO) {
		System.out.println("content_view()");
		
		int id = boardVO.getbId();
		BoardVO view  = boardservice.contentView(Integer.toString(id));
		model.addAttribute("content_view", view);
		
		return "content_view";
	}

}
