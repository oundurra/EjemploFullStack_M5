package cl.icap.fullstackjava.modulo5.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.fullstackjava.modulo5.model.repository.TitleTypeRepository;
import cl.icap.fullstackjava.modulo5.model.entity.TitleType;

@Service
public class TitleTypeServiceImpl implements TitleTypeService {
	@Autowired
	TitleTypeRepository titleTypeRepository;

	public TitleTypeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public TitleType get(int titleNo) {
		return titleTypeRepository.findByTitleNo(titleNo).get();
	}

	@Override
	public TitleType insert(TitleType titleType) {
		return titleTypeRepository.save(titleType);
	}
	
	@Override
	public int delete(int titleNo) {
		int vret = 0;
		
		try {
			titleTypeRepository.delete(new TitleType(titleNo, null));
			vret = 1;
		} catch(Exception e) {
			e.printStackTrace();
			vret = 0;
		}
		
		return vret;
	}
	
	@Override
	public TitleType update(TitleType titleType) {
		return titleTypeRepository.save(titleType);
	}
	
	@Override
	public List<TitleType> list() {
		return titleTypeRepository.findAll();
	}
	
}
