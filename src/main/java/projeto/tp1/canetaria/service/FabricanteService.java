package projeto.tp1.canetaria.service;

import java.util.List;

import projeto.tp1.canetaria.dto.FabricanteRequestDTO;
import projeto.tp1.canetaria.model.Fabricante;

public interface FabricanteService {
    
    Fabricante findById(Long id);

    List<Fabricante> findByNome(String nome);

    List<Fabricante> findAll();

    Fabricante create(FabricanteRequestDTO dto);

    Fabricante update(Long id, FabricanteRequestDTO dto);

    void delete(Long id);

}
