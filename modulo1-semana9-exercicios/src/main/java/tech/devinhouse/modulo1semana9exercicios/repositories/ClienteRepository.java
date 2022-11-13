package tech.devinhouse.modulo1semana9exercicios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana9exercicios.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    boolean existsByCpfCnpj(String cpfCnpj);

}
