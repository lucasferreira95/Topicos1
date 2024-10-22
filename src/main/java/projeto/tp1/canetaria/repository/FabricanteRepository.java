package projeto.tp1.canetaria.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import projeto.tp1.canetaria.model.Fabricante;

@ApplicationScoped
public class FabricanteRepository implements PanacheRepository<Fabricante> {
   
    public List<Fabricante> findByNome(String nome) {
        return find("SELECT f FROM Fabricante f WHERE f.nome LIKE ?1", "%" + nome + "%").list();
    }
    
}
