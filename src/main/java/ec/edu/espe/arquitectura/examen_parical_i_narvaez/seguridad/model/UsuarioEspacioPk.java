package ec.edu.espe.arquitectura.examen_parical_i_narvaez.seguridad.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class UsuarioEspacioPk implements Serializable {
    @Column(name = "cod_espacio", nullable = false)
    private String codUsuario;
    @Column(name = "cod_usuario", nullable = false)
    private String codPerfil;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioEspacioPk)) return false;
        UsuarioEspacioPk that = (UsuarioEspacioPk) o;
        return codUsuario.equals(that.codUsuario) && codPerfil.equals(that.codPerfil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codUsuario, codPerfil);
    }
}
