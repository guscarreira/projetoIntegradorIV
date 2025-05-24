
package br.com.luizgustavo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String razaoSocial;
    private String cnpj;
}
