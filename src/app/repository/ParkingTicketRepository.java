package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.ParkingTicket;

@Repository
public interface ParkingTicketRepository extends JpaRepository<ParkingTicket, Long> {

}
