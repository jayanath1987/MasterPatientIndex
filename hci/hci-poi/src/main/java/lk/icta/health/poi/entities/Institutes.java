package lk.icta.health.poi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = Institutes.TABLE_NAME)
public class Institutes implements Serializable {
	private static final long serialVersionUID = 8907979000003443191L;
	protected static final String TABLE_NAME = "institutes";

	@Id
	@Column(name = "point_of_issue", unique = true)
	private String pointOfIssue;

	@NotNull
	@Size(min = 8, max = 255, message = "Username have to be grater than 8 characters")
	private String nameOfInstitute;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "province_id")
	private Province province;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "district_id")
	private District district;
	@NotNull
	@Column(name = "lan_no")
	private String lanNo;
	@NotNull
	@Column(name = "contact_person")
	private String contactPerson;
	@NotNull
	@Column(name = "contact_number")
	private String contactNumber;
	@NotNull
	@Column(name = "designation")
	private String designation;
	@Column(name = "email")
	private String email;
	@NotNull
	@Column(name = "status")
	private boolean status;
	@NotNull
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "created_user")
	private String createdUser;
	@NotNull
	@Column(name = "sequence_no")
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

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
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

	public String getLanNo() {
		return lanNo;
	}

	public void setLanNo(String lanNo) {
		this.lanNo = lanNo;
	}

	public int getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	
}
