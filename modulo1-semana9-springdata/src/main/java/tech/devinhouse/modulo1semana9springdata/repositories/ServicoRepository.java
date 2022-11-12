package tech.devinhouse.modulo1semana9springdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana9springdata.models.Servico;
import tech.devinhouse.modulo1semana9springdata.models.Tutor;

import java.util.List;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {

    List<Servico> findByAtivoTrueOrderByNome();

    Servico findByIdAndAtivoTrue(Integer id);

}
