package tech.devinhouse.modulo1semana10copadomundo.exceptions;

public class RegistroNaoEncontradoException extends RuntimeException{

    public RegistroNaoEncontradoException(String nomeRecurso, String id){
        super(nomeRecurso + " com identificador " + id + " não encontrado!");
    }

    public RegistroNaoEncontradoException(String nomeRecurso, Long id){
        this(nomeRecurso, String.valueOf(id));
    }

    public RegistroNaoEncontradoException(String nomeRecurso, Integer id){
        this(nomeRecurso, String.valueOf(id));
    }
}
