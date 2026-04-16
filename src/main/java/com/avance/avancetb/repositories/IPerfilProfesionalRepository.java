package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.PerfilProfesional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPerfilProfesionalRepository extends JpaRepository<PerfilProfesional,Integer> {
}
