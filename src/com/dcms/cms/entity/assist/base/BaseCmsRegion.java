package com.dcms.cms.entity.assist.base;

import java.io.Serializable;
import java.util.Set;

import com.dcms.cms.entity.assist.CmsRegion;
import com.dcms.cms.entity.main.CmsUser;

public class BaseCmsRegion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//constructor
	public BaseCmsRegion() {
		super();
	}
	
	
	
	public BaseCmsRegion(Integer id) {
		super();
		this.id = id;
	}

	
	public BaseCmsRegion(Integer id, String name, String detailName,
			String code, String parentCode, Integer level, CmsRegion parent) {
		super();
		this.id = id;
		this.name = name;
		this.detailName = detailName;
		this.code = code;
		this.parentCode = parentCode;
		this.level = level;
		this.parent = parent;
	}




	//field
	private Integer id ;
	private String name;
	private String detailName;
	private String code;
	private String parentCode;
	private Integer level;
	
	//many to one
	private CmsRegion parent;
	
	//one to many
	private Set<CmsRegion> child;


	//getter and setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetailName() {
		return detailName;
	}

	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public CmsRegion getParent() {
		return parent;
	}

	public void setParent(CmsRegion parent) {
		this.parent = parent;
	}

	public Set<CmsRegion> getChild() {
		return child;
	}

	public void setChild(Set<CmsRegion> child) {
		this.child = child;
	}
	
	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseCmsRegion other = (BaseCmsRegion) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BaseCmsRegion [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
