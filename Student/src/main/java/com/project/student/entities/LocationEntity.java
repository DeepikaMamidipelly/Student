package com.project.student.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class LocationEntity {
	@Id
	private Long id;

	private String name;
	private String code;
	private Double type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getType() {
		return type;
	}
	public void setType(Double type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "LocationEntity [id=" + id + ", name=" + name + ", code=" + code + ", type=" + type + "]";
	}

	
}
