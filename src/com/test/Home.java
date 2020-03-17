package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

	@RequestMapping("/")
	public String mainMenu()
	{
		return "main-menu";
	}
	@RequestMapping("/tennis")
	public String mainMenu(Model model)
	{
		model.addAttribute("tennis", new Tennis());
		return "tennis-form";
	}
	@RequestMapping("/tennis-result")
	public String tennisMenu(@ModelAttribute("tennis") Tennis tennis)
	{
		System.out.println("--- result ---");
		return "tennis-result";
	}
	
}
