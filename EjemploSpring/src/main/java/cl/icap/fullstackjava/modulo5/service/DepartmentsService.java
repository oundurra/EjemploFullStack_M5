package cl.icap.fullstackjava.modulo5.service;
import java.util.List;


import cl.icap.fullstackjava.modulo5.model.dto.DepartmentsDTO;

public interface DepartmentsService{
	public int insert(DepartmentsDTO departmentsDTO);
	public DepartmentsDTO get(String dept_no);
	public int update(DepartmentsDTO departmentsDTO);
	public int delete(String dept_no);
	public List<DepartmentsDTO> list();
}
