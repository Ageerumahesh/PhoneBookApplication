package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.dao.Contact;
import com.ashokit.service.ContactService;

@Controller
public class ContactInfoController {

	@Autowired
	private ContactService cntctSrvc;

	@RequestMapping(value = {"/","cntctCrtnSuces"},method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("contact", new Contact());

		return "index";
	}

	@PostMapping("/saveContact")
	public String handleSubmtBtn(@ModelAttribute("contact") Contact c, RedirectAttributes redrctAtrb) {
		boolean isSaved = false;
		
		isSaved = cntctSrvc.saveContact(c);
		if (isSaved)
			redrctAtrb.addFlashAttribute("sucssMsg", "Contact saved");
		else
			redrctAtrb.addFlashAttribute("errMsg", "failed to save");

		return "redirect:/cntctCrtnSuces";
	}

	
	
	public String handleviewCntctHyprLnk(Model model) {
		return null;
	}
}
