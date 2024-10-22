package projeto.tp1.canetaria.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import projeto.tp1.canetaria.dto.LoteRequestDTO;
import projeto.tp1.canetaria.model.Lote;
import projeto.tp1.canetaria.repository.LoteRepository;

@ApplicationScoped
public class LoteServiceImpl implements LoteService {

    @Inject
    public LoteRepository loteRepository;

    @Override
    public Lote findById(Long id) {
        return loteRepository.findById(id);
    }

    @Override
    public List<Lote> findByCodigo(String codigo) {
        return loteRepository.findByCodigo(codigo);
    }

    @Override
    public List<Lote> findAll() {
        return loteRepository.findAll().list();
    }

    @Override
    @Transactional
    public Lote create(LoteRequestDTO dto){
        Lote lote = new Lote();
        lote.setCodigo(dto.codigo());
        lote.setQuantidade(dto.quantidade());
        lote.setDataFabricacao(dto.dataFabricacao());

        loteRepository.persist(lote);
        return lote;
    }

    @Override
    @Transactional
    public Lote update(Long id, LoteRequestDTO dto) {
        Lote lote = loteRepository.findById(id);

        lote.setCodigo(dto.codigo());
        lote.setQuantidade(dto.quantidade());
        lote.setDataFabricacao(dto.dataFabricacao());

        return lote;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        loteRepository.deleteById(id);
    }
}
