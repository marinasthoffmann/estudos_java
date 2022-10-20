package tech.devinhouse.modulo1semana6.exercicios.servlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tech.devinhouse.modulo1semana6.exercicios.servlet.model.Pet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/pet")
public class PetServlet extends HttpServlet {

    private static List<Pet> pets = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(pets);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        Integer idade = Integer.parseInt(req.getParameter("idade"));

        System.out.print("Nome: " + nome);
        System.out.print("Idade: " + idade);

        Pet pet = new Pet();
        pet.setNome(nome);
        pet.setIdade(idade);

        pets.add(pet);

        resp.getWriter().println(pet);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        String nome = req.getParameter("nome");
        Integer idade = Integer.parseInt(req.getParameter("idade"));

        Pet pet = findById(id);
        if(pet == null){
            resp.getWriter().println(false);
            return;
        }
        pet.setNome(nome);
        pet.setIdade(idade);

        resp.getWriter().println(pet);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        Pet pet = findById(id);

        if(pet == null){
            resp.getWriter().println(false);
            return;
        }else {
            pets.remove(pet);
            resp.getWriter().println(true);
        }
    }

    private Pet findById(Integer id){
        for(Pet pet: pets){
            if (pet.getId().equals(id)){
                return pet;
            }
        }
        return null;
    }
}
