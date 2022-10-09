package tech.devinhouse.heranca;

public class Tigre extends Felino{
    @Override
    protected String emitirSom() {
        return "urrar";
    }

    @Override
    protected String tomarBanho() {
        return "tomei banho como um tigre";
    }
}
