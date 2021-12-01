package app.components;

public class HoldOrderDto {
	
	private Long idnumber;
	private String surname;
	private String firstname;
	private String middleinitial;
	private Integer yearlevel;
	private String course;
	private String email;
	
	
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
		return "HoldOrderDto [idnumber=" + idnumber + ", surname=" + surname + ", firstname=" + firstname
				+ ", middleinitial=" + middleinitial + ", yearlevel=" + yearlevel + ", course=" + course + ", email="
				+ email + "]";
	}
	
}
