package ec.edu.espe.arquitectura.examen_parical_i_narvaez.seguridad.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "seg_usuario" )


public class Usuario implements Serializable {
    private static final long serialVersionUID = 1543L;
    @Id
    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;
    @Column(name = "username", nullable = false, length = 32)
    private String username;
    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;
    @Column(name = "estado", nullable = false,length = 3)
    private String estado;
    @Column(name = "clave", nullable = false,length = 64)
    private String clave;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Usuario> usuarioEspacios;

    public Usuario() {
    }

    public Usuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public List<Usuario> getUsuarioEspacios() {
        return usuarioEspacios;
    }

    public void setUsuarioEspacios(List<Usuario> usuarioEspacios) {
        this.usuarioEspacios = usuarioEspacios;
    }
}
