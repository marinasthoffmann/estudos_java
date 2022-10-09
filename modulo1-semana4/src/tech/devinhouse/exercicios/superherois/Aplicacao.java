package tech.devinhouse.exercicios.superherois;

import tech.devinhouse.exercicios.superherois.cli.Display;
import tech.devinhouse.exercicios.superherois.exception.OpcaoInvalidaException;
import tech.devinhouse.exercicios.superherois.model.Operacoes;
import tech.devinhouse.exercicios.superherois.model.Personagem;
import tech.devinhouse.exercicios.superherois.model.TipoPersonagem;
import tech.devinhouse.exercicios.superherois.repository.PersonagemRepository;

import java.util.List;

public class Aplicacao {

    private Display display = new Display();
    private PersonagemRepository repo = new PersonagemRepository();
    public void executar() {
        Operacoes operacao = null;

        while (operacao != Operacoes.SAIR){
            display.exibirMenu();
            try{
                operacao = display.obterOperacao();
                processar(operacao);
            }catch (OpcaoInvalidaException e){
                display.exibirMensagem("Opção informada é inválida!");
            }
        }
    }

    private void processar(Operacoes operacao){
        switch (operacao){
            case CADASTRAR_HEROI:
                Personagem heroi = display.cadastrar(TipoPersonagem.HEROI);
                repo.inserir(heroi);
                break;
            case CADASTRAR_VILAO:
                Personagem vilao = display.cadastrar(TipoPersonagem.VILAO);
                repo.inserir(vilao);
                break;
            case LISTAR:
                List<Personagem> personagens = repo.consultar();
                if (personagens.isEmpty()){
                    display.exibirMensagem("Sem personagens cadastrados");
                }
                display.listar(personagens);
                break;


        }
    }

}
