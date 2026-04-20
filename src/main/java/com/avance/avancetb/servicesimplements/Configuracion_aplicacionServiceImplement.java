package com.avance.avancetb.servicesimplements;

import com.avance.avancetb.entities.Configuracion_aplicacion;
import com.avance.avancetb.repositories.IConfiguracion_aplicacionRepository;
import com.avance.avancetb.servicesinterfaces.IConfiguracion_aplicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Configuracion_aplicacionServiceImplement  implements IConfiguracion_aplicacionService {
    @Autowired
    private IConfiguracion_aplicacionRepository repository;

    @Override
    public List<Configuracion_aplicacion> list() {
        return repository.findAll();
    }
}
