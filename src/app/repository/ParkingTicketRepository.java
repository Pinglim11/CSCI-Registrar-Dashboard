package app.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.OtherDocumentation;
import app.entity.ParkingTicket;

@Repository
public interface ParkingTicketRepository extends JpaRepository<ParkingTicket, Long> {
	
	ParkingTicket findByStudentidIdnumber(Long parkingticketid);
	
	public List<ParkingTicket> findByparkingticketid(Long parkingticketid);

}
