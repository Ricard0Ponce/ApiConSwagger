package io.swagger.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.swagger.model.Cita;

public interface CitaRepository extends JpaRepository<Cita, Long> {

}
