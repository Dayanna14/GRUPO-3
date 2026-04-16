package com.avance.avancetb.controllers;

import com.avance.avancetb.dtos.CursoDTO;
import com.avance.avancetb.entities.Curso;
import com.avance.avancetb.servicesinterfaces.ICursoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private ICursoService cSer;

    @GetMapping
    public ResponseEntity<List<CursoDTO>> listar() {
        ModelMapper m = new ModelMapper();
        List<CursoDTO> listaCursos = cSer.list()
                .stream().map(x -> m.map(x, CursoDTO.class))
                .collect(Collectors.toList());

        return ResponseEntity.ok(listaCursos);
    }
}