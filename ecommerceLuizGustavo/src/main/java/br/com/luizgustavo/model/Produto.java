
package br.com.luizgustavo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private String nome;
    private String codigoBarras;
    private Double valorCompra;
    private Double valorVenda;
    private Integer estoque;

    @ManyToOne
    private Fornecedor fornecedor;
}
