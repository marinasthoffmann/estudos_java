package tech.devinhouse.modulo1semana9exercicios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana9exercicios.models.Venda;

import java.util.Date;
import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {

    List<Venda> findByDataVendaAfter(Date dataInicial);
    List<Venda> findByDataVendaBetween(Date dataInicial, Date dataFinal);
    List<Venda> findByStatusIgnoreCase(String status);

}
