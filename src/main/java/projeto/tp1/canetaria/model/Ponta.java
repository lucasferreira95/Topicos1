package projeto.tp1.canetaria.model;

import jakarta.persistence.Entity;

@Entity
public class Ponta extends DefaultEntity {

    private Float espessura;
    private String tipo;
    
    public Float getEspessura() {
        return espessura;
    }
    public void setEspessura(Float espessura) {
        this.espessura = espessura;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
