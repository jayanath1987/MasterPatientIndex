package lk.icta.health.poi.dto;

import java.io.Serializable;
//TODO Define Usecase ID, Define Description
public class DistrictDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7459582865740096491L;
	/**
	 * 
	 */
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
