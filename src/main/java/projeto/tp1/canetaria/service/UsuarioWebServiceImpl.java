package projeto.tp1.canetaria.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import projeto.tp1.canetaria.dto.UsuarioWebRequestDTO;
import projeto.tp1.canetaria.model.UsuarioWeb;
import projeto.tp1.canetaria.model.TipoUsuario;
import projeto.tp1.canetaria.repository.UsuarioWebRepository;

@ApplicationScoped
public class UsuarioWebServiceImpl implements UsuarioWebService {

    @Inject
    public UsuarioWebRepository usuarioWebRepository;

    @Override
    public UsuarioWeb findById(Long id) {
        return usuarioWebRepository.findById(id);
    }

    @Override
    public List<UsuarioWeb> findByLogin(String login) {
        return usuarioWebRepository.findByLogin(login);
    }

    @Override
    public List<UsuarioWeb> findAll() {
        return usuarioWebRepository.findAll().list();
    }

    @Override
    @Transactional
    public UsuarioWeb create(UsuarioWebRequestDTO dto){
        UsuarioWeb usuarioWeb = new UsuarioWeb();
        usuarioWeb.setLogin(dto.login());
        usuarioWeb.setSenha(dto.senha());
        usuarioWeb.setTipoUsuario(TipoUsuario.valueOf(dto.idTipoUsuario()));

        usuarioWebRepository.persist(usuarioWeb);
        return usuarioWeb;
    }

    @Override
    @Transactional
    public UsuarioWeb update(Long id, UsuarioWebRequestDTO dto) {
        UsuarioWeb usuarioWeb = usuarioWebRepository.findById(id);

        usuarioWeb.setLogin(dto.login());
        usuarioWeb.setSenha(dto.senha());
        usuarioWeb.setTipoUsuario(TipoUsuario.valueOf(dto.idTipoUsuario()));

        return usuarioWeb;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        usuarioWebRepository.deleteById(id);
    }
}
