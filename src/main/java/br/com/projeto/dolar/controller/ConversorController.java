package br.com.projeto.dolar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.projeto.dolar.model.Conversor;

@Controller
public class ConversorController {


	@RequestMapping(value = "/conversor", method = RequestMethod.GET)
	public ModelAndView formulario(Model model) {
		model.addAttribute("conversor", new Conversor());
		return new ModelAndView("formulario");
	}
	
	@PostMapping(value = "/cadastro")
	public ModelAndView cadastrarTorcedor(@ModelAttribute Conversor conversor) {
		
		
		ModelAndView view = new ModelAndView("formulario");
		conversor.setResultado(conversor.getDolar() * conversor.getCotacao());
		view.addObject("mensagem", "");
		
		return view;
	}

}
