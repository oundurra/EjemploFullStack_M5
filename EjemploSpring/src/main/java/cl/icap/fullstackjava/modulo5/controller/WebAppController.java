package cl.icap.fullstackjava.modulo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {
	@RequestMapping("/")
	public String getHome() {
		return("index");
	}
	
	@RequestMapping("/departments_page")
	public String getDepartments() {
		return("departments");
	}

	@RequestMapping("/titletype_page")
	public String getTitleType() {
		return("titletypes");
	}
	
}
