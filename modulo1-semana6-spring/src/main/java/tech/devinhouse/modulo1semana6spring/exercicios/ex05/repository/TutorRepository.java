package tech.devinhouse.modulo1semana6spring.exercicios.ex05.repository;

import org.springframework.stereotype.Repository;
import tech.devinhouse.modulo1semana6spring.exercicios.ex05.model.Tutor;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TutorRepository {

    private static Integer SEQUENCIA = 0;
    private static List<Tutor> tutores = new ArrayList<>();


    public Tutor save(Tutor tutor){

        if(tutor.getId() == null){
            tutor.setId(gerarId());
            tutores.add(tutor);
            return tutor;
        }

        Tutor tutorEditado = findById(tutor.getId());
        tutorEditado.setNome(tutor.getNome());
        tutorEditado.setIdade(tutor.getIdade());

        return tutorEditado;


    }

    public Tutor findById(Integer id){
        for (Tutor tutor : tutores){
            if (id == tutor.getId()){
                return tutor;
            }
        }
        return null;
    }

    public List<Tutor> findAll(){
        return tutores;
    }

    public boolean delete(Integer id){
        try{
            Tutor tutor = findById(id);
            tutores.remove(tutor);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    private Integer gerarId() {
        return ++SEQUENCIA;
    }
}
