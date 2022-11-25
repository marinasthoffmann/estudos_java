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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<Jogador> consultar(String sigla, String pesquisa){
        Selecao selecao = selecaoRepository.findById(sigla)
                .orElseThrow(() -> new RegistroNaoEncontradoException(Selecao.class.getSimpleName(), sigla));
        List<Jogador> jogadores = selecao.getJogadores();
        if (pesquisa == null)
            return jogadores;
        List<Jogador> filtrados = new ArrayList<>();
        for(Jogador jogador : jogadores){
            if(jogador.getNome().contains(pesquisa)){
                filtrados.add(jogador);
            }
        }
        return filtrados;
    }

    public void deletar(String sigla, Integer idJogador){
        Optional<Jogador> opt = jogadorRepository.findBySelecaoEidJogador(sigla, idJogador);
        if(opt.isEmpty())
            throw new RegistroNaoEncontradoException(Jogador.class.getSimpleName(), idJogador);
        jogadorRepository.deleteById(idJogador);
    }
}
