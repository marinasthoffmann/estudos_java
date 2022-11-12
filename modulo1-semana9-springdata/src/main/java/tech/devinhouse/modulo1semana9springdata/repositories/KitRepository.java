package tech.devinhouse.modulo1semana9springdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana9springdata.models.Kit;
import tech.devinhouse.modulo1semana9springdata.models.Servico;

import java.util.Date;
import java.util.List;

@Repository
public interface KitRepository extends JpaRepository<Kit, Integer> {

    List<Kit> findByAtivoTrueOrderByNome();

    Kit findByIdAndAtivoTrue(Integer id);

    List<Kit> findByValidadeBetween(Date dataInicial, Date dataFinal);

    List<Kit> findByValidadeAfter(Date dataInicial);

}
