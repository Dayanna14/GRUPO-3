package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.PerfilProfesional;
import com.avance.avancetb.entities.TipoEstadoEmocionalEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEstadoEmocionalRepositories extends JpaRepository<TipoEstadoEmocionalEntities,Integer> {
}
