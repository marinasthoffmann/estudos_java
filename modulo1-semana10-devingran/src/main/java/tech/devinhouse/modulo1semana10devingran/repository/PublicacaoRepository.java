package tech.devinhouse.modulo1semana10devingran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana10devingran.model.Publicacao;

import java.util.List;
import java.util.Optional;

@Repository
public interface PublicacaoRepository extends JpaRepository<Publicacao, Long> {

    public Optional<Publicacao> findByUrlDaImagem(String url);

    @Query("SELECT p FROM Publicacao p WHERE p.perfil.nome = :perfil AND p.id = :id")
    Optional<Publicacao> findByPerfilAndIdPublicacao(@Param("perfil") String perfil, @Param("id") Long id);

    @Query("SELECT p FROM Publicacao p WHERE p.perfil.nome = :perfil")
    List<Publicacao> findByNomePerfil(@Param("perfil") String perfil);
}
