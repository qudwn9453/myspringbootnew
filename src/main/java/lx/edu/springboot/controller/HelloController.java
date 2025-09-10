package lx.edu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lx.edu.springboot.vo.AddrBookVO;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		AddrBookVO vo = new AddrBookVO();
		vo.setAbName("hahaha");
		model.addAttribute("vo", vo);
		return "hello";
	}
	
}
