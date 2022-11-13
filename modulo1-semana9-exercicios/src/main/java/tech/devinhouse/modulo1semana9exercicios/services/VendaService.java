package tech.devinhouse.modulo1semana9exercicios.services;

import org.springframework.stereotype.Service;
import tech.devinhouse.modulo1semana9exercicios.models.Produto;
import tech.devinhouse.modulo1semana9exercicios.models.Venda;
import tech.devinhouse.modulo1semana9exercicios.models.VendaItem;
import tech.devinhouse.modulo1semana9exercicios.repositories.ProdutoRepository;
import tech.devinhouse.modulo1semana9exercicios.repositories.VendaRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class VendaService {

    private VendaRepository vendaRepository;
    private ProdutoRepository produtoRepository;

    public VendaService(VendaRepository vendaRepository, ProdutoRepository produtoRepository){
        this.vendaRepository = vendaRepository;
        this.produtoRepository = produtoRepository;
    }

    public List<Venda> buscar(){
        return vendaRepository.findAll();
    }

    public Venda salvar(Venda venda) throws Exception {

        BigDecimal quantidade = BigDecimal.ZERO;
        BigDecimal vendaTotal = BigDecimal.ZERO;

        for (VendaItem item: venda.getItens()) {
            item.setVenda(venda);

            if(item.getQuantidade() == null || item.getQuantidade().compareTo(BigDecimal.ZERO) <= 0){
                throw new Exception("Quantidade do item precisar ser informada");
            }
            Produto produto = produtoRepository.findById(item.getProduto().getId()).get();
            item.setProduto(produto);
            item.setValorUnitario(produto.getValorUnitario());
            item.setValorTotal(item.getQuantidade().multiply(item.getValorUnitario()));

            vendaTotal = vendaTotal.add(item.getValorTotal());
            quantidade = quantidade.add(item.getQuantidade());
        }

        venda.setQuantidade(quantidade);
        venda.setValorTotal(vendaTotal);
        venda.setStatus("P");
        return vendaRepository.save(venda);
    }

    public boolean apagar(Integer id){
        try{
            vendaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Venda buscarPorId(Integer id) {
        return vendaRepository.findById(id).get();
    }

    public List<Venda> buscarPorDatas(Date dataInicial, Date dataFinal) {
        if (dataInicial == null){
            return new ArrayList<>();
        }
        if (dataFinal == null){
            return vendaRepository.findByDataVendaAfter(dataInicial);
        }
        return vendaRepository.findByDataVendaBetween(dataInicial, dataFinal);
    }

    public List<Venda> buscarPorStatus(String status){
        return vendaRepository.findByStatusIgnoreCase(status);
    }
}
