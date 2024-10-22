package projeto.tp1.canetaria.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Cor {

    AZUL(1,"Azul"),
    PRETA(2,"Preta"),
    VERMELHA(3,"Vermelha"),
    VERDE(4,"Verde"),
    AMARELA(5,"Amarela"),
    ROXA(6,"Roxa"),
    MARROM(7,"Marrom"),
    PRATA(8,"Prata");

    private final Integer id;
    private final String label;

    Cor(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static Cor valueOf(Integer id) {
        if (id == null)
            return null;
        for (Cor cor : Cor.values()) {
            if (cor.getId().equals(id))
                return cor;
        }
        throw new IllegalArgumentException("Id inválido");
    }
}
