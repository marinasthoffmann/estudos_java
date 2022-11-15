package tech.devinhouse.modulo1semana10devingran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana10devingran.model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, String> {

}
