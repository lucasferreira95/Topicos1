package projeto.tp1.canetaria.dto;

import projeto.tp1.canetaria.model.Fabricante;

public record FabricanteResponseDTO(Long id, String nome, String cnpj, String contato, Integer cep) {

    public static FabricanteResponseDTO valueOf(Fabricante fabricante) {
        return new FabricanteResponseDTO(fabricante.getId(), fabricante.getNome(), fabricante.getCnpj(),fabricante.getContato(),fabricante.getCep());
    }
    
}
