
package br.com.luizgustavo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime data;
    private Double valorTotal;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
    private List<ItemVenda> itens;

    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
    private List<Pagamento> pagamentos;
}
