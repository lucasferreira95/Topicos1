package projeto.tp1.canetaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Caneta extends DefaultEntity {

    private String nome;
    private Double preco;
    private Cor cor;
    private Tinta tinta;

    @ManyToOne
    @JoinColumn(name = "id_fabricante")
    private Fabricante fabricante;

    @ManyToOne
    @JoinColumn(name = "id_ponta")
    private Ponta ponta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Tinta getTinta() {
        return tinta;
    }

    public void setTinta(Tinta tinta) {
        this.tinta = tinta;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Ponta getPonta() {
        return ponta;
    }

    public void setPonta(Ponta ponta) {
        this.ponta = ponta;
    }
    
}
