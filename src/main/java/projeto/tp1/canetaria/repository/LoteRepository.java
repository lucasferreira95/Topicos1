package projeto.tp1.canetaria.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import projeto.tp1.canetaria.model.Lote;

@ApplicationScoped
public class LoteRepository implements PanacheRepository<Lote>{
    public List<Lote> findByCodigo(String codigo){
        return find("codigo LIKE ?1", "%" + codigo + "%").list();
    }
}
