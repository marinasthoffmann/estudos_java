package tech.devinhouse.modulo1semana9exercicios.services;

import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana9exercicios.models.Cliente;
import tech.devinhouse.modulo1semana9exercicios.repositories.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> buscar(){
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) throws Exception {
        if (cliente.getCpfCnpj() != null && !cliente.getCpfCnpj().isEmpty()
                && clienteRepository.existsByCpfCnpj(cliente.getCpfCnpj())){
            throw  new Exception("CPF/CNPJ já existente!");
        }
        return clienteRepository.save(cliente);
    }

    public boolean apagar(Integer id){
        try{
            clienteRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
