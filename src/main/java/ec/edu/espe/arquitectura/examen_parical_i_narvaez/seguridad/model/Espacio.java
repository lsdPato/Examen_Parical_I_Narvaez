package ec.edu.espe.arquitectura.examen_parical_i_narvaez.seguridad.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "gdc_espacio")
public class Espacio implements Serializable {
    private static final long serialVersionUID = 1324324L;
    @Id
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;
    @Column(name = "nombre", nullable = false, length = 126)
    private String nombre;
    @Column(name = "fecha_creacion", nullable = false)
    private String fechaCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "espacio")
    private List<Espacio> usuarioEspacios;

    public Espacio() {
    }

    public Espacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Espacio> getUsuarioEspacios() {
        return usuarioEspacios;
    }

    public void setUsuarioEspacios(List<Espacio> usuarioEspacios) {
        this.usuarioEspacios = usuarioEspacios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Espacio)) return false;
        Espacio espacio = (Espacio) o;
        return Objects.equals(codEspacio, espacio.codEspacio) && Objects.equals(nombre, espacio.nombre) && Objects.equals(fechaCreacion, espacio.fechaCreacion) && Objects.equals(usuarioEspacios, espacio.usuarioEspacios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEspacio, nombre, fechaCreacion, usuarioEspacios);
    }
}
