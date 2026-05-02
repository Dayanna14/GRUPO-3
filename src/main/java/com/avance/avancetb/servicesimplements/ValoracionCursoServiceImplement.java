package com.avance.avancetb.servicesimplements;

import com.avance.avancetb.entities.ValoracionCurso;
import com.avance.avancetb.repositories.IValoracionCursoRepository;
import com.avance.avancetb.servicesinterfaces.IValoracionCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ValoracionCursoServiceImplement implements IValoracionCursoService {
    @Autowired
    private IValoracionCursoRepository vR;

    @Override
    public List<ValoracionCurso> list() {
        return vR.findAll();
    }

    @Override
    public ValoracionCurso insert(ValoracionCurso v) {
        return vR.save(v);
    }

    @Override
    public void update(ValoracionCurso v) {
        vR.save(v);
    }

    @Override
    public Optional<ValoracionCurso> listId(int id) {
        return vR.findById(id);
    }

    @Override
    public void delete(int id) {
        vR.deleteById(id);
    }
}
