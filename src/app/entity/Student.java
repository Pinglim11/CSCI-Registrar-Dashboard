package app.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name ="student")
public class Student {
	
	@Id
	@Column
	@NotNull(message="Data must exist")
	private Long idnumber;
	
	@NotNull(message="Data must exist")
	@Column
	private String surname;	
	
	@NotNull(message="Data must exist")
	@Column
	private String firstname;
	
	@Column
	private String middleinitial;
	
	@NotNull(message="Data must exist")
	@Column
	private Integer yearlevel;
	
	@NotNull(message="Data must exist")
	@Column
	private String course;
	
	@NotNull(message="Data must exist")
	@Column
	private String email;
	
	
	public Student() {} 
	{
	}
	
	
	
	
	public Student(@NotNull(message = "Data must exist") Long idnumber,
			@NotNull(message = "Data must exist") String surname,
			@NotNull(message = "Data must exist") String firstname, String middleinitial,
			@NotNull(message = "Data must exist") Integer yearlevel,
			@NotNull(message = "Data must exist") String course, @NotNull(message = "Data must exist") String email) {
		super();
		this.idnumber = idnumber;
		this.surname = surname;
		this.firstname = firstname;
		this.middleinitial = middleinitial;
		this.yearlevel = yearlevel;
		this.course = course;
		this.email = email;
	}
	
	
	public Long getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(Long idnumber) {
		this.idnumber = idnumber;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddleinitial() {
		return middleinitial;
	}
	public void setMiddleinitial(String middleinitial) {
		this.middleinitial = middleinitial;
	}
	public Integer getYearlevel() {
		return yearlevel;
	}
	public void setYearlevel(Integer yearlevel) {
		this.yearlevel = yearlevel;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Student [idnumber=" + idnumber + ", surname=" + surname + ", firstname=" + firstname
				+ ", middleinitial=" + middleinitial + ", yearlevel=" + yearlevel + ", course=" + course + ", email="
				+ email + "]";
	}
	

}
