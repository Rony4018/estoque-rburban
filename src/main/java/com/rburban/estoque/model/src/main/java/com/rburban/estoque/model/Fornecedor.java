package com.rburban.estoque.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "fornecedores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nomeFantasia;

    @Column(length = 14, unique = true)
    private String cnpj;

    private Integer leadTimeDias; // Prazo médio de entrega em dias
    private String contato;
}
