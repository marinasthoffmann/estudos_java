package tech.devinhouse.modulo1semana10devingran.exception;

public class RegistroNaoEncontradoException extends RuntimeException{

    public RegistroNaoEncontradoException(String nomeRecurso, String idRecurso){
        super(nomeRecurso + " com identificador " + idRecurso + " não encontrado!");
    }

}
