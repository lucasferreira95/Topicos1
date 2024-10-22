package projeto.tp1.canetaria.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TipoUsuario {
    
    ADMIN(1, "Admin"),
    CLIENTE(2, "Cliente");

    private final Integer id;
    private final String label;
    
    TipoUsuario(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static TipoUsuario valueOf(Integer id) {
        if (id == null)
            return null;
        for (TipoUsuario tipoUsuario : TipoUsuario.values()) {
            if (tipoUsuario.getId().equals(id))
                return tipoUsuario;
        }
        throw new IllegalArgumentException("Id inválido");
    }

}
