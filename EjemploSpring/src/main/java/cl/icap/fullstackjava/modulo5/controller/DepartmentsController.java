package cl.icap.fullstackjava.modulo5.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.icap.fullstackjava.modulo5.model.entity.Departments;
import cl.icap.fullstackjava.modulo5.service.DepartmentsService;

@Controller
@RequestMapping("/department") // http://localhost:8080/department
public class DepartmentsController {
	@Autowired
	DepartmentsService departmentsService;
	
	@RequestMapping("/list") 
	public @ResponseBody List<Departments> list(HttpServletRequest request, HttpServletResponse response) {
		return departmentsService.list();
	}
	
	@RequestMapping("/update") 
	public @ResponseBody int update(HttpServletRequest request, HttpServletResponse response) {
		int vret = 0;
		if (departmentsService.update(new Departments(request.getParameter("dept_no"),request.getParameter("dept_name"))) != null) {
			vret = 1;
		}
		return vret;
	}
	
	@RequestMapping("/delete") 
	public @ResponseBody int delete(HttpServletRequest request, HttpServletResponse response) {
		return departmentsService.delete(request.getParameter("dept_no"));
	}

	@RequestMapping("/insert") 
	public @ResponseBody int insert(HttpServletRequest request, HttpServletResponse response) {
		int vret = 0;
		if (departmentsService.insert(new Departments(request.getParameter("dept_no"),request.getParameter("dept_name"))) != null) {
			vret = 1;
		};
		return vret;
	}

	
	
	@RequestMapping("/select") 
	public @ResponseBody Departments select(HttpServletRequest request, HttpServletResponse response) {
		return departmentsService.get(request.getParameter("dept_no"));
	}

}
