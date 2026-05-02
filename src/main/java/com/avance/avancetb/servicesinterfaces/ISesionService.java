package com.avance.avancetb.servicesinterfaces;

import com.avance.avancetb.entities.Sesion;

import java.util.List;
import java.util.Optional;

public interface ISesionService {
    public List<Sesion> list();
    public Sesion insert(Sesion sS);
    public void update(Sesion s);
    public Optional<Sesion> listId(int id);
    public void delete(int id);
}
