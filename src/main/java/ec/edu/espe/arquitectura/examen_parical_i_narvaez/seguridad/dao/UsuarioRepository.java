package ec.edu.espe.arquitectura.examen_parical_i_narvaez.seguridad.dao;

import ec.edu.espe.arquitectura.examen_parical_i_narvaez.seguridad.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    List<Usuario> findByNombreOrderByNombre(String nombre);
}
