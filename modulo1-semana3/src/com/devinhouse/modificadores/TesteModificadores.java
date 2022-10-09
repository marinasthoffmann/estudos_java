package com.devinhouse.modificadores;

public class TesteModificadores {

        public String atributoPublico = "Atributo Publico";

        private String atributoPrivado;

        String atributoDefault = "Atributo Default";


        public String metodoPublico() {
            return "Metodo Publico";
        }

        private String metodoPrivado() {
            return "Metodo Privado";
        }

        String metodoDefault() {
            return "Metodo Default";
        }

        public String metodoPublicoAcessandoAtributoPrivado() {
            return "Este metodo acessa o atributo privado: " + this.atributoPrivado +
                    " e o método privado: " + this.metodoPrivado();
        }

}
