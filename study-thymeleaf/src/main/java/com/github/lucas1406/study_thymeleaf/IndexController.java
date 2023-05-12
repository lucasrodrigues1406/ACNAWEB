package com.github.lucas1406.study_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping (method = RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("mensagem", "Olá mundo!");
		
		return "index.html";
		}

}
