package com.avance.avancetb.servicesimplements;

import com.avance.avancetb.entities.Valoracion_curso;
import com.avance.avancetb.repositories.IValoracion_cursoRepository;
import com.avance.avancetb.servicesinterfaces.IValoracion_cursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Valoracion_cursoImplement implements IValoracion_cursoService {

    @Autowired
    private IValoracion_cursoRepository repository;

    @Override
    public List<Valoracion_curso> list() {
        return repository.findAll();
    }

    @Override
    public Valoracion_curso insert(Valoracion_curso valo) {
        return repository.save(valo);
    }

    @Override
    public void uptade(Valoracion_curso v) {
        repository.save(v);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Valoracion_curso> listID(int id) {
        return repository.findById(id);
    }
}
