package projeto.tp1.canetaria.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Tinta {
    COMUM(1,"Comum"),
    GEL(2,"Gel"),
    NANQUIM(3,"Nanquim"),
    OLEO(4,"Oleo"),
    HIDROGRAFICA(5,"Hidrografica");

    private final Integer id;
    private final String label;

    Tinta(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static Tinta valueOf(Integer id) {
        if (id == null)
            return null;
        for (Tinta tinta : Tinta.values()) {
            if (tinta.getId().equals(id))
                return tinta;
        }
        throw new IllegalArgumentException("Id inválido");
    }
    
}
