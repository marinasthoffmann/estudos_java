package tech.devinhouse.modulo1semana9springdata.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana9springdata.models.Pet;
import tech.devinhouse.modulo1semana9springdata.models.Tutor;
import tech.devinhouse.modulo1semana9springdata.repositories.PetRepository;
import tech.devinhouse.modulo1semana9springdata.repositories.TutorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TutorService {

    @Autowired private TutorRepository tutorRepository;

    public List<Tutor> get(){
        return tutorRepository.findAll();
    }

    public Tutor save(Tutor tutor){
        return tutorRepository.save(tutor);
    }

    public boolean remove(Integer id){
        try {
            Optional<Tutor> tutor = tutorRepository.findById(id);
            if (tutor.isEmpty())
                return false;

            tutorRepository.delete(tutor.get());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
