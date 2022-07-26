package dh.meli.relationship.demo.repository;

import dh.meli.relationship.demo.model.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends CrudRepository<Subject, Long> {
}
