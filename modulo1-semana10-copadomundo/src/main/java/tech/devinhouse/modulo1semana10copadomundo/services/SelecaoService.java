package tech.devinhouse.modulo1semana10copadomundo.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana10copadomundo.exceptions.RegistroExistenteException;
import tech.devinhouse.modulo1semana10copadomundo.exceptions.RegistroNaoEncontradoException;
import tech.devinhouse.modulo1semana10copadomundo.models.Selecao;
import tech.devinhouse.modulo1semana10copadomundo.repositories.SelecaoRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SelecaoService {

    private SelecaoRepository selecaoRepository;

    public Selecao criar(Selecao selecao){
        if (selecaoRepository.existsById(selecao.getSigla())){
            throw new RegistroExistenteException(Selecao.class.getSimpleName(), selecao.getSigla());
        }
        selecao.setDataCadastro(LocalDateTime.now());
        selecao = selecaoRepository.save(selecao);
        return selecao;
    }

    public List<Selecao> consultar(){
        return selecaoRepository.findAll();
    }

    public Selecao consultar(String sigla){
        Optional<Selecao> opt = selecaoRepository.findById(sigla);
        return opt.orElseThrow(() -> new RegistroNaoEncontradoException(Selecao.class.getSimpleName(), sigla));
    }

}
