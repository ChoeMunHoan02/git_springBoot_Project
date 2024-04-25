package net.daum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class GitController {

	@GetMapping("/git_test")
	public ModelAndView git_test() {
		
		int[] javaArr= {100,90,100};
		
		ModelAndView gm=new ModelAndView("git_Test");
		gm.addObject("javaArr", javaArr);
		return gm;
	}
	
	@GetMapping("/git_test2")
	public String git_test2(HttpServletRequest request) {
		String[] nameArr= {"홍길동","이순신"};
		
		request.setAttribute("nameArr", nameArr);
		return "git_Test2";
	}
}
