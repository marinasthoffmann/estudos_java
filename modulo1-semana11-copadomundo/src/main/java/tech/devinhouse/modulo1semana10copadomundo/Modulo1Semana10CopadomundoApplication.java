package tech.devinhouse.modulo1semana10copadomundo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import tech.devinhouse.modulo1semana10copadomundo.models.Papeis;
import tech.devinhouse.modulo1semana10copadomundo.models.Usuario;
import tech.devinhouse.modulo1semana10copadomundo.services.UsuarioService;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class Modulo1Semana10CopadomundoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Modulo1Semana10CopadomundoApplication.class, args);
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UsuarioService usuarioService) {
        return args -> {  // inserting data after application is up
            if (usuarioService.consultar().isEmpty()) {
                usuarioService.criar(new Usuario(null, "jameskirk@enterprise.com", "abcd", LocalDate.now().minusYears(20), Arrays.asList(Papeis.ADMINISTRADOR)));
                usuarioService.criar(new Usuario(null, "spock@enterprise.com", "abcd", LocalDate.now().minusYears(20), Arrays.asList(Papeis.MANTENEDOR_TIMES)));
                usuarioService.criar(new Usuario(null, "mccoy@enterprise.com", "abcd", LocalDate.now().minusYears(20), Arrays.asList(Papeis.MANTENEDOR_TIMES)));
            }
        };

    }
}
