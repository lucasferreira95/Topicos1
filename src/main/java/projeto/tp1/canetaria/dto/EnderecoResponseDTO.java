package projeto.tp1.canetaria.dto;

import projeto.tp1.canetaria.model.Endereco;

public record EnderecoResponseDTO(Long id, String logradouro, String cidade, String estado, String cep) {
    
        public static EnderecoResponseDTO valueOf(Endereco endereco) {
        return new EnderecoResponseDTO(endereco.getId(), endereco.getLogradouro(), endereco.getCidade(),endereco.getEstado(),endereco.getCep());
    }
    

}
