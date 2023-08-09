package com.example.ex03.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class JspController {

	@RequestMapping("/home")
	public String home(Model model) {
//		log.info("JspController.home()================>");
		model.addAttribute("msg", "Hello Spring Boot JSP");
		return "home";
	}
	
}
