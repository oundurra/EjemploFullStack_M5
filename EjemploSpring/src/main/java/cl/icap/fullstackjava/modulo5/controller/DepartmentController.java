package cl.icap.fullstackjava.modulo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	@RequestMapping("/list")
	public @ResponseBody String list() {
		return "Respuesta de Controlador";
	}
}
