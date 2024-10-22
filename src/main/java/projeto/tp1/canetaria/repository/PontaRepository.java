package projeto.tp1.canetaria.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import projeto.tp1.canetaria.model.Ponta;

@ApplicationScoped
public class PontaRepository implements PanacheRepository<Ponta> {
   
    public List<Ponta> findByEspessura(Float espessura) {
        return find("SELECT e FROM Ponta e WHERE e.espessura LIKE ?1", "%" + espessura + "%").list();
    }
    
}
