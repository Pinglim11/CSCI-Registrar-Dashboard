package app.components;

public class HoldOrderDto {
	
	private Long idnumber;
	private String surname;
	private String firstname;
	private String middleinitial;
	private Integer yearlevel;
	private String course;
	private String email;
	private String ho_description;
	private String ho_dateissued;
	private String ho_daterequest;
	private String hostatus;
	private Double amountdue;
	private String paymentdue;
	private String paymentdate;
	
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
	public String getHo_description() {
		return ho_description;
	}
	public void setHo_description(String ho_description) {
		this.ho_description = ho_description;
	}
	public String getHo_dateissued() {
		return ho_dateissued;
	}
	public void setHo_dateissued(String ho_dateissued) {
		this.ho_dateissued = ho_dateissued;
	}
	public String getHo_daterequest() {
		return ho_daterequest;
	}
	public void setHo_daterequest(String ho_daterequest) {
		this.ho_daterequest = ho_daterequest;
	}
	public String getHostatus() {
		return hostatus;
	}
	public void setHostatus(String hostatus) {
		this.hostatus = hostatus;
	}
	public Double getAmountdue() {
		return amountdue;
	}
	public void setAmountdue(Double amountdue) {
		this.amountdue = amountdue;
	}
	public String getPaymentdue() {
		return paymentdue;
	}
	public void setPaymentdue(String paymentdue) {
		this.paymentdue = paymentdue;
	}
	public String getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}
	@Override
	public String toString() {
		return "HoldOrderDto [idnumber=" + idnumber + ", surname=" + surname + ", firstname=" + firstname
				+ ", middleinitial=" + middleinitial + ", yearlevel=" + yearlevel + ", course=" + course + ", email="
				+ email + ", ho_description=" + ho_description + ", ho_dateissued=" + ho_dateissued
				+ ", ho_daterequest=" + ho_daterequest + ", hostatus=" + hostatus + ", amountdue=" + amountdue
				+ ", paymentdue=" + paymentdue + ", paymentdate=" + paymentdate + "]";
	}
	
	

	
}
