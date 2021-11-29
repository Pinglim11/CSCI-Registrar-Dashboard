package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.repository.HoldOrderRepository;

@Component
public class RegistrarManager {
	
	@Autowired 
	private HoldOrderRepository horepo;
	

	
	public HoldOrderDto save(HoldOrderDto hold) {
		
		
		
		
		
		return (hold);
	}
}
