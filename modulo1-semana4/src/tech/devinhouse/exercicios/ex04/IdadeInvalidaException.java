package tech.devinhouse.exercicios.ex04;

public class IdadeInvalidaException extends Exception{

    public IdadeInvalidaException() {
        super("Idade digitada deve ter valor positivo, inteiro e menor do que 100");
    }
}
