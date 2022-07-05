package com.bit.board;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.dto.PostDto;
import com.bit.mapper.PostMapper;

@Controller
public class BoardController {
	
	@Autowired
	private PostMapper postMapper;
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String boardPage(Model model) {
		
		//Mapper를 통해 List를 가져온다.
		List<PostDto> posts = postMapper.getList();
		
		//model을 통해 View로 전달한다.
		model.addAttribute("posts",posts);
		//진우테스트
		return "board";
	}

}
//