package projeto.tp1.canetaria.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import projeto.tp1.canetaria.dto.CanetaRequestDTO;
import projeto.tp1.canetaria.model.Caneta;
import projeto.tp1.canetaria.model.Cor;
import projeto.tp1.canetaria.model.Tinta;
import projeto.tp1.canetaria.repository.CanetaRepository;

@ApplicationScoped
public class CanetaServiceImpl implements CanetaService {

    @Inject
    public CanetaRepository canetaRepository;

    @Inject
    public FabricanteService fabricanteService;

    @Inject
    public PontaService pontaService;

    @Override
    public Caneta findById(Long id) {
        return canetaRepository.findById(id);
    }

    @Override
    public List<Caneta> findByNome(String nome) {
        return canetaRepository.findByNome(nome);
    }

    @Override
    public List<Caneta> findAll() {
        return canetaRepository.findAll().list();
    }

    @Override
    @Transactional
    public Caneta create(CanetaRequestDTO dto){
        Caneta caneta = new Caneta();
        caneta.setNome(dto.nome());
        caneta.setPreco(dto.preco());
        caneta.setCor(Cor.valueOf(dto.idCor()));
        caneta.setTinta(Tinta.valueOf(dto.idTinta()));

        caneta.setFabricante(fabricanteService.findById(dto.idFabricante()));
        caneta.setPonta(pontaService.findById(dto.idPonta()));

        canetaRepository.persist(caneta);
        return caneta;
    }

    @Override
    @Transactional
    public Caneta update(Long id, CanetaRequestDTO dto) {
        Caneta caneta = canetaRepository.findById(id);

        caneta.setNome(dto.nome());
        caneta.setPreco(dto.preco());
        caneta.setCor(Cor.valueOf(dto.idCor()));
        caneta.setTinta(Tinta.valueOf(dto.idTinta()));

        caneta.setFabricante(fabricanteService.findById(dto.idFabricante()));
        caneta.setPonta(pontaService.findById(dto.idPonta()));

        return caneta;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        canetaRepository.deleteById(id);
    }
}
