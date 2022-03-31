package cl.icap.fullstackjava.modulo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebAppController {
	@RequestMapping("/")
	public String getHome() {
		return("index");
	}
	
	@RequestMapping("/employees")
	public @ResponseBody String getEmployees() {
		return("employees");
	}
	
}
