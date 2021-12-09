package app.rest.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;

//import java.util.List;  

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.HoldOrderDto;
import app.components.OtherDocumentationDto;
import app.components.ParkingTicketDto;
import app.components.RegistrarManager;
import app.components.SettleDto;
import app.entity.HoldOrder;
import app.entity.OtherDocumentation;
import app.entity.ParkingTicket;
import app.repository.HoldOrderRepository;
import app.repository.ParkingTicketRepository;
import app.repository.PaymentRepository;
import app.repository.OtherDocumentationRepository;
import app.repository.StudentRepository;

@Component
@Path("/registrar")
public class RegistrarController {
	
	
	@Autowired
	StudentRepository studentrepo;
	
	@Autowired
	PaymentRepository paymentrepo;
	
	@Autowired
	ParkingTicketRepository parkingrepo;
	
	@Autowired
	HoldOrderRepository holdorderrepo;
	
	@Autowired
	OtherDocumentationRepository otherdocurepo;
	
	@Autowired
	RegistrarManager manager; 
	
	
	@POST
	@Path("/addstudentholdorder")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addholdo(HoldOrderDto h){
		HoldOrder holdorderobject= manager.saveHoldOrder(h); 
		return (holdorderobject.toString());
	}
	
	@POST
	@Path("/addstudentparkingticket")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addticket(ParkingTicketDto p){
		ParkingTicket parkingticketobject=manager.saveParkingTicket(p); 
		return (parkingticketobject.toString());
	}
	
	@POST
	@Path("/addstudentotherdocu")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addother(OtherDocumentationDto o){
		OtherDocumentation otherdocumentationobject=manager.saveOtherDocumentation(o); 
		return (otherdocumentationobject.toString());
	}
	
	@POST
	@Path("/settle")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String settle(SettleDto s){
		manager.settle(s); 
		return ("Settle");
	}
	
	@GET
	@Path("/deleteparking")
	public String deleteParking(@QueryParam("parkingticketid") long parkid ) {
		manager.deleteparking(parkid);
		return ("Deleted");
	}
	
	@GET
	@Path("/deleteholdorder")
	public String deleteHold(@QueryParam("holdorderid") long holdid ) {
		manager.deleteholdorder(holdid);
		return ("Deleted");
	}
	
	
	@GET
	@Path("/deleteotherdocs")
	public String deleteOther(@QueryParam("otherdocsid") long otherid ) {
		manager.deleteother(otherid);
		return ("Deleted");
	}

	@GET
	@Path("/getstudentholdorder")
	@Produces(MediaType.APPLICATION_JSON)
	public java.util.List<HoldOrder> list1(Long ho_id){
		
		return holdorderrepo.findAll();
		
	}
	
	@GET
	@Path("/getstudentparkingticket")
	@Produces(MediaType.APPLICATION_JSON)
	public java.util.List<ParkingTicket> list2(@QueryParam("pt_id") Long pt_id){
		
		return parkingrepo.findAll();
		
	}
	
	@GET
	@Path("/getstudentotherdocu")
	@Produces(MediaType.APPLICATION_JSON)
	public java.util.List<OtherDocumentation> list3(@QueryParam("od_id") Long od_id){
		
		return otherdocurepo.findAll();
		
	}
	
	@GET
	@Path("/searchstudentholdorder")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public java.util.List<HoldOrder> searchlist1(@QueryParam("ho_id") Long ho_id){
		
		return holdorderrepo.findByholdorderid(ho_id);
		
	}
	
	@GET
	@Path("/searchstudentparkingticket")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public java.util.List<ParkingTicket> searchlist2(@QueryParam("pt_id") Long pt_id){
		
		return parkingrepo.findByparkingticketid(pt_id);
		
	}
	
	@GET
	@Path("/searchstudentotherdocu")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public java.util.List<OtherDocumentation> searchlist3(@QueryParam("od_id") Long od_id){
		
		return otherdocurepo.findByotherdocumentationid(od_id);
		
	}
	
}
