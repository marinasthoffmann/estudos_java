package tech.devinhouse.modulo1semana6spring.exercicios.ex06.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana6spring.exercicios.ex06.model.Tutor;
import tech.devinhouse.modulo1semana6spring.exercicios.ex06.model.Pet;
import tech.devinhouse.modulo1semana6spring.exercicios.ex06.repository.PetRepository;
import tech.devinhouse.modulo1semana6spring.exercicios.ex06.repository.TutorRepository;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private TutorRepository tutorRepository;

    public Pet save(Pet pet){
        try {
            if (pet.getTutor().getId() != null){
                Tutor tutor = tutorRepository.findById(pet.getTutor().getId());
                pet.setTutor(tutor);
            }
        } catch (Exception e){
            pet.setTutor(null);
        }
        return petRepository.save(pet);
    }

    public List<Pet> findAll(){
        return petRepository.findAll();
    }

    public boolean delete(Integer id){
        return petRepository.delete(id);
    }
}
