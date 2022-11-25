package tech.devinhouse.modulo1semana10copadomundo.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana10copadomundo.exceptions.RegistroExistenteException;
import tech.devinhouse.modulo1semana10copadomundo.models.Usuario;
import tech.devinhouse.modulo1semana10copadomundo.repositories.UsuarioRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UserDetailsService {

    private final UsuarioRepository repository;
    private final PasswordEncoder passwordEncoder;
    private String segredo = "ASDHAIODASKLDJASLKDJASLKJDKAL";

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

    public String generateToken(Usuario usuario) {
        Algorithm algorithm = Algorithm.HMAC256(segredo.getBytes());
        String accessToken = JWT.create()
                .withSubject(usuario.getEmail())
                .withExpiresAt(new Date(System.currentTimeMillis() + 10 * 60 * 6000))  // expires in 10 min
                .withIssuer("Copa Do Mundo-API")
                .withClaim("roles", usuario.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .sign(algorithm);
        return accessToken;
    }

    public String getTokenFrom(String authorizationHeader){
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer "))
            throw new IllegalArgumentException("Invalid Headers");
        String token = authorizationHeader.substring("Bearer ".length());
        return token;
    }

    public DecodedJWT getDecodedTokenFrom(String token) {
        Algorithm algorithm = Algorithm.HMAC256(segredo.getBytes());
        JWTVerifier verifier = JWT.require(algorithm).build();
        DecodedJWT decodedJWT = verifier.verify(token);
        return decodedJWT;
    }
}
