package projeto.tp1.canetaria.service;

import java.util.List;

import projeto.tp1.canetaria.dto.EnderecoRequestDTO;
import projeto.tp1.canetaria.model.Endereco;

public interface EnderecoService {
    
    Endereco findById(Long id);

    List<Endereco> findByCep(String cep);

    List<Endereco> findAll();

    Endereco create(EnderecoRequestDTO dto);

    Endereco update(Long id, EnderecoRequestDTO dto);

    void delete(Long id);

}
