package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.PerfilProfesional;
import com.avance.avancetb.entities.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISesionRepository extends JpaRepository<Sesion,Integer> {
}
