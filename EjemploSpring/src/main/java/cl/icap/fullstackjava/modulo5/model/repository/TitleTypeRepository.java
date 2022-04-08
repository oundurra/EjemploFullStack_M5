package cl.icap.fullstackjava.modulo5.model.repository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.icap.fullstackjava.modulo5.model.entity.TitleType;

@Repository
public interface TitleTypeRepository extends JpaRepository<TitleType, String> {
    Optional<TitleType> findByTitleNo(Integer titleNo);
}
