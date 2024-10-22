package projeto.tp1.canetaria.dto;

import projeto.tp1.canetaria.model.Ponta;

public record PontaResponseDTO(Long id, Float espessura, String tipo) {
    
        public static PontaResponseDTO valueOf(Ponta ponta) {
        return new PontaResponseDTO(ponta.getId(), ponta.getEspessura(), ponta.getTipo());
    }

}
