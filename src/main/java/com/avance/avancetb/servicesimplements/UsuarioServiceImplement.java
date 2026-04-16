package com.avance.avancetb.servicesimplements;

import com.avance.avancetb.entities.Usuario;
import com.avance.avancetb.repositories.IUsuarioRepository;
import com.avance.avancetb.servicesinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
        private IUsuarioRepository repository;

    @Override
        public List<Usuario>list(){
        return repository.findAll();
    }
}
