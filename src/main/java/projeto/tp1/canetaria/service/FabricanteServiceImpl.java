package projeto.tp1.canetaria.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import projeto.tp1.canetaria.dto.FabricanteRequestDTO;
import projeto.tp1.canetaria.model.Fabricante;
import projeto.tp1.canetaria.repository.FabricanteRepository;

@ApplicationScoped
public class FabricanteServiceImpl implements FabricanteService {

    @Inject
    public FabricanteRepository fabricanteRepository;

    @Override
    public Fabricante findById(Long id) {
        return fabricanteRepository.findById(id);
    }

    @Override
    public List<Fabricante> findByNome(String nome) {
        return fabricanteRepository.findByNome(nome);
    }

    @Override
    public List<Fabricante> findAll() {
        return fabricanteRepository.findAll().list();
    }

    @Override
    @Transactional
    public Fabricante create(FabricanteRequestDTO dto){
        Fabricante fabricante = new Fabricante();
        fabricante.setNome(dto.nome());
        fabricante.setCnpj(dto.cnpj());
        fabricante.setContato(dto.contato());
        fabricante.setCep(dto.cep());

        fabricanteRepository.persist(fabricante);
        return fabricante;
    }

    @Override
    @Transactional
    public Fabricante update(Long id, FabricanteRequestDTO dto) {
        Fabricante fabricante = fabricanteRepository.findById(id);

        fabricante.setNome(dto.nome());
        fabricante.setCnpj(dto.cnpj());
        fabricante.setContato(dto.contato());
        fabricante.setCep(dto.cep());

        return fabricante;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        fabricanteRepository.deleteById(id);
    }
}
