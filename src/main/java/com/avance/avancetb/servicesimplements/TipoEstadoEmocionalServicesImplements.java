package com.avance.avancetb.servicesimplements;

import com.avance.avancetb.entities.Rol;
import com.avance.avancetb.entities.TipoEstadoEmocionalEntities;
import com.avance.avancetb.repositories.IRolRepository;
import com.avance.avancetb.repositories.TipoEstadoEmocionalRepositories;
import com.avance.avancetb.servicesinterfaces.IPerfilProfesionalService;
import com.avance.avancetb.servicesinterfaces.TipoEstadoEmocionalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoEstadoEmocionalServicesImplements implements TipoEstadoEmocionalServices {
    @Autowired
    private TipoEstadoEmocionalRepositories tR;
    @Override
    public List<TipoEstadoEmocionalEntities> list()
    {
        return tR.findAll();
    }
}
