
package br.com.luizgustavo.service;

import br.com.luizgustavo.model.Venda;
import br.com.luizgustavo.repository.VendaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VendaService {
    private final VendaRepository vendaRepository;

    public VendaService(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    public Venda salvar(Venda venda) {
        venda.setData(LocalDateTime.now());
        return vendaRepository.save(venda);
    }

    public List<Venda> listarTodos() {
        return vendaRepository.findAll();
    }
}
