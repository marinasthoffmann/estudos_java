package tech.devinhouse.heranca;

public abstract class Animal {

    protected String nome;
    protected int idade;
    protected abstract String emitirSom();

    protected String tomarBanho(){
        return "Tomei banho";
    }
}
