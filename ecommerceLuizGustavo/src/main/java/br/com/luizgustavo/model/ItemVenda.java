
package br.com.luizgustavo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ItemVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;
    private Double precoUnitario;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Venda venda;
}
