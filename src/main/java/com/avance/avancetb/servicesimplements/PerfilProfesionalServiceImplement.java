package com.avance.avancetb.servicesimplements;

import com.avance.avancetb.entities.PerfilProfesional;
import com.avance.avancetb.repositories.IPerfilProfesionalRepository;
import com.avance.avancetb.servicesinterfaces.IPerfilProfesionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilProfesionalServiceImplement implements IPerfilProfesionalService {
    @Autowired
    private IPerfilProfesionalRepository pR;

    @Override
    public List<PerfilProfesional> list() {
        return pR.findAll();
    }

    @Override
    public PerfilProfesional insert(PerfilProfesional pP) {
        return pR.save(pP);
    }

    @Override
    public void update(PerfilProfesional p) {
        pR.save(p);
    }

    @Override
    public Optional<PerfilProfesional> listId(int id) {
        return pR.findById(id);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }
}
