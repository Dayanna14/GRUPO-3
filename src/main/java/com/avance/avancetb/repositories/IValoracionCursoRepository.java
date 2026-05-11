package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.ValoracionCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IValoracionCursoRepository extends JpaRepository<ValoracionCurso, Integer> {

    // listar valoracion por calificacion minima, busca las valoraciones que tengan una puntuacion igual o mayor a la q definas
    @Query(value = "SELECT vc.calificacion, vc.comentario, u.username " +
            "FROM valoracion_curso vc " +
            "INNER JOIN usuario_curso uc ON vc.id_usuario_curso = uc.id_usuario_curso " +
            "INNER JOIN usuario u ON uc.id_usuario = u.id_usuario " +
            "WHERE vc.calificacion >= :minCalificacion " +
            "ORDER BY vc.calificacion DESC", nativeQuery = true)
    List<Object[]> listarValoracionesPorCalificacionMinima(@Param("minCalificacion") int minCalificacion);

}

