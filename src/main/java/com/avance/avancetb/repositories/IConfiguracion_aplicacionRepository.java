package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.Configuracion_aplicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConfiguracion_aplicacionRepository extends JpaRepository<Configuracion_aplicacion, Integer> {
}
