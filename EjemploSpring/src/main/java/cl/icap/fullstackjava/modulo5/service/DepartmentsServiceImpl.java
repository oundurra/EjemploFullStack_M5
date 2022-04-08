package cl.icap.fullstackjava.modulo5.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.fullstackjava.modulo5.model.repository.DepartmentsRepository;
import cl.icap.fullstackjava.modulo5.model.entity.Departments;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {
	@Autowired
	DepartmentsRepository departmentsRepository;

	public DepartmentsServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Departments get(String dept_no) {
		return departmentsRepository.findById(dept_no).get();
	}

	@Override
	public Departments insert(Departments departments) {
		return departmentsRepository.save(departments);
	}
	
	
	@Override
	public int delete(String dept_no) {
		int vret = 0;
		
		try {
			departmentsRepository.deleteById(dept_no);
			vret = 1;
		} catch(Exception e) {
			e.printStackTrace();
			vret = 0;
		}
		
		return vret;
	}

	
	@Override
	public Departments update(Departments departments) {
		return departmentsRepository.save(departments);
	}
	
	@Override
	public List<Departments> list() {
		return departmentsRepository.findAll();

		
	}
	
	@Override
	public List<Departments> listOrderByDeptName() {
		return departmentsRepository.findAllByOrderByDeptname();
		
	}
	
}
