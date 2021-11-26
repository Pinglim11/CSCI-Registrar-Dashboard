package app.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity(name ="holdorder")
public class HoldOrder {

	
	//fetch type eager
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long holdorderid;
	
	@NotNull(message="Data must exist")
	@ManyToOne (fetch = FetchType.EAGER)
	private Student studentid;
	
	@ManyToOne (fetch = FetchType.EAGER) //one to one
	private Payment paymentid;
	
	@NotNull(message="Data must exist")
	@Column
	private String ho_description;
	
	@NotNull(message="Data must exist")
	@Column
	private String ho_dateissued;
	
	@NotNull(message="Data must exist")
	@Column
	private String ho_daterequest;
	
	@NotNull(message="Data must exist")
	@Column
	private String ho_status;
	
	public HoldOrder() {} 
	{
	}
	
	
	public HoldOrder(Long holdorderid, @NotNull(message = "Data must exist") Student studentid, Payment paymentid,
			@NotNull(message = "Data must exist") String ho_description,
			@NotNull(message = "Data must exist") String ho_dateissued,
			@NotNull(message = "Data must exist") String ho_daterequest,
			@NotNull(message = "Data must exist") String ho_status) {
		super();
		this.holdorderid = holdorderid;
		this.studentid = studentid;
		this.paymentid = paymentid;
		this.ho_description = ho_description;
		this.ho_dateissued = ho_dateissued;
		this.ho_daterequest = ho_daterequest;
		this.ho_status = ho_status;
	}
	
	public Long getHoldorderid() {
		return holdorderid;
	}
	public void setHoldorderid(Long holdorderid) {
		this.holdorderid = holdorderid;
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
	public String getHo_status() {
		return ho_status;
	}
	public void setHo_status(String ho_status) {
		this.ho_status = ho_status;
	}
	
	@Override
	public String toString() {
		return "HoldOrder [holdorderid=" + holdorderid + ", studentid=" + studentid + ", paymentid=" + paymentid
				+ ", ho_description=" + ho_description + ", ho_dateissued=" + ho_dateissued + ", ho_daterequest="
				+ ho_daterequest + ", ho_status=" + ho_status + "]";
	}
	
	
	

}
