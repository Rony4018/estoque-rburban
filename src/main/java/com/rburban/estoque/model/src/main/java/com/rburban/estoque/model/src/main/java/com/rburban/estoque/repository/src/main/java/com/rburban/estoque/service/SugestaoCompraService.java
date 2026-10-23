java
package com.rburban.estoque.service;

import com.rburban.estoque.model.Produto;
import com.rburban.estoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SugestaoCompraService {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Método que gera a lista inteligente de compras para o comprador
    public List<Produto> gerarSugestoesDeCompra() {
        // Busca todos os produtos onde o estoque atual é menor ou igual ao estoque mínimo
        List<Produto> produtosCriticos = produtoRepository.findByQuantidadeEstoqueLessThanEqual(5); // Exemplo de gatilho
        
        return produtosCriticos;
    }
}
