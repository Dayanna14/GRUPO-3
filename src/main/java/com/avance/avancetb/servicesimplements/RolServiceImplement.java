package com.avance.avancetb.servicesimplements;


import com.avance.avancetb.entities.Rol;
import com.avance.avancetb.repositories.IRolRepository;
import com.avance.avancetb.servicesinterfaces.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository rR;

    @Override
    public List<Rol> list() {
            return rR.findAll();
    }
}
