package tech.devinhouse.exercicios.superherois.repository;

import tech.devinhouse.exercicios.superherois.model.Personagem;

import java.util.ArrayList;
import java.util.List;

public class PersonagemRepository {

    List<Personagem> dados = new ArrayList<>();

    public void inserir(Personagem personagem){
        dados.add(personagem);
    }

    public List<Personagem> consultar(){
        return dados;
    }

}
