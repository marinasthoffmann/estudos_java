package tech.devinhouse.modulo1semana6spring.exercicios.ex06.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana6spring.exercicios.ex06.model.Tutor;
import tech.devinhouse.modulo1semana6spring.exercicios.ex06.repository.TutorRepository;

import java.util.List;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    public Tutor save(Tutor tutor){
        return tutorRepository.save(tutor);
    }

    public List<Tutor> findAll(){
        return tutorRepository.findAll();
    }

    public boolean delete(Integer id){
        return tutorRepository.delete(id);
    }
}
