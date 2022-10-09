package docs;

/**
* @author marinahoffmann
 * Esta classe representa um gato no sistema de veterinário
 */
public class Gato {
        /**
         * Este atributo representa o nome dado pelo dono do gato
         */
        public String nome;

    /**
     * Método para simular o miado do gato.
     * @return String onomatopeia do miado do gato
     */
    public String miar(){
            return "miau";
        }

    /**
     * Método para verificar se o gato está com fome.
     * @param estaComFome indica se o gato está com fome
     * @return String palavra representando o estado do gato
     * @throws NullPointerException
     */
    public String fome(Boolean estaComFome){
        return estaComFome ? "Fome" : "Saciado";
    }
}
