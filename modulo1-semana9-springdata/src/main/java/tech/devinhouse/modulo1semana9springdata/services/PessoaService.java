package tech.devinhouse.modulo1semana9springdata.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana9springdata.models.Pessoa;
import tech.devinhouse.modulo1semana9springdata.models.Tutor;
import tech.devinhouse.modulo1semana9springdata.repositories.PessoaRepository;
import tech.devinhouse.modulo1semana9springdata.repositories.TutorRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private TutorService tutorService;

    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }

    public Pessoa save(Pessoa pessoa){

        Tutor tutor;
        if(pessoa.getId() != null){
            // Editando o tutor
            tutor = pessoaRepository.findByIdAndTutorIdNotNull(pessoa.getId()).getTutor();
        } else {
            // Criando o tutor
            tutor = new Tutor();
        }
        tutor.setNome(pessoa.getNome());
        pessoa.setTutor(tutorService.save(tutor));

        return pessoaRepository.save(pessoa);
    }

}
