package projeto.tp1.canetaria.dto;

import projeto.tp1.canetaria.model.TipoUsuario;
import projeto.tp1.canetaria.model.UsuarioWeb;

public record UsuarioWebResponseDTO(Long id, String login, String senha, TipoUsuario tipoUsuario) {
    public static UsuarioWebResponseDTO valueOf(UsuarioWeb usuarioWeb) {
        return new UsuarioWebResponseDTO(usuarioWeb.getId(),usuarioWeb.getLogin(), usuarioWeb.getSenha(), usuarioWeb.getTipoUsuario());
    }
    
}
