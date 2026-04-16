package com.avance.avancetb.controllers;

import com.avance.avancetb.dtos.RolDTO;
import com.avance.avancetb.servicesinterfaces.IRolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private IRolService RR;

    @GetMapping
    public ResponseEntity<List<RolDTO>> listar() {
        ModelMapper m = new ModelMapper();
        List<RolDTO> listaRoles = RR.list()
                .stream().map(x -> m.map(x, RolDTO.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(listaRoles);
    }
}

