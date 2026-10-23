java
package com.rburban.estoque.controller;

import com.rburban.estoque.model.Produto;
import com.rburban.estoque.repository.ProdutoRepository;
import com.rburban.estoque.service.SugestaoCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private SugestaoCompraService sugestaoCompraService;

    // Endpoint para listar todos os produtos da loja
    @GetMapping
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    // Endpoint para obter a lista inteligente de compras (gatilho de stock mínimo)
    @GetMapping("/sugestoes-compra")
    public List<Produto> obterSugestoesCompra() {
        return sugestaoCompraService.gerarSugestoesDeCompra();
    }

    // Endpoint para cadastrar um novo produto no sistema
    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
