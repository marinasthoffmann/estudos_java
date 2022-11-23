package tech.devinhouse.modulo1semana11livraria.service;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana11livraria.exception.RegistroExistenteException;
import tech.devinhouse.modulo1semana11livraria.model.Usuario;
import tech.devinhouse.modulo1semana11livraria.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioService implements UserDetailsService {

    private UsuarioRepository repository;
    private PasswordEncoder passwordEncoder;

    public Usuario criar(Usuario usuario){
        boolean existe = repository.existsUsuarioByEmail(usuario.getEmail());
        if(existe)
            throw new RegistroExistenteException("Usuário", usuario.getEmail());

        String senhaCodificada = passwordEncoder.encode(usuario.getSenha());
        usuario.setSenha(senhaCodificada);

        usuario = repository.save(usuario);
        return usuario;
    }

    public List<Usuario> listar() {
        return repository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Usuario> usuarioOptional = repository.findByEmail(email);
        if(usuarioOptional.isEmpty()){
            throw new UsernameNotFoundException("Usuário não encontrado!");
        }
        return usuarioOptional.get();
    }
}
