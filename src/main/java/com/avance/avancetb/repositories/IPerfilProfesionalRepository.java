package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.PerfilProfesional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPerfilProfesionalRepository extends JpaRepository<PerfilProfesional,Integer> {
    @Query(value = "SELECT * \n" +
            "FROM perfil_profesional p \n" +
            "WHERE LOWER(p.especialidad) LIKE \n" +
            "LOWER(CONCAT('%', :palabra, '%'))",nativeQuery = true)
    List<PerfilProfesional> buscarPorEspecialidad(@Param("palabra") String palabra);
}
