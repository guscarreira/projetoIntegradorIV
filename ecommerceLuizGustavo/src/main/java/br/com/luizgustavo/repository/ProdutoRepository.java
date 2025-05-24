
package br.com.luizgustavo.repository;

import br.com.luizgustavo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
