package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.OtherDocumentation;

@Repository
public interface OtherDocumentationRepository extends JpaRepository<OtherDocumentation, Long> {

}
