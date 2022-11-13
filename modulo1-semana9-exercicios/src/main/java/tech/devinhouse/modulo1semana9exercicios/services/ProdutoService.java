package tech.devinhouse.modulo1semana9exercicios.services;

import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana9exercicios.models.Produto;
import tech.devinhouse.modulo1semana9exercicios.repositories.ProdutoRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> buscar(){
        return produtoRepository.findAll();
    }

    public Produto salvar(Produto produto) throws Exception {
        if (produto.getValorUnitario() != null && produto.getValorUnitario().compareTo(BigDecimal.ZERO) < 0){
            throw new Exception("Valor unitário deve ser maior do que ZERO!");
        }
        if (produto.getSku() != null && !produto.getSku().isEmpty() && produtoRepository.existsBySku(produto.getSku())){
            throw  new Exception("SKU já existente!");
        }
        return produtoRepository.save(produto);
    }

    public boolean apagar(Integer id){
        try{
            produtoRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
