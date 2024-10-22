package projeto.tp1.canetaria.model.converterjpa;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import projeto.tp1.canetaria.model.Cor;

@Converter(autoApply = true)
public class CorConverter implements AttributeConverter<Cor, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Cor cor) {
        return cor == null ? null : cor.getId();
    }

    @Override
    public Cor convertToEntityAttribute(Integer idCor) {
        return Cor.valueOf(idCor);
    }
}
