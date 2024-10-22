package projeto.tp1.canetaria.service;

import java.util.List;

import projeto.tp1.canetaria.dto.UsuarioWebRequestDTO;
import projeto.tp1.canetaria.model.UsuarioWeb;

public interface UsuarioWebService {
    
    UsuarioWeb findById(Long id);

    List<UsuarioWeb> findByLogin(String login);

    List<UsuarioWeb> findAll();

    UsuarioWeb create(UsuarioWebRequestDTO dto);

    UsuarioWeb update(Long id, UsuarioWebRequestDTO dto);

    void delete(Long id);


}
