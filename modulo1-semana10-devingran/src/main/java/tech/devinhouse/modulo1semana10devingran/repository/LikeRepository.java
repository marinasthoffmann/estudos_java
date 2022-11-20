package tech.devinhouse.modulo1semana10devingran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana10devingran.model.Like;

import java.util.Optional;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {

    @Query("select l from Like l where l.publicacao.id = :idPublicacao and l.nomePerfil = :nomePerfil")
    Optional<Like> findByIdPublicacaoNomePerfil(Long idPublicacao, String nomePerfil);

}
