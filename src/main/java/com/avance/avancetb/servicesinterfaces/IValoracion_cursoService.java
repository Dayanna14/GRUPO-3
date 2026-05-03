package com.avance.avancetb.servicesinterfaces;


import com.avance.avancetb.entities.Valoracion_curso;

import java.util.List;
import java.util.Optional;

public interface IValoracion_cursoService {

    public List<Valoracion_curso> list();
    public Valoracion_curso insert (Valoracion_curso valo);
    public void uptade (Valoracion_curso v);
    public void delete(int id);
    public Optional<Valoracion_curso> listID(int id);
}
