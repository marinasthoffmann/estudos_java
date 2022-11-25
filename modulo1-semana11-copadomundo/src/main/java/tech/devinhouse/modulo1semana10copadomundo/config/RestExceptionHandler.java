package tech.devinhouse.modulo1semana10copadomundo.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import tech.devinhouse.modulo1semana10copadomundo.dto.ErroResponse;
import tech.devinhouse.modulo1semana10copadomundo.exceptions.RegistroExistenteException;
import tech.devinhouse.modulo1semana10copadomundo.exceptions.RegistroNaoEncontradoException;

import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RestExceptionHandler {

    @ExceptionHandler(RegistroExistenteException.class)
    public ResponseEntity<Object> handlerRegistroExistenteException(RegistroExistenteException e){
        ErroResponse erro = new ErroResponse(e.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
    }

    @ExceptionHandler(RegistroNaoEncontradoException.class)
    public ResponseEntity<Object> handlerRegistroNaoEncontradoException(RegistroNaoEncontradoException e){
        ErroResponse erro = new ErroResponse(e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleConstraintViolation(ConstraintViolationException ex) {
        Map<String, String> fieldErrors = new HashMap<>();
        ex.getConstraintViolations().forEach(e -> {
            Iterator<Path.Node> iterator = e.getPropertyPath().iterator();
            String fieldName = null;
            while(iterator.hasNext()) {
                fieldName = iterator.next().getName();
            }
            String errorMessage = e.getMessage();
            fieldErrors.put(fieldName, errorMessage);
        });
        ErroResponse erro = new ErroResponse("Erro de validação", fieldErrors);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }
}
