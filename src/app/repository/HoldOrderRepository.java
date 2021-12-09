package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.HoldOrder;


@Repository
public interface HoldOrderRepository extends JpaRepository<HoldOrder, Long> {
	
	HoldOrder findByStudentidIdnumber(Long studentid);

	public List<HoldOrder> findByholdorderid(Long holdorderid);
 }
