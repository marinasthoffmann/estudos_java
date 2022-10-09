package enums;

public class Cafe {

    private String tipo;
    private Tamanho tamanho;

    @Override
    public String toString() {
        return "Cafe{" +
                "tipo='" + tipo + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
}
