package tech.devinhouse.praticas.funcionarios;

public abstract class Funcionario {

    private Integer matricula;
    private String nome;
    private Long cpf;


    public abstract String obterCategoria();

    public String baterPonto(){
        return "Ponto registrado";
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
