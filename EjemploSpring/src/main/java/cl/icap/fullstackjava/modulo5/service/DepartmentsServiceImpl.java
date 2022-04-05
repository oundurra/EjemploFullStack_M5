package cl.icap.fullstackjava.modulo5.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.icap.fullstackjava.modulo5.model.dao.DepartmentsDAO;
import cl.icap.fullstackjava.modulo5.model.dto.DepartmentsDTO;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {
	@Autowired
	DepartmentsDAO departmentsDAO;

	public DepartmentsServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(DepartmentsDTO departmentsDTO) {
		return departmentsDAO.insert(departmentsDTO);
	}

	@Override
	public DepartmentsDTO get(String dept_no) {
		return departmentsDAO.get(dept_no);
	}

	@Override
	public int update(DepartmentsDTO departmentsDTO) {
		return departmentsDAO.update(departmentsDTO);
	}

	@Override
	public int delete(String dept_no) {
		return departmentsDAO.delete(dept_no);
	}

	@Override
	public List<DepartmentsDTO> list() {
		return departmentsDAO.list();
	}

}
