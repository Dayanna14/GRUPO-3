package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.PerfilProfesional;
import com.avance.avancetb.entities.ValoracionCurso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IValoracionCursoRepository extends JpaRepository<ValoracionCurso,Integer> {
}
