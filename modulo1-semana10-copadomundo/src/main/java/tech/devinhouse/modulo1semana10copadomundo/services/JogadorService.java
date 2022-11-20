package tech.devinhouse.modulo1semana10copadomundo.services;

import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import tech.devinhouse.modulo1semana10copadomundo.dto.JogadorResponse;
import tech.devinhouse.modulo1semana10copadomundo.exceptions.RegistroExistenteException;
import tech.devinhouse.modulo1semana10copadomundo.exceptions.RegistroNaoEncontradoException;
import tech.devinhouse.modulo1semana10copadomundo.models.Jogador;
import tech.devinhouse.modulo1semana10copadomundo.models.Selecao;
import tech.devinhouse.modulo1semana10copadomundo.repositories.JogadorRepository;
import tech.devinhouse.modulo1semana10copadomundo.repositories.SelecaoRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class JogadorService {

    private JogadorRepository jogadorRepository;
    private SelecaoRepository selecaoRepository;

    public Jogador criar(String sigla, Jogador jogador){
        Selecao selecao = selecaoRepository.findById(sigla)
                .orElseThrow(() -> new RegistroNaoEncontradoException(Selecao.class.getSimpleName(), sigla));
        final String nome = jogador.getNome();
        boolean jaExisteNoTime = selecao.getJogadores().stream().anyMatch(p -> p.getNome().equals(nome));
        if(jaExisteNoTime)
            throw new RegistroExistenteException(Jogador.class.getSimpleName(), nome);
        jogador.setSelecao(selecao);
        jogador = jogadorRepository.save(jogador);
        return jogador;
    }

    public List<Jogador> consultar(@PathVariable("sigla") String sigla){
        return jogadorRepository.findAll();
    }
}
