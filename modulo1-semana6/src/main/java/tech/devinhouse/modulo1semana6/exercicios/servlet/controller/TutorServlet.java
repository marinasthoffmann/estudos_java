package tech.devinhouse.modulo1semana6.exercicios.servlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tech.devinhouse.modulo1semana6.exercicios.servlet.model.Tutor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/tutor")
public class TutorServlet extends HttpServlet {

    private static List<Tutor> tutores = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(tutores);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        Integer idade = Integer.parseInt(req.getParameter("idade"));

        System.out.print("Nome: " + nome);
        System.out.print("Idade: " + idade);

        Tutor tutor = new Tutor();
        tutor.setNome(nome);
        tutor.setIdade(idade);

        tutores.add(tutor);

        resp.getWriter().println(tutor);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        String nome = req.getParameter("nome");
        Integer idade = Integer.parseInt(req.getParameter("idade"));

        Tutor tutor = findById(id);
        if(tutor == null){
            resp.getWriter().println(false);
            return;
        }
        tutor.setNome(nome);
        tutor.setIdade(idade);

        resp.getWriter().println(tutor);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        Tutor tutor = findById(id);

        if(tutor == null){
            resp.getWriter().println(false);
            return;
        }else {
            tutores.remove(tutor);
            resp.getWriter().println(true);
        }
    }

    private Tutor findById(Integer id){
        for(Tutor tutor: tutores){
            if (tutor.getId().equals(id)){
                return tutor;
            }
        }
        return null;
    }
}
