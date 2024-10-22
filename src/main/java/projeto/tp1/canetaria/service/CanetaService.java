package projeto.tp1.canetaria.service;

import java.util.List;

import projeto.tp1.canetaria.dto.CanetaRequestDTO;
import projeto.tp1.canetaria.model.Caneta;

public interface CanetaService {
    
    Caneta findById(Long id);

    List<Caneta> findByNome(String nome);

    List<Caneta> findAll();

    Caneta create(CanetaRequestDTO dto);

    Caneta update(Long id, CanetaRequestDTO dto);

    void delete(Long id);

}
