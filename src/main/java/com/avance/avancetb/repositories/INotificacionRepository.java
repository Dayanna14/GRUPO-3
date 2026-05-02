package com.avance.avancetb.repositories;

import com.avance.avancetb.entities.Notificacion;
import com.avance.avancetb.entities.PerfilProfesional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INotificacionRepository extends JpaRepository<Notificacion,Integer> {
}
