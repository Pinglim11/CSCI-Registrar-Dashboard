package app.components;

public class SettleDto {
	
	private Long student_id;
	private String ho_status;  //HoldOrder Status
	private String od_status;  //OtherDocument Status
	private String parkingt_status;
	private String paymentdate;
	public Long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}
	public String getHo_status() {
		return ho_status;
	}
	public void setHo_status(String ho_status) {
		this.ho_status = ho_status;
	}
	public String getOd_status() {
		return od_status;
	}
	public void setOd_status(String od_status) {
		this.od_status = od_status;
	}
	public String getParkingt_status() {
		return parkingt_status;
	}
	public void setParkingt_status(String parkingt_status) {
		this.parkingt_status = parkingt_status;
	}
	public String getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}
	@Override
	public String toString() {
		return "SettleDto [student_id=" + student_id + ", ho_status=" + ho_status + ", od_status=" + od_status
				+ ", parkingt_status=" + parkingt_status + ", paymentdate=" + paymentdate + "]";
	}
	
	
	

	
}
