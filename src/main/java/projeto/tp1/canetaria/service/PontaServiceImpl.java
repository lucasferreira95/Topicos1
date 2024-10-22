package projeto.tp1.canetaria.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import projeto.tp1.canetaria.dto.PontaRequestDTO;
import projeto.tp1.canetaria.model.Ponta;
import projeto.tp1.canetaria.repository.PontaRepository;

@ApplicationScoped
public class PontaServiceImpl implements PontaService {

    @Inject
    public PontaRepository pontaRepository;

    @Override
    public Ponta findById(Long id) {
        return pontaRepository.findById(id);
    }

    @Override
    public List<Ponta> findByEspessura(Float espessura) {
        return pontaRepository.findByEspessura(espessura);
    }

    @Override
    public List<Ponta> findAll() {
        return pontaRepository.findAll().list();
    }

    @Override
    @Transactional
    public Ponta create(PontaRequestDTO dto){
        Ponta ponta = new Ponta();
        ponta.setEspessura(dto.espessura());
        ponta.setTipo(dto.tipo());

        pontaRepository.persist(ponta);
        return ponta;
    }

    @Override
    @Transactional
    public Ponta update(Long id, PontaRequestDTO dto) {
        Ponta ponta = pontaRepository.findById(id);

        ponta.setEspessura(dto.espessura());
        ponta.setTipo(dto.tipo());

        return ponta;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        pontaRepository.deleteById(id);
    }
}
