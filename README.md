# 📦 Sistema Inteligente de Controlo de Suprimentos (Estoque Rburban)

## 🎯 Sobre o Projeto
Sistema backend desenvolvido em **Java com Spring Boot** para automação de controlo de stock, gestão de fornecedores e geração de sugestões inteligentes de compra. O projeto foi desenhado a partir de desafios reais de gestão de stocks no setor de vestuário e e-commerce (marca Rburban).

## 🚀 Tecnologias Utilizadas
* **Java 17+**
* **Spring Boot** (Web, Data JPA)
* **Hibernate / Lombok**
* **Base de Dados Relacional** (PostgreSQL / MySQL)
* **Arquitetura RESTful**

## 💡 Regras de Negócio e Funcionalidades
* **Gestão de Produtos e SKUs:** Controlo detalhado por categoria, cor, tamanho, preço de custo e preço de venda.
* **Gatilho de Reposição Automática:** Monitorização em tempo real de produtos que atingem ou ficam abaixo do stock mínimo definido.
* **Sugestões de Compra Inteligentes:** Módulo de apoio à decisão para o comprador otimizar o capital de giro e evitar rupturas de stock.

## 🔗 Endpoints Principais
* `GET /api/produtos` - Lista todos os produtos registados.
* `GET /api/produtos/sugestoes-compra` - Retorna a lista inteligente de produtos que necessitam de reposição.
* `POST /api/produtos` - Regista novos produtos no sistema.

---
*Desenvolvido por Rony Dantas | Projeto focado em Análise e Desenvolvimento de Sistemas e Supply Chain.*
