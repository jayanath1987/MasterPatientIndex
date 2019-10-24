package lk.icta.health.poi.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InstitutesDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5726861649070165923L;

	@NotNull
	private String pointOfIssue;

	@NotNull
	@Size(min = 8, max = 255, message = "Username have to be grater than 8 characters")
	private String nameOfInstitute;
	private ProvinceDto province;
	private DistrictDto district;
	@NotNull
	private String lanNo;
	@NotNull
	private String contactPerson;
	@NotNull
	private String contactNumber;
	@NotNull
	private String designation;
	private String email;
	@NotNull
	private boolean status;
	private int sequenceNo;
	public String getPointOfIssue() {
		return pointOfIssue;
	}
	public void setPointOfIssue(String pointOfIssue) {
		this.pointOfIssue = pointOfIssue;
	}
	public String getNameOfInstitute() {
		return nameOfInstitute;
	}
	public void setNameOfInstitute(String nameOfInstitute) {
		this.nameOfInstitute = nameOfInstitute;
	}
	public ProvinceDto getProvince() {
		return province;
	}
	public void setProvince(ProvinceDto province) {
		this.province = province;
	}
	public DistrictDto getDistrict() {
		return district;
	}
	public void setDistrict(DistrictDto district) {
		this.district = district;
	}
	public String getLanNo() {
		return lanNo;
	}
	public void setLanNo(String lanNo) {
		this.lanNo = lanNo;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getSequenceNo() {
		return sequenceNo;
	}
	public void setSequenceNo(int sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

}
