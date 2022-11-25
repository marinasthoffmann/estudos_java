package tech.devinhouse.modulo1semana10copadomundo.services;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana10copadomundo.exceptions.RegistroExistenteException;
import tech.devinhouse.modulo1semana10copadomundo.models.Usuario;
import tech.devinhouse.modulo1semana10copadomundo.repositories.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioService implements UserDetailsService {

    private UsuarioRepository repository;
    private PasswordEncoder passwordEncoder;

    public Usuario criar(Usuario usuario){
        boolean existente = repository.existsUsuarioByEmail(usuario.getEmail());
        if(existente)
            throw new RegistroExistenteException("Usuario", usuario.getEmail());

        String senhaCodificada = passwordEncoder.encode(usuario.getSenha());
        usuario.setSenha(senhaCodificada);

        return repository.save(usuario);
    }

    public List<Usuario> consultar(){
        return repository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Usuario> usuarioOptional = repository.findByEmail(email);

        if (usuarioOptional.isEmpty())
            throw new UsernameNotFoundException("Usuário não encontrado!");

         return usuarioOptional.get();
    }
}
