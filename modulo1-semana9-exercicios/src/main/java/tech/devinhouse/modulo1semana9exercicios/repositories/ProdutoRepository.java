package tech.devinhouse.modulo1semana9exercicios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana9exercicios.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    boolean existsBySku(String sku);

}
