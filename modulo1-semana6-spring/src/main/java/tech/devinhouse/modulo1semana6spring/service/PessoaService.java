package tech.devinhouse.modulo1semana6spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana6spring.model.Pessoa;
import tech.devinhouse.modulo1semana6spring.repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }

    public Pessoa findById(Integer id){
        return pessoaRepository.findById(id);
    }

    public Pessoa save(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public boolean delete(Integer id){
        return pessoaRepository.delete(id);
    }
}
