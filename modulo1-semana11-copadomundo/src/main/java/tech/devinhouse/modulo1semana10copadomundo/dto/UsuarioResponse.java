package tech.devinhouse.modulo1semana10copadomundo.dto;

import lombok.Data;
import tech.devinhouse.modulo1semana10copadomundo.models.Papeis;
import java.time.LocalDate;
import java.util.List;

@Data
public class UsuarioResponse {

    private Integer id;
    private String email;
    private LocalDate dataNascimento;
    private List<Papeis> papeis;
}
