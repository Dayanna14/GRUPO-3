package com.avance.avancetb.servicesimplements;

import com.avance.avancetb.entities.PerfilProfesional;
import com.avance.avancetb.repositories.IPerfilProfesionalRepository;
import com.avance.avancetb.servicesinterfaces.IPerfilProfesionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilProfesionalServiceImplement implements IPerfilProfesionalService {
    @Autowired
    private IPerfilProfesionalRepository pR;

    @Override
    public List<PerfilProfesional> list() {
        return pR.findAll();
    }
}
