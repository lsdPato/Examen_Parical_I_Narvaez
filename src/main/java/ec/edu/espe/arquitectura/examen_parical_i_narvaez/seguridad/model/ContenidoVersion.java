package ec.edu.espe.arquitectura.examen_parical_i_narvaez.seguridad.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "gdc_contenido_version")
public class ContenidoVersion {
    @Id
    @Column(name = "cod_contenido_version", nullable = false)
    private Integer codContenidoVersion;

    @Column(name = "cod_contenido", nullable = false, insertable = false, updatable = false)
    private Integer codContenido;
    @Column(name = "hash_archivo", nullable = false)
    private String hashArchivo;
    @Column(name = "nombre_archivo", nullable = false)
    private String nombreArchivo;
    @Column(name = "tamanio", nullable = false)
    private Integer tamanio;
    @Column(name = "version", nullable = false)
    private Integer version;
    @Column(name = "Comentario")
    private Integer comentario;
    @Column(name = "fecha_creacion", nullable = false)
    private Date fecha;
    @Column(name = "cod_usuario_creacion", nullable = false)
    private Integer codUsuarioCreacion;

}
