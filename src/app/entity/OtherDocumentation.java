package app.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity(name="otherdocumentation")
public class OtherDocumentation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long otherdocumentationid;
	
	@NotNull(message="Data must exist")
	@ManyToOne (fetch = FetchType.EAGER)
	private Student studentid;
	
	@ManyToOne (fetch = FetchType.EAGER) //one to one
	private Payment paymentid;
	
	@NotNull(message="Data must exist")
	@Column
	private String request_description;
	
	@NotNull(message="Data must exist")
	@Column
	private String request_type;
	
	@NotNull(message="Data must exist")
	@Column
	private String request_status;
	
	@NotNull(message="Data must exist")
	@Column
	private String request_date;
	
	//relevant documents placeholder

	public OtherDocumentation() {} 
	{
	}
	
	
	

	public OtherDocumentation(Long otherdocumentationid, @NotNull(message = "Data must exist") Student studentid,
			Payment paymentid, @NotNull(message = "Data must exist") String request_description,
			@NotNull(message = "Data must exist") String request_type,
			@NotNull(message = "Data must exist") String request_status,
			@NotNull(message = "Data must exist") String request_date) {
		super();
		this.otherdocumentationid = otherdocumentationid;
		this.studentid = studentid;
		this.paymentid = paymentid;
		this.request_description = request_description;
		this.request_type = request_type;
		this.request_status = request_status;
		this.request_date = request_date;
	}
	public Long getOtherdocumentationid() {
		return otherdocumentationid;
	}
	public void setOtherdocumentationid(Long otherdocumentationid) {
		this.otherdocumentationid = otherdocumentationid;
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
	public String getRequest_status() {
		return request_status;
	}
	public void setRequest_status(String request_status) {
		this.request_status = request_status;
	}
	public String getRequest_date() {
		return request_date;
	}
	public void setRequest_date(String request_date) {
		this.request_date = request_date;
	}
	@Override
	public String toString() {
		return "OtherDocumentation [otherdocumentationid=" + otherdocumentationid + ", studentid=" + studentid
				+ ", paymentid=" + paymentid + ", request_description=" + request_description + ", request_type="
				+ request_type + ", request_status=" + request_status + ", request_date=" + request_date + "]";
	}
}
