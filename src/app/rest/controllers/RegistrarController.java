package app.rest.controllers;

import javax.ws.rs.Consumes;

//import java.util.List;  

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



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
	
	
	@GET
	@Path("/getstudentholdorder")
	@Produces(MediaType.APPLICATION_JSON)
	public String getHoldOrder(@QueryParam("a") String a){   //<List>, string for the meantime 
		return ("ok");
	}
	
	@GET
	@Path("/getstudentparkingticket")
	@Produces(MediaType.APPLICATION_JSON)
	public String getist(@QueryParam("a") String a){   //<List>, string for the meantime 
		return ("ok");
	}
	
	@GET
	@Path("/getstudentotherdocu")
	@Produces(MediaType.APPLICATION_JSON)
	public String getList(@QueryParam("a") String a){   //<List>, string for the meantime 
		return ("ok");
	}
	
	@POST
	@Path("/addstudentholdorder")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addholdo(){             //string for the meantime 
		return ("ok");
	}
	
	@POST
	@Path("/addstudentparkingticket")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addticket(){                    //string for the meantime 
		return ("ok");
	}
	
	@POST
	@Path("/addstudentotherdocu")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addother(){                       //string for the meantime 
		return ("ok");
	}
	
	@POST
	@Path("/settle")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String settle(){                       //string for the meantime 
		return ("ok");
	}

	
	//@GET
	//@Path("/add")
	//@Produces(MediaType.TEXT_PLAIN)
	//public double add(@QueryParam("a") double a, @QueryParam("b") double b) ------> copy this format for multiple params
	//{
		//return calc.add(a, b);
	//}
}
