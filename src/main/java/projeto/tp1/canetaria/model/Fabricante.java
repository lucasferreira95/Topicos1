package projeto.tp1.canetaria.model;

import jakarta.persistence.Entity;

@Entity
public class Fabricante extends DefaultEntity{

    private String nome;
    private String cnpj;
    private String contato;
    private Integer cep;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public Integer getCep() {
        return cep;
    }
    public void setCep(Integer cep) {
        this.cep = cep;
    }
    

}
