package tech.devinhouse.modulo1semana6spring.exercicios.ex06.repository;

import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana6spring.exercicios.ex06.model.Pet;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PetRepository {

    private static Integer SEQUENCIA = 0;
    private static List<Pet> pets = new ArrayList<>();


    public Pet save(Pet pet){

        if(pet.getId() == null){
            pet.setId(gerarId());
            pets.add(pet);
            return pet;
        }

        Pet petEditado = findById(pet.getId());
        petEditado.setNome(pet.getNome());
        petEditado.setIdade(pet.getIdade());
        petEditado.setTutor(pet.getTutor());

        return petEditado;


    }

    public Pet findById(Integer id){
        for (Pet pet : pets){
            if (id == pet.getId()){
                return pet;
            }
        }
        return null;
    }

    public List<Pet> findAll(){
        return pets;
    }

    public boolean delete(Integer id){
        try{
            Pet pet = findById(id);
            pets.remove(pet);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    private Integer gerarId() {
        return ++SEQUENCIA;
    }
}
