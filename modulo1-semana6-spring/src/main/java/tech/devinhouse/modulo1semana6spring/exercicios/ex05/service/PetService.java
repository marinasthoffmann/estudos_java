package tech.devinhouse.modulo1semana6spring.exercicios.ex05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana6spring.exercicios.ex05.model.Pet;
import tech.devinhouse.modulo1semana6spring.exercicios.ex05.repository.PetRepository;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public Pet save(Pet pet){
        return petRepository.save(pet);
    }

    public List<Pet> findAll(){
        return petRepository.findAll();
    }

    public boolean delete(Integer id){
        return petRepository.delete(id);
    }
}
