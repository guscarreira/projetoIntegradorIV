
package br.com.luizgustavo.controller;

import br.com.luizgustavo.model.Venda;
import br.com.luizgustavo.service.VendaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {
    private final VendaService vendaService;

    public VendaController(VendaService vendaService) {
        this.vendaService = vendaService;
    }

    @PostMapping
    public ResponseEntity<Venda> salvar(@RequestBody Venda venda) {
        return ResponseEntity.ok(vendaService.salvar(venda));
    }

    @GetMapping
    public ResponseEntity<List<Venda>> listar() {
        return ResponseEntity.ok(vendaService.listarTodos());
    }
}
