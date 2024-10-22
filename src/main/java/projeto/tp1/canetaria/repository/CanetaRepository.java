package projeto.tp1.canetaria.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import projeto.tp1.canetaria.model.Caneta;
import projeto.tp1.canetaria.model.Fabricante;
import projeto.tp1.canetaria.model.Ponta;

@ApplicationScoped
public class CanetaRepository implements PanacheRepository<Caneta> {
   
    public List<Caneta> findByNome(String nome) {
        // return find("SELECT m FROM Caneta m WHERE m.nome LIKE ?1", "%" + nome + "%").list();
        return find("nome LIKE ?1", "%" + nome + "%").list();
    }

    public List<Caneta> findByFabricante(Fabricante fabricante) {
         return find("SELECT f FROM Caneta f WHERE f.fabricante.id = ?1", fabricante.getId()).list();
    }

    public List<Caneta> findByPonta(Ponta ponta) {
        return find("SELECT p FROM Caneta p WHERE p.ponta.id = ?1", ponta.getId()).list();
   }
    
}
