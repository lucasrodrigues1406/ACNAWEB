package com.github.lucas1406.study_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.lucas1406.study_thymeleaf.model.Pessoa;
import com.github.lucas1406.study_thymeleaf.repository.PessoaMockup;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

	@RequestMapping(value ="/form", method = RequestMethod.GET)
	public String form(Model model) {
		model.addAttribute("pessoa", new Pessoa());
		return "pessoa/form.html";
	}
	@RequestMapping(value ="/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("pessoas", PessoaMockup.list());
		return "pessoa/list.html";
	}
	
	/// /pessoas/save
	@RequestMapping(value ="/save", method = RequestMethod.POST)
	public String save(Pessoa pessoa, Model model){
		model.addAttribute("pessoa", new Pessoa());
		return "pessoa/form.html";
	}
}
