package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Student;
import app.repository.HoldOrderRepository;
import app.repository.PaymentRepository;
import app.repository.StudentRepository;

@Component
public class RegistrarManager {
	
	@Autowired 
	private HoldOrderRepository horepo;
	
	@Autowired
	private StudentRepository studentrepo;
	
	@Autowired
	private PaymentRepository paymentrepo;

	
	
	public HoldOrderDto save(HoldOrderDto hold) {
		Student student = new Student();
		student.setIdnumber(hold.getIdnumber());
		student.setSurname(hold.getSurname());
		student.setFirstname(hold.getFirstname());
		student.setMiddleinitial(hold.getMiddleinitial());
		student.setYearlevel(hold.getYearlevel());
		student.setCourse(hold.getCourse());
		student.setEmail(hold.getEmail());
		student = studentrepo.save(student);
		
		
		
		
		return (hold);
	}
}
