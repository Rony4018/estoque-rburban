package com.rburban.estoque.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String sku; // Ex: RBP0001 (Código da planilha)

    @Column(nullable = false)
    private String nome; // Ex: Camiseta Oversized

    private String categoria;
    private String cor;
    private String tamanho; // P, M, G, GG

    private BigDecimal precoCusto;
    private BigDecimal precoVenda;

    private Integer quantidadeEstoque;
    private Integer estoqueMinimo;
}
