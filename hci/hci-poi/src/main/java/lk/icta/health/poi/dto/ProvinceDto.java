package lk.icta.health.poi.dto;

import java.io.Serializable;

public class ProvinceDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3165257033381522697L;

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
