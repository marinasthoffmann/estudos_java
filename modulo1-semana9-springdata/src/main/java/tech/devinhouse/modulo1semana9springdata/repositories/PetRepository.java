package tech.devinhouse.modulo1semana9springdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana9springdata.models.Pet;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

    //DerivedQueries
//    public List<Pet> findByNomeContaining(String nome);

    //JPQL
//    @Query("SELECT p FROM Pet p WHERE p.nome LIKE %:nome%")
//    List<Pet> findByNomeContaining(String nome);

    //SQL NATIVO
    @Query(value = "SELECT p FROM Pet p WHERE p.nome LIKE %:nome%")
    public List<Pet> findByNomeContaining(String nome);

}
