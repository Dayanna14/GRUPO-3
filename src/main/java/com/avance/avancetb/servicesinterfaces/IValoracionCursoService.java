package com.avance.avancetb.servicesinterfaces;

import com.avance.avancetb.entities.ValoracionCurso;

import java.util.List;
import java.util.Optional;

public interface IValoracionCursoService {
    public List<ValoracionCurso> list();
    public ValoracionCurso insert(ValoracionCurso vV);
    public void update(ValoracionCurso v);
    public Optional<ValoracionCurso> listId(int id);
    public void delete(int id);
}
