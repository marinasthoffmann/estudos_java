package tech.devinhouse.modulo1semana10copadomundo.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana10copadomundo.exceptions.RegistroExistenteException;
import tech.devinhouse.modulo1semana10copadomundo.exceptions.RegistroNaoEncontradoException;
import tech.devinhouse.modulo1semana10copadomundo.models.Jogador;
import tech.devinhouse.modulo1semana10copadomundo.models.Selecao;
import tech.devinhouse.modulo1semana10copadomundo.repositories.JogadorRepository;
import tech.devinhouse.modulo1semana10copadomundo.repositories.SelecaoRepository;

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
}
