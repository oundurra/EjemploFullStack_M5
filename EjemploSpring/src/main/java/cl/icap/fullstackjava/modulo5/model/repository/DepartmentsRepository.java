package cl.icap.fullstackjava.modulo5.model.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import cl.icap.fullstackjava.modulo5.model.entity.Departments;


@Repository
public interface DepartmentsRepository extends JpaRepository<Departments, String> {

}
