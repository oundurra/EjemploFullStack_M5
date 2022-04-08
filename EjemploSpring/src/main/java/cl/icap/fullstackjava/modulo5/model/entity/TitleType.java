package cl.icap.fullstackjava.modulo5.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "title_type")
public class TitleType {
	
	@Column(name = "title_no")
	@Id
	private Integer titleNo;

	@Column(name = "title_name")
	private String titleName;
	
	public TitleType() {
	}
		
	public TitleType(Integer titleno, String titlename) {
		this.titleNo = titleno;
		this.titleName = titlename;
	}

	public Integer getTitle_no() {
		return titleNo;
	}

	public void setTitle_no(Integer titleno) {
		this.titleNo = titleno;
	}

	public String getTitle_name() {
		return titleName;
	}

	public void setTitle_name(String titlename) {
		this.titleName = titlename;
	}
}