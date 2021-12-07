package app.entity;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity(name ="parkingticket")
public class ParkingTicket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long parkingticketid;
	
	@NotNull(message="Data must exist")
	@ManyToOne (fetch = FetchType.EAGER) 
	private Student studentid;
	
	@ManyToOne (fetch = FetchType.EAGER) //one to one
	private Payment paymentid;
	
	@NotNull(message="Data must exist")
	@Column
	private String parkingt_description;
	
	@NotNull(message="Data must exist")
	@Column
	private String parkingt_dateissued;
	
	@NotNull(message="Data must exist")
	@Column
	private String parkingt_daterequest;
	
	@NotNull(message="Data must exist")
	@Column
	private String parkingt_status;
	
	
	public ParkingTicket() {} 
	{
	}
	
	
	
	
	public ParkingTicket(Long parkingticketid, @NotNull(message = "Data must exist") Student studentid,
			Payment paymentid, @NotNull(message = "Data must exist") String parkingt_description,
			@NotNull(message = "Data must exist") String parkingt_dateissued,
			@NotNull(message = "Data must exist") String parkingt_daterequest,
			@NotNull(message = "Data must exist") String parkingt_status) {
		super();
		this.parkingticketid = parkingticketid;
		this.studentid = studentid;
		this.paymentid = paymentid;
		this.parkingt_description = parkingt_description;
		this.parkingt_dateissued = parkingt_dateissued;
		this.parkingt_daterequest = parkingt_daterequest;
		this.parkingt_status = parkingt_status;
	}
	public Long getParkingticketid() {
		return parkingticketid;
	}
	public void setParkingticketid(Long parkingticketid) {
		this.parkingticketid = parkingticketid;
	}
	public Student getStudentid() {
		return studentid;
	}
	public void setStudentid(Student studentid) {
		this.studentid = studentid;
	}
	public Payment getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(Payment paymentid) {
		this.paymentid = paymentid;
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
	
	@Override
	public String toString() {
		return "ParkingTicket [parkingticketid=" + parkingticketid + ", studentid=" + studentid + ", paymentid="
				+ paymentid + ", parkingt_description=" + parkingt_description + ", parkingt_dateissued="
				+ parkingt_dateissued + ", parkingt_daterequest=" + parkingt_daterequest + ", parkingt_status="
				+ parkingt_status + "]";
	}
	
	
	
	

}
