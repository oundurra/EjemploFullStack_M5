package cl.icap.fullstackjava.modulo5.service;
import java.util.List;

import cl.icap.fullstackjava.modulo5.model.entity.Departments;

public interface DepartmentsService{
	public Departments get(String dept_no);
	public Departments insert(Departments departments);
	public Departments update(Departments departments);
	public List<Departments> list();
	public int delete(String dept_no);
}
