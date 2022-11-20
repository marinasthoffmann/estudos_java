package tech.devinhouse.modulo1semana10copadomundo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana10copadomundo.models.Selecao;

@Repository
public interface SelecaoRepository extends JpaRepository<Selecao, String> {
}
