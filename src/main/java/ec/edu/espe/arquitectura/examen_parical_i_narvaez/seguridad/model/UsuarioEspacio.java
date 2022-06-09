package ec.edu.espe.arquitectura.examen_parical_i_narvaez.seguridad.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

public class UsuarioEspacio implements Serializable {
    private static final long serialVersionUID = 165465L;
    @EmbeddedId
    private UsuarioEspacio pk;
    @Column(name = "estado", nullable = false)
    private String estado;
    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;
    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Espacio espacio;

    public UsuarioEspacio() {
    }

    public UsuarioEspacio(UsuarioEspacio pk) {
        this.pk = pk;
    }

    public UsuarioEspacio getPk() {
        return pk;
    }

    public void setPk(UsuarioEspacio pk) {
        this.pk = pk;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioEspacio)) return false;
        UsuarioEspacio that = (UsuarioEspacio) o;
        return Objects.equals(pk, that.pk) && Objects.equals(estado, that.estado) && Objects.equals(usuario, that.usuario) && Objects.equals(espacio, that.espacio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk, estado, usuario, espacio);
    }
}
