package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.HoldOrder;
import app.entity.OtherDocumentation;
import app.entity.ParkingTicket;
import app.entity.Payment;
import app.entity.Student;
import app.repository.HoldOrderRepository;
import app.repository.OtherDocumentationRepository;
import app.repository.ParkingTicketRepository;
import app.repository.PaymentRepository;
import app.repository.StudentRepository;

@Component
public class RegistrarManager {
	
	@Autowired 
	private HoldOrderRepository horepo;
	
	@Autowired
	private OtherDocumentationRepository odrepo;
	
	@Autowired
	private ParkingTicketRepository ptrepo;
	
	@Autowired
	private StudentRepository studentrepo;
	
	@Autowired
	private PaymentRepository paymentrepo;
	
	

	
	
	public HoldOrder saveHoldOrder(HoldOrderDto hold) {
		Student student = new Student();
		student.setIdnumber(hold.getIdnumber());
		student.setSurname(hold.getSurname());
		student.setFirstname(hold.getFirstname());
		student.setMiddleinitial(hold.getMiddleinitial());
		student.setYearlevel(hold.getYearlevel());
		student.setCourse(hold.getCourse());
		student.setEmail(hold.getEmail());
		Student studentstore = studentrepo.save(student);
		
		Payment payment= new Payment();
		payment.setAmountdue(hold.getAmountdue());
		payment.setPaymentdue(hold.getPaymentdue());
		payment.setPaymentdate(hold.getPaymentdate());
		Payment paymentstore= paymentrepo.save(payment);
		
		HoldOrder holdorder= new HoldOrder();
		holdorder.setStudentid(studentstore);
		holdorder.setPaymentid(paymentstore);
		holdorder.setHo_description(hold.getHo_description());
		holdorder.setHo_dateissued(hold.getHo_dateissued());
		holdorder.setHo_daterequest(hold.getHo_daterequest());
		holdorder.setHo_status(hold.getHostatus());
		HoldOrder holdorderstore= horepo.save(holdorder);
		
		return (holdorderstore);
	}
	
	public OtherDocumentation saveOtherDocumentation(OtherDocumentationDto other) {
		Student student = new Student();
		student.setIdnumber(other.getStudentid());
		student.setSurname(other.getSurname());
		student.setFirstname(other.getFirstname());
		student.setMiddleinitial(other.getMiddleinitial());
		student.setYearlevel(other.getYearlevel());
		student.setCourse(other.getCourse());
		student.setEmail(other.getEmail());
		Student studentstore = studentrepo.save(student);
		
		Payment payment= new Payment();
		payment.setAmountdue(other.getAmountdue());
		payment.setPaymentdue(other.getPaymentdue());
		payment.setPaymentdate(other.getPaymentdate());
		Payment paymentstore= paymentrepo.save(payment);
		
		OtherDocumentation otherdocumentation= new OtherDocumentation();
		otherdocumentation.setStudentid(studentstore);
		otherdocumentation.setPaymentid(paymentstore);
		otherdocumentation.setRequest_description(other.getRequest_description());
		otherdocumentation.setRequest_type(other.getRequest_type());
		otherdocumentation.setRequest_status(other.getRequest_status());
		otherdocumentation.setRequest_date(other.getRequest_date());
		OtherDocumentation otherdocumentationstore= odrepo.save(otherdocumentation);
		
		return (otherdocumentationstore);
	}
	
	public ParkingTicket saveParkingTicket(ParkingTicketDto parking) {
		Student student = new Student();
		student.setIdnumber(parking.getStudentid());
		student.setSurname(parking.getSurname());
		student.setFirstname(parking.getFirstname());
		student.setMiddleinitial(parking.getMiddleinitial());
		student.setYearlevel(parking.getYearlevel());
		student.setCourse(parking.getCourse());
		student.setEmail(parking.getEmail());
		Student studentstore = studentrepo.save(student);
		
		Payment payment= new Payment();
		payment.setAmountdue(parking.getAmountdue());
		payment.setPaymentdue(parking.getPaymentdue());
		payment.setPaymentdate(parking.getPaymentdate());
		Payment paymentstore= paymentrepo.save(payment);
		
		ParkingTicket parkingticket= new ParkingTicket();
		parkingticket.setStudentid(studentstore);
		parkingticket.setPaymentid(paymentstore);
		parkingticket.setParkingt_description(parking.getParkingt_description());
		parkingticket.setParkingt_dateissued(parking.getParkingt_dateissued());
		parkingticket.setParkingt_daterequest(parking.getParkingt_daterequest());
		parkingticket.setParkingt_status(parking.getParkingt_status());
		ParkingTicket parkingticketstore= ptrepo.save(parkingticket);
		
		return (parkingticketstore);
	}
	
	public void settle(SettleDto settle) {
		String hovar=settle.getHo_status();
		String odvar=settle.getOd_status();
		String ptvar=settle.getParkingt_status();
				
		if (hovar != null) {
			HoldOrder hoobjectstore=horepo.findByStudentidIdnumber(settle.getStudent_id());
			hoobjectstore.setHo_status(settle.getHo_status());
			Payment paymentobjectstore=hoobjectstore.getPaymentid();
			paymentobjectstore.setPaymentdate(settle.getPaymentdate());
			horepo.save(hoobjectstore);
			paymentrepo.save(paymentobjectstore);
			
		}
		else if (odvar != null){
			OtherDocumentation odobjectstore=odrepo.findByStudentidIdnumber(settle.getStudent_id());
			odobjectstore.setRequest_status(settle.getOd_status());
			Payment paymentobjectstore=odobjectstore.getPaymentid();
			paymentobjectstore.setPaymentdate(settle.getPaymentdate());
			odrepo.save(odobjectstore);
			paymentrepo.save(paymentobjectstore);
		}
		else if (ptvar!=null) {
			ParkingTicket ptobjectstore=ptrepo.findByStudentidIdnumber(settle.getStudent_id());
			ptobjectstore.setParkingt_status(settle.getParkingt_status());
			Payment paymentobjectstore=ptobjectstore.getPaymentid();
			paymentobjectstore.setPaymentdate(settle.getPaymentdate());
			ptrepo.save(ptobjectstore);
			paymentrepo.save(paymentobjectstore);
		}
		
	}
	
	public void deleteparking(Long parkingid) {
		ParkingTicket pt = ptrepo.findById(parkingid).get();
		Payment pay = pt.getPaymentid();
		ptrepo.delete(pt);
		paymentrepo.delete(pay);

	}
	
	
	public void deleteholdorder(Long holdorderid) {
		HoldOrder ho = horepo.findById(holdorderid).get();
		Payment pay = ho.getPaymentid();
		horepo.delete(ho);
		paymentrepo.delete(pay);

	}
	
	public void deleteother(Long parkingid) {
		OtherDocumentation od = odrepo.findById(parkingid).get();
		Payment pay = od.getPaymentid();
		odrepo.delete(od);
		paymentrepo.delete(pay);
	}
	
}
