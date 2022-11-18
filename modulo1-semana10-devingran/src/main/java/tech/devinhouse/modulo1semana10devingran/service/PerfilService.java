package tech.devinhouse.modulo1semana10devingran.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana10devingran.exception.RegistroExistenteException;
import tech.devinhouse.modulo1semana10devingran.exception.RegistroNaoEncontradoException;
import tech.devinhouse.modulo1semana10devingran.model.Perfil;
import tech.devinhouse.modulo1semana10devingran.model.Status;
import tech.devinhouse.modulo1semana10devingran.repository.PerfilRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PerfilService {

    private PerfilRepository repo;

    public List<Perfil> consultar(Integer tamanho, Integer pagina, String ordenacao, String direcao){
//        return repo.findAll();
        Sort.Direction directionSort = Sort.Direction.ASC;
        PageRequest pageable = PageRequest.of(pagina, tamanho).withSort(directionSort, ordenacao);
        return repo.findAll(pageable).getContent();
    }

    public List<Perfil> consultar(Status status) {
        return repo.findByStatus(status);
    }

    public Perfil consultar(String nome){
        Optional<Perfil> perfilOpt = repo.findById(nome);
//        return perfilOpt.orElseThrow(() -> new IllegalArgumentException("Não existe perfil com este nome"));
        if (perfilOpt.isPresent()){
            return perfilOpt.get();
        }
        throw new RegistroNaoEncontradoException("Perfil", nome);
    }

    public Perfil criar(Perfil perfil){
        boolean existe = repo.existsById(perfil.getNome());
        if(existe){
            throw new RegistroExistenteException("perfil", perfil.getNome());
        }
        perfil.setDataCriacao(LocalDateTime.now());
        perfil.setDataAtualizacao(LocalDateTime.now());
        repo.save(perfil);
        return perfil;
    }

    public Perfil atualizar(Perfil perfil){
//        Perfil perfilBD = repo.findById(perfil.getNome())
//                .orElseThrow(() -> new IllegalArgumentException("Perfil não encontrado"));
        Optional<Perfil> perfilOptional = repo.findById(perfil.getNome());
        if(perfilOptional.isEmpty())
            throw new RegistroNaoEncontradoException("perfil", perfil.getNome());
        Perfil perfilBD = perfilOptional.get();
        perfilBD.setBiografia(perfil.getBiografia());
        perfilBD.setProfissao(perfil.getProfissao());
        perfilBD.setDataNascimento(perfil.getDataNascimento());
        perfilBD.setDataAtualizacao(perfil.getDataAtualizacao());
        repo.save(perfilBD);
        return perfilBD;
    }

    public void excluir(String nome){
        boolean existe = repo.existsById(nome);
        if(!existe){
            throw new RegistroNaoEncontradoException("Perfil", nome);
        }
        repo.deleteById(nome);
    }

}
