package projeto.tp1.canetaria.dto;

import java.time.LocalDate;

public record LoteRequestDTO(String codigo, Integer quantidade, LocalDate dataFabricacao) {

    
}
