package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursosRepository extends JpaRepository<Cursos,Integer> {
}
