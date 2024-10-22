package projeto.tp1.canetaria.model.converterjpa;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import projeto.tp1.canetaria.model.TipoUsuario;

@Converter(autoApply = true)
public class TipoUsuarioConverter implements AttributeConverter<TipoUsuario, Integer> {
    @Override
    public Integer convertToDatabaseColumn(TipoUsuario tipoUsuario) {
        return tipoUsuario == null ? null : tipoUsuario.getId();
    }

    @Override
    public TipoUsuario convertToEntityAttribute(Integer idTipoUsuario) {
        return TipoUsuario.valueOf(idTipoUsuario);
    }
}
