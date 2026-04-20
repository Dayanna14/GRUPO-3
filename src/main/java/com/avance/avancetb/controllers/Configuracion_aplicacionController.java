package com.avance.avancetb.controllers;

import com.avance.avancetb.dtos.Configuracion_aplicacionDTO;
import com.avance.avancetb.servicesinterfaces.IConfiguracion_aplicacionService;
import com.avance.avancetb.servicesinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ConfAplicacion")

public class Configuracion_aplicacionController {

@Autowired
private IConfiguracion_aplicacionService ConfService;

@Autowired
    private IUsuarioService UsuService;

@GetMapping
    public List<Configuracion_aplicacionDTO> listar(){
        return ConfService.list().stream().map(x->{
    ModelMapper mapper = new ModelMapper();
    return mapper.map(x, Configuracion_aplicacionDTO.class);
    }).collect(Collectors.toList());
}

}
