package tech.devinhouse.modulo1semana10devingran;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import tech.devinhouse.modulo1semana10devingran.model.Perfil;
import tech.devinhouse.modulo1semana10devingran.model.Status;
import tech.devinhouse.modulo1semana10devingran.service.PerfilService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class Modulo1Semana10DevingranApplication {

    public static void main(String[] args) {
        SpringApplication.run(Modulo1Semana10DevingranApplication.class, args);
    }

    @Bean
    CommandLineRunner run(PerfilService perfilService){
        return args -> {
            List<Perfil> lista = perfilService.consultar(3, 0, "nome", "ASC");
            if (lista.isEmpty()){
                perfilService.criar(new Perfil("Marina", "Doida varrida", LocalDate.now().minusYears(29), "Desenvolvedor", LocalDateTime.now(), LocalDateTime.now(), Status.ATIVO, null));
                perfilService.criar(new Perfil("Lucas", "Nada normal", LocalDate.now().minusYears(30), "Desenvolvedor", LocalDateTime.now(), LocalDateTime.now(), Status.ATIVO, null));
            }
        };
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

}
