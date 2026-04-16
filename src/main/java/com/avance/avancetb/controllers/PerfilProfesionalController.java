package com.avance.avancetb.controllers;

import com.avance.avancetb.dtos.PerfilProfesionalDTO;
import com.avance.avancetb.entities.PerfilProfesional;
import com.avance.avancetb.servicesinterfaces.IPerfilProfesionalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/perfilProfesional")
public class PerfilProfesionalController {
    @Autowired
    private IPerfilProfesionalService pSer;

    @GetMapping
    public ResponseEntity<List<PerfilProfesionalDTO>> listar(){
        ModelMapper m=new ModelMapper();
        List<PerfilProfesionalDTO> listaPerfilesProfesionales=pSer.list()
                .stream().map(x->m.map(x,PerfilProfesionalDTO.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(listaPerfilesProfesionales);
    }
}
