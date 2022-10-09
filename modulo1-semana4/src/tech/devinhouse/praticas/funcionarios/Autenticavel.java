package tech.devinhouse.praticas.funcionarios;

@FunctionalInterface
public interface Autenticavel { // interface funcional, só tem um método publico e uma classe nela (que n opode ser default)

    public boolean autenticar(String nome, String senha);
}
