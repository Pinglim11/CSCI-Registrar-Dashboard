package app.entity;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name ="payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long paymentid;
	
	@Column
	private Double amountdue;	
	
	@Column
	private String paymentdue;
	
	@Column
	private String paymentdate;
	
	public Payment() {} 
	{
	}
	
	
	
	
	public Payment(Long paymentid, Double amountdue, String paymentdue, String paymentdate) {
		super();
		this.paymentid = paymentid;
		this.amountdue = amountdue;
		this.paymentdue = paymentdue;
		this.paymentdate = paymentdate;
	}
	public Long getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(Long paymentid) {
		this.paymentid = paymentid;
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
		return "Payment [paymentid=" + paymentid + ", amountdue=" + amountdue + ", paymentdue=" + paymentdue
				+ ", paymentdate=" + paymentdate + "]";
	}
	
	
	
}
