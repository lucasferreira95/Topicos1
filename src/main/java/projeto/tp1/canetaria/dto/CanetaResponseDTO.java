package projeto.tp1.canetaria.dto;

import projeto.tp1.canetaria.model.Caneta;
import projeto.tp1.canetaria.model.Cor;
import projeto.tp1.canetaria.model.Tinta;

public record CanetaResponseDTO(Long id, String nome, Double preco, Cor cor, Tinta tinta, FabricanteResponseDTO fabricante, PontaResponseDTO ponta) {
    
    public static CanetaResponseDTO valueOf(Caneta caneta){
        return new CanetaResponseDTO(caneta.getId(), caneta.getNome(), caneta.getPreco(), caneta.getCor(), caneta.getTinta(),
             FabricanteResponseDTO.valueOf(caneta.getFabricante()), 
             PontaResponseDTO.valueOf(caneta.getPonta())
             );
    }


    
}
