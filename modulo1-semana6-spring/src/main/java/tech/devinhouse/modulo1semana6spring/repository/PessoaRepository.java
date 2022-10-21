package tech.devinhouse.modulo1semana6spring.repository;

import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana6spring.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PessoaRepository {

    private static Integer SEQUENCIA = 0;
    private static List<Pessoa> pessoas = new ArrayList<>();

    public List<Pessoa> findAll(){
        return pessoas;
    }

    public Pessoa findById(Integer id){
        for(Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }

    public Pessoa save(Pessoa pessoa){
        if(pessoa.getId() == null){
            pessoa.setId(generateId());
            pessoas.add(pessoa);
            return pessoa;
        } else {
            Pessoa pessoaEdicao = findById(pessoa.getId());
            pessoaEdicao.setNome(pessoa.getNome());
            pessoaEdicao.setIdade(pessoa.getIdade());
            return pessoaEdicao;
        }
    }

    public boolean delete(Integer id){
        Pessoa pessoa = findById(id);
        if (pessoa == null){
            return false;
        } else {
            pessoas.remove(pessoa);
            return true;
        }
    }

    private Integer generateId() {
        return ++SEQUENCIA;
    }
}
