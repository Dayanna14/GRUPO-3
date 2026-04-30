package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormularioRepository extends JpaRepository<Formulario, Integer> {



}
