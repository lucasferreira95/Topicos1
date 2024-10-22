package projeto.tp1.canetaria.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import projeto.tp1.canetaria.model.Endereco;

@ApplicationScoped
public class EnderecoRepository implements PanacheRepository<Endereco> {
   
    public List<Endereco> findByCep(String cep) {
        return find("SELECT e FROM Endereco e WHERE e.cep LIKE ?1", "%" + cep + "%").list();
    }
    
}
