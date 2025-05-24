
package br.com.luizgustavo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String formaPagamento;
    private Double valor;
    private LocalDate dataPagamento;

    @ManyToOne
    private Venda venda;
}
