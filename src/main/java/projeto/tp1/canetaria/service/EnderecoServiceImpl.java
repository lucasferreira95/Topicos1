package projeto.tp1.canetaria.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import projeto.tp1.canetaria.dto.EnderecoRequestDTO;
import projeto.tp1.canetaria.model.Endereco;
import projeto.tp1.canetaria.repository.EnderecoRepository;

@ApplicationScoped
public class EnderecoServiceImpl implements EnderecoService {

    @Inject
    public EnderecoRepository enderecoRepository;

    @Override
    public Endereco findById(Long id) {
        return enderecoRepository.findById(id);
    }

    @Override
    public List<Endereco> findByCep(String cep) {
        return enderecoRepository.findByCep(cep);
    }

    @Override
    public List<Endereco> findAll() {
        return enderecoRepository.findAll().list();
    }

    @Override
    @Transactional
    public Endereco create(EnderecoRequestDTO dto){
        Endereco endereco = new Endereco();
        endereco.setLogradouro(dto.logradouro());
        endereco.setCidade(dto.cidade());
        endereco.setEstado(dto.estado());
        endereco.setCep(dto.cep());

        enderecoRepository.persist(endereco);
        return endereco;
    }

    @Override
    @Transactional
    public Endereco update(Long id, EnderecoRequestDTO dto) {
        Endereco endereco = enderecoRepository.findById(id);

        endereco.setLogradouro(dto.logradouro());
        endereco.setCidade(dto.cidade());
        endereco.setEstado(dto.estado());
        endereco.setCep(dto.cep());

        return endereco;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        enderecoRepository.deleteById(id);
    }
}
