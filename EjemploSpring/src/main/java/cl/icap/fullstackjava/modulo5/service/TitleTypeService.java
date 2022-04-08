package cl.icap.fullstackjava.modulo5.service;
import java.util.List;

import cl.icap.fullstackjava.modulo5.model.entity.TitleType;

public interface TitleTypeService{
	public TitleType get(int titleNo);
	public TitleType insert(TitleType titleType);
	public TitleType update(TitleType titleType);
	public List<TitleType> list();
	public int delete(int titleNo);
}
