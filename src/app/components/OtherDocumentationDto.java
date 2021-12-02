package app.components;

public class OtherDocumentationDto {
	
	private Long studentid;
	private String surname;
	private String firstname;
	private String middleinitial;
	private Integer yearlevel;
	private String course;
	private String email;
	private String request_description;
	private String request_type;
	private String request_date;
	private String request_status;
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
	public String getRequest_description() {
		return request_description;
	}
	public void setRequest_description(String request_description) {
		this.request_description = request_description;
	}
	public String getRequest_type() {
		return request_type;
	}
	public void setRequest_type(String request_type) {
		this.request_type = request_type;
	}
	public String getRequest_date() {
		return request_date;
	}
	public void setRequest_date(String request_date) {
		this.request_date = request_date;
	}
	public String getRequest_status() {
		return request_status;
	}
	public void setRequest_status(String request_status) {
		this.request_status = request_status;
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
		return "OtherDocumentationDto [studentid=" + studentid + ", surname=" + surname + ", firstname=" + firstname
				+ ", middleinitial=" + middleinitial + ", yearlevel=" + yearlevel + ", course=" + course + ", email="
				+ email + ", request_description=" + request_description + ", request_type=" + request_type
				+ ", request_date=" + request_date + ", request_status=" + request_status + ", amountdue=" + amountdue
				+ ", paymentdue=" + paymentdue + ", paymentdate=" + paymentdate + "]";
	}
	
	


	
	
}
