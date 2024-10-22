package projeto.tp1.canetaria.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import projeto.tp1.canetaria.model.UsuarioWeb;

@ApplicationScoped
public class UsuarioWebRepository implements PanacheRepository<UsuarioWeb> {
   
    public List<UsuarioWeb> findByLogin(String login) {
        return find("SELECT u FROM UsuarioWeb u WHERE u.login LIKE ?1", "%" + login + "%").list();
    }
    
}
