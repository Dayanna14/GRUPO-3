package com.avance.avancetb.servicesimplements;

import com.avance.avancetb.entities.Sesion;
import com.avance.avancetb.repositories.ISesionRepository;
import com.avance.avancetb.servicesinterfaces.ISesionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SesionServiceImplement implements ISesionService {
    @Autowired
    private ISesionRepository sR;

    @Override
    public List<Sesion> list() {
        return sR.findAll();
    }

    @Override
    public Sesion insert(Sesion s) {
        return sR.save(s);
    }

    @Override
    public void update(Sesion s) {
        sR.save(s);
    }

    @Override
    public Optional<Sesion> listId(int id) {
        return sR.findById(id);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}