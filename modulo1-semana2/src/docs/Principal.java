package docs;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.miar();
        gato.fome(true);

        List.of("");
    }

    /**
     * Método que processa quntos gatos foram atendidos
     * @param gatos representa a lsita de gatos para processamento
     * @return Long quantidade de gatos atendidos
     */
    public Long processar(List<Gato> gatos){
        for (Gato gato : gatos) {
            System.out.println(gato.nome);
        }
        return 1L;
    }
}
