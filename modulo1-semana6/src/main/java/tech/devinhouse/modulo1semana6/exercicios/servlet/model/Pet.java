package tech.devinhouse.modulo1semana6.exercicios.servlet.model;

public class Pet {

    private static Integer SEQUENCIA = 0;

    private Integer id;
    private String nome;
    private Integer idade;

    public Pet() {
    }

    private Integer proximoId() {
        return ++ SEQUENCIA;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
