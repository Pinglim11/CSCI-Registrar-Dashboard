package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.HoldOrder;
import app.entity.OtherDocumentation;

@Repository
public interface OtherDocumentationRepository extends JpaRepository<OtherDocumentation, Long> {

	OtherDocumentation findByStudentidIdnumber(Long studentid);
	
}
