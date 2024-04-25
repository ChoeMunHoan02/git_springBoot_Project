package net.daum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GitController {

	@GetMapping("/git_test")
	public ModelAndView git_test() {
		
		int[] javaArr= {100,90,100};
		
		ModelAndView gm=new ModelAndView("git_Test");
		gm.addObject("javaArr", javaArr);
		return gm;
	}
}
