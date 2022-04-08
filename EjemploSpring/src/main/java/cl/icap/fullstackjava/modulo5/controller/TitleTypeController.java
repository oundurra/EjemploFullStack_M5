package cl.icap.fullstackjava.modulo5.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import cl.icap.fullstackjava.modulo5.model.entity.TitleType;
import cl.icap.fullstackjava.modulo5.service.TitleTypeService;

@RestController
public class TitleTypeController {
	@Autowired
	TitleTypeService titleTypeService;
	
	@GetMapping("/titletype") 
	public List<TitleType> list(HttpServletRequest request, HttpServletResponse response) {
		return titleTypeService.list();
	}
	
	@PostMapping("/titletype/update") 
	public int update(HttpServletRequest request, HttpServletResponse response) {
		int vret = 0;
		if (titleTypeService.update(new TitleType(
										Integer.parseInt(request.getParameter("titleNo"))
										,request.getParameter("titleName"))) != null) {
			vret = 1;
		}
		return vret;
	}
	
	@PostMapping("/titletype/delete") 
	public int delete(HttpServletRequest request, HttpServletResponse response) {
		return titleTypeService.delete(Integer.parseInt(request.getParameter("titleNo")));
	}

	@PostMapping("/titletype/insert") 
	public int insert(HttpServletRequest request, HttpServletResponse response) {
		int vret = 0;
		if (titleTypeService.insert(new TitleType(
										Integer.parseInt(request.getParameter("titleNo"))
										,request.getParameter("titleName"))) != null) {
			vret = 1;
		};
		return vret;
	}
	
	@GetMapping("/titletype/select") 
	public TitleType select(HttpServletRequest request, HttpServletResponse response) {
		return titleTypeService.get(Integer.parseInt(request.getParameter("titleNo")));
	}
}