package tech.devinhouse.modulo1semana10devingran.exception;

public class RegistroExistenteException extends RuntimeException{

    public RegistroExistenteException(String nomeRecurso, String idRecurso){
        super(nomeRecurso + " com identificador " + idRecurso + " já existente!");
    }
}
