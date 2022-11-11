package tech.devinhouse.modulo1semana9springdata.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana9springdata.models.Pet;
import tech.devinhouse.modulo1semana9springdata.repositories.PetRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired private PetRepository petRepository;

    public List<Pet> get(){

//        Sort sort = Sort.by("nome");
//        return petRepository.findAll(sort);

//        Sort.Order orderNome = new Sort.Order(Sort.Direction.DESC, "nome");
//        Sort.Order orderId = new Sort.Order((Sort.Direction.DESC), "id");
//        Sort sort =  Sort.by(orderNome, orderId);
//        return petRepository.findAll(sort);

        return petRepository.findAll();
    }

    public List<Pet> get(Integer pagina, Integer tamanho) {

        Sort sort = Sort.by("nome");
        Pageable pageable = PageRequest.of(pagina, tamanho, sort);

        return petRepository.findAll(pageable).getContent();
    }

    public List<Pet> get(String nome){
        return petRepository.findByNomeContainingOrderByIdDesc(nome);
    }

    public Pet save(Pet pet){
        return petRepository.save(pet);
    }

    public boolean remove(Integer id){
        try {
            Optional<Pet> pet = petRepository.findById(id);
            if (pet.isEmpty())
                return false;

            petRepository.delete(pet.get());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Pet> getByTutor(String nome) {
        return petRepository.findByTutorNome(nome);
    }

    public Integer countByTutor(String nome){
        return petRepository.countByTutorNome(nome);
    }

    public List<String> findNomeByTutor(String nome){
        return petRepository.findNomeByTutor(nome);
    }

}
