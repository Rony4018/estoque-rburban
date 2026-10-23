java
package com.rburban.estoque.repository;

import com.rburban.estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Busca produto pelo SKU (Código da sua planilha Rburban)
    Optional<Produto> findBySku(String sku);

    // Consulta inteligente de compras: busca produtos que atingiram ou estão abaixo do estoque mínimo
    List<Produto> findByQuantidadeEstoqueLessThanEqual(Integer estoqueMinimo);
}
```

4. Clique no botão verde **`Commit changes...`** (ou **`Confirmar alterações`**) para salvar.

---

### Passo 2: Criar o `FornecedorRepository.java`

1. Clique novamente em **`Add file`** > **`Create new file`**.
2. No campo do nome do arquivo, digite este caminho:
   ```text
   src/main/java/com/rburban/estoque/repository/FornecedorRepository.java
   ```
3. No espaço para o código, cole o seguinte código Java:

```java
package com.rburban.estoque.repository;

import com.rburban.estoque.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

    // Busca fornecedor pelo CNPJ
    Optional<Fornecedor> findByCnpj(String cnpj);
}
```
