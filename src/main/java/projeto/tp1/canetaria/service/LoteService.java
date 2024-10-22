package projeto.tp1.canetaria.service;

import java.util.List;

import projeto.tp1.canetaria.dto.LoteRequestDTO;
import projeto.tp1.canetaria.model.Lote;

public interface LoteService {
    
    Lote findById(Long id);

    List<Lote> findByCodigo(String codigo);

    List<Lote> findAll();

    Lote create(LoteRequestDTO dto);

    Lote update(Long id, LoteRequestDTO dto);

    void delete(Long id);

}
