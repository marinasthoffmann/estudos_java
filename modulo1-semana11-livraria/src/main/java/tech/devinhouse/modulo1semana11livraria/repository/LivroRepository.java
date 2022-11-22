package tech.devinhouse.modulo1semana11livraria.repository;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana11livraria.model.Livro;

import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

    Optional<Livro> findByIsbn(String isbn);

}
