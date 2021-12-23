package app.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.ParkingTicket;
import app.repository.ParkingTicketRepository;

@Service
public class ParkingTicketServiceImpl implements ParkingTicketService {

	@Autowired
	private ParkingTicketRepository prepo;
	
	@Override
	public List<ParkingTicket> getAllParkingTickets() {
		return prepo.findAll();
	}

}
