package tech.devinhouse.modulo1semana10devingran.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana10devingran.model.Perfil;
import tech.devinhouse.modulo1semana10devingran.repository.PerfilRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PerfilService {

    private PerfilRepository repo;

    public List<Perfil> consultar(){
        return repo.findAll();
    }

    public Perfil consultar(String nome){
        Optional<Perfil> perfilOpt = repo.findById(nome);
        return perfilOpt.orElseThrow(() -> new IllegalArgumentException("Não existe perfil com este nome"));
//        if (perfilOpt.isPresent()){
//            return perfilOpt.get();
//        }
//        throw new IllegalArgumentException("Não existe perfil com este nome");
    }

}
