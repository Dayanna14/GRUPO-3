package com.avance.avancetb.servicesinterfaces;

import com.avance.avancetb.entities.Notificacion;

import java.util.List;
import java.util.Optional;

public interface INotificacionService {
    public List<Notificacion> list();
    public Notificacion insert(Notificacion n);
    public void update(Notificacion n);
    public Optional<Notificacion> listId(int id);
    public void delete(int id);
}
