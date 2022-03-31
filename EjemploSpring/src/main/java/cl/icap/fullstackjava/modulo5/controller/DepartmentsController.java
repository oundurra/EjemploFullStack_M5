package cl.icap.fullstackjava.modulo5.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.icap.fullstackjava.modulo5.model.dto.DepartmentsDTO;
import cl.icap.fullstackjava.modulo5.service.DepartmentsService;

@Controller
@RequestMapping("/department")
public class DepartmentsController {
	@Autowired
	DepartmentsService departmentsService;
	
	@RequestMapping("/list")
	public @ResponseBody List<DepartmentsDTO> list(HttpServletRequest request, HttpServletResponse response ) {
		return departmentsService.list();
	}
}
