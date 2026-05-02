package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISesionRepository extends JpaRepository<Sesion, Integer> {
}
