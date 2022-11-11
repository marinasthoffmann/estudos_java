package tech.devinhouse.modulo1semana9springdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana9springdata.models.Pet;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

    //DerivedQueries
    List<Pet> findByNomeContainingOrderByIdDesc(String nome);

    //JPQL
//    @Query("SELECT p FROM Pet p WHERE p.nome LIKE %:nome%")
//    List<Pet> findByNomeContaining(String nome);

    //SQL NATIVO
//    @Query(value = "SELECT p FROM Pet p WHERE p.nome LIKE %:nome%")
//    public List<Pet> findByNomeContaining(String nome);

    List<Pet> findByTutorNome(String nomeTutor);

//    @Query("SELECT p FROM Pet p WHERE p.tutor.nome = :nomeTutor")
//    List<Pet> findByTutorNome(String nomeTutor);

//    SELECT p.* FROM pet p
//    JOIN tutor t ON t.id = p.tutor_id
//    WHERE t.nome = :nomeTutor;

    @Query("SELECT COUNT(p) FROM Pet p WHERE p.tutor.nome = :nomeTutor")
    Integer countByTutorNome(String nomeTutor);

    @Query("SELECT p.nome FROM Pet p WHERE p.tutor.nome = :nomeTutor")
    List<String> findNomeByTutor(String nomeTutor);

}
