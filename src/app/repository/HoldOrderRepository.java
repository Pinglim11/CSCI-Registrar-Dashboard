package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.HoldOrder;


@Repository
public interface HoldOrderRepository extends JpaRepository<HoldOrder, Long> {

}
