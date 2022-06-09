package ec.edu.espe.arquitectura.examen_parical_i_narvaez.seguridad.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "gdc_contenido")
public class Contenido implements Serializable {
    private static final long serialVersionUID = 62945L;

    @Id
    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;

    @Column(name = "cod_espacio", nullable = false, insertable = false, updatable = false)
    private Integer codMateria;
    @Column(name = "cod_contenido_padre", nullable = false, insertable = false, updatable = false)
    private Integer codContenidoPadre;
    @Column(name = "tipo_contenido", nullable = false, insertable = false, updatable = false)
    private Integer tipoContenido;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "nombre_archivo", nullable = false)
    private String nombreArchivo;
    @Column(name = "version", nullable = false)
    private String version;
    @Column(name = "estado", nullable = false)
    private Integer estado;
    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio")
    @ManyToOne
    private Espacio espacio;

    public Contenido() {
    }

    public Contenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Integer getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(Integer codMateria) {
        this.codMateria = codMateria;
    }

    public Integer getCodContenidoPadre() {
        return codContenidoPadre;
    }

    public void setCodContenidoPadre(Integer codContenidoPadre) {
        this.codContenidoPadre = codContenidoPadre;
    }

    public Integer getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(Integer tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
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
        if (!(o instanceof Contenido)) return false;
        Contenido contenido = (Contenido) o;
        return Objects.equals(codContenido, contenido.codContenido) && Objects.equals(codMateria, contenido.codMateria) && Objects.equals(codContenidoPadre, contenido.codContenidoPadre) && Objects.equals(tipoContenido, contenido.tipoContenido) && Objects.equals(nombre, contenido.nombre) && Objects.equals(nombreArchivo, contenido.nombreArchivo) && Objects.equals(version, contenido.version) && Objects.equals(estado, contenido.estado) && Objects.equals(espacio, contenido.espacio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codContenido, codMateria, codContenidoPadre, tipoContenido, nombre, nombreArchivo, version, estado, espacio);
    }
}
