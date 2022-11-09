package tech.devinhouse.modulo1semana9springdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana9springdata.models.Tutor;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Integer> {

}
