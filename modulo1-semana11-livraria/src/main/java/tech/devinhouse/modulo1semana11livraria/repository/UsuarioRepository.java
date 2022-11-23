package tech.devinhouse.modulo1semana11livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana11livraria.model.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    boolean existsUsuarioByEmail(String email);

}
