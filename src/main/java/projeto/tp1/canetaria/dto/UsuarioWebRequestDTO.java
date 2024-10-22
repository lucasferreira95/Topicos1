package projeto.tp1.canetaria.dto;

import jakarta.validation.constraints.NotBlank;

public record UsuarioWebRequestDTO(@NotBlank(message = "O campo deve ser preenchido") String login,@NotBlank(message = "O campo deve ser preenchido") String senha, Integer idTipoUsuario) {
    
}
