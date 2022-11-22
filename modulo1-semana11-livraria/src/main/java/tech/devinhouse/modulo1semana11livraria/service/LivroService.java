package tech.devinhouse.modulo1semana11livraria.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana11livraria.exception.RegistroExistenteException;
import tech.devinhouse.modulo1semana11livraria.exception.RegistroNaoEncontradoException;
import tech.devinhouse.modulo1semana11livraria.model.Livro;
import tech.devinhouse.modulo1semana11livraria.repository.LivroRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LivroService {

    LivroRepository repository;

    public Livro salvar(Livro livro) {
        Optional<Livro> livroOpt = repository.findByIsbn(livro.getIsbn());
        if (livroOpt.isPresent())
            throw new RegistroExistenteException("Livro", livro.getIsbn());
        livro.setDataInclusao(LocalDateTime.now());
        livro = repository.save(livro);
        return livro;
    }

    public List<Livro> consultar() {
        return repository.findAll();
    }

    public Livro consultar(Integer id) {
        Optional<Livro> livroOpt = repository.findById(id);
        if (livroOpt.isEmpty())
            throw new RegistroNaoEncontradoException("Livro", id);
        Livro livro = livroOpt.get();
        return livro;
    }

    public Livro atualizar(Livro livroAtualizado) {
        Optional<Livro> livroOpt = repository.findById(livroAtualizado.getId());
        if (livroOpt.isEmpty())
            throw new RegistroNaoEncontradoException("Livro", livroAtualizado.getId());
        Livro livroBD = livroOpt.get();
        livroBD.setTitulo( livroAtualizado.getTitulo() );
        livroBD.setIdioma( livroAtualizado.getIdioma() );
        livroBD.setNumeroPaginas( livroAtualizado.getNumeroPaginas() );
        livroAtualizado = repository.save(livroBD);
        return livroAtualizado;
    }

    public void excluir(Integer id) {
        boolean existe = repository.existsById(id);
        if (!existe)
            throw new RegistroNaoEncontradoException("Livro", id);
        repository.deleteById(id);
    }

}
