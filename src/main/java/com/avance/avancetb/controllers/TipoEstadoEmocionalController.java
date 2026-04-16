package com.avance.avancetb.controllers;

import com.avance.avancetb.dtos.TipoEstadoEmocionalDTO;
import com.avance.avancetb.servicesinterfaces.TipoEstadoEmocionalServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipos_emocionales")
public class TipoEstadoEmocionalController {
    @Autowired
    private TipoEstadoEmocionalServices tS;
    @GetMapping
    public ResponseEntity<List<TipoEstadoEmocionalDTO>>listar() {
        ModelMapper m = new ModelMapper();
        List<TipoEstadoEmocionalDTO> listaDto=tS.list()
            .stream().map(x->m.map(x,TipoEstadoEmocionalDTO.class))
                    .collect(Collectors.toList());
            return ResponseEntity.ok(listaDto);
    }
}
