package cl.icap.fullstackjava.modulo5.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.icap.fullstackjava.modulo5.model.dto.DepartmentsDTO;

@Repository
@Transactional
public class DepartmentsDAOImpl implements DepartmentsDAO {
	private String insert = "INSERT INTO departments VALUES (?,?)";
	private String update = "UPDATE departments SET dept_name=? WHERE dept_no=?";
	private String select = "SELECT * FROM departments WHERE dept_no=?";
	private String delete = "DELETE FROM departments WHERE dept_no=?";
	private String list = "SELECT * FROM departments";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public DepartmentsDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(DepartmentsDTO departmentsDTO) {
		return jdbcTemplate.update(insert, new Object[]{departmentsDTO.getDept_no(),departmentsDTO.getDept_name()});
	}

	@SuppressWarnings("deprecation")
	@Override
	public DepartmentsDTO get(String dept_no) {
		return jdbcTemplate.queryForObject(select, new Object[]{dept_no}, BeanPropertyRowMapper.newInstance(DepartmentsDTO.class));
	}

	@Override
	public int update(DepartmentsDTO departmentsDTO) {
		return jdbcTemplate.update(update, new Object[]{departmentsDTO.getDept_name(), departmentsDTO.getDept_no()});
	}

	@Override
	public int delete(String dept_no) {
		int vret = 0;
		if (jdbcTemplate.update(delete, new Object[]{dept_no}) == 1) {
			vret = 1;
		}
		return vret;
	}

	@Override
	public List<DepartmentsDTO> list() {
		List<DepartmentsDTO> listDepartments = jdbcTemplate.query( list,BeanPropertyRowMapper.newInstance(DepartmentsDTO.class));
		return listDepartments;
	}

}
