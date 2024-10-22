package projeto.tp1.canetaria.model.converterjpa;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import projeto.tp1.canetaria.model.Tinta;

@Converter(autoApply = true)
public class TintaConverter implements AttributeConverter<Tinta, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Tinta tinta) {
        return tinta == null ? null : tinta.getId();
    }

    @Override
    public Tinta convertToEntityAttribute(Integer idTinta) {
        return Tinta.valueOf(idTinta);
    }
}
