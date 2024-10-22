package projeto.tp1.canetaria.dto;

import java.time.LocalDate;

import projeto.tp1.canetaria.model.Lote;

public record LoteResponseDTO(Long id, String codigo, Integer quantidade, LocalDate dataFabricacao) {

    public static LoteResponseDTO valueOf(Lote lote) {
        return new LoteResponseDTO(lote.getId(), lote.getCodigo(), lote.getQuantidade(),lote.getDataFabricacao());
    }
    
}
