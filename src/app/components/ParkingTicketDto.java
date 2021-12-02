package app.components;

public class ParkingTicketDto {

	private Long studentid;
	private String surname;
	private String firstname;
	private String middleinitial;
	private Integer yearlevel;
	private String course;
	private String email;
	private String parkingt_description;
	private String parkingt_dateissued;
	private String parkingt_daterequest;
	private String parkingt_status;
	private Double amountdue;
	private String paymentdue;
	private String paymentdate;
	public Long getStudentid() {
		return studentid;
	}
	public void setStudentid(Long studentid) {
		this.studentid = studentid;
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
	public String getParkingt_description() {
		return parkingt_description;
	}
	public void setParkingt_description(String parkingt_description) {
		this.parkingt_description = parkingt_description;
	}
	public String getParkingt_dateissued() {
		return parkingt_dateissued;
	}
	public void setParkingt_dateissued(String parkingt_dateissued) {
		this.parkingt_dateissued = parkingt_dateissued;
	}
	public String getParkingt_daterequest() {
		return parkingt_daterequest;
	}
	public void setParkingt_daterequest(String parkingt_daterequest) {
		this.parkingt_daterequest = parkingt_daterequest;
	}
	public String getParkingt_status() {
		return parkingt_status;
	}
	public void setParkingt_status(String parkingt_status) {
		this.parkingt_status = parkingt_status;
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
		return "ParkingTicketDto [studentid=" + studentid + ", surname=" + surname + ", firstname=" + firstname
				+ ", middleinitial=" + middleinitial + ", yearlevel=" + yearlevel + ", course=" + course + ", email="
				+ email + ", parkingt_description=" + parkingt_description + ", parkingt_dateissued="
				+ parkingt_dateissued + ", parkingt_daterequest=" + parkingt_daterequest + ", parkingt_status="
				+ parkingt_status + ", amountdue=" + amountdue + ", paymentdue=" + paymentdue + ", paymentdate="
				+ paymentdate + "]";
	}

	
	
	
	
}
