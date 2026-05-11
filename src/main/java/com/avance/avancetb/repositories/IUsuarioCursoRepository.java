package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.UsuarioCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioCursoRepository extends JpaRepository<UsuarioCurso, Integer> {

    // listar cursos por usuario
    @Query(value = "SELECT uc.id_usuario_curso, c.name_curso, uc.fecha_asignacion " +
            "FROM usuario_curso uc " +
            "INNER JOIN cursos c ON uc.id_curso = c.id_cursos " +
            "WHERE uc.id_usuario = :idUsuario " +
            "ORDER BY uc.fecha_asignacion DESC", nativeQuery = true)
    List<Object[]> listarCursosPorUsuario(@Param("idUsuario") Integer idUsuario);


}

