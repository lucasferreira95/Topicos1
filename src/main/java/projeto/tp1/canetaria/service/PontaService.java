package projeto.tp1.canetaria.service;

import java.util.List;

import projeto.tp1.canetaria.dto.PontaRequestDTO;
import projeto.tp1.canetaria.model.Ponta;

public interface PontaService {
    
    Ponta findById(Long id);

    List<Ponta> findByEspessura(Float espessura);

    List<Ponta> findAll();

    Ponta create(PontaRequestDTO dto);

    Ponta update(Long id, PontaRequestDTO dto);

    void delete(Long id);

}
