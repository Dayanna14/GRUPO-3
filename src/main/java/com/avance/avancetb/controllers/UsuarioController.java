package com.avance.avancetb.controllers;


import com.avance.avancetb.dtos.UsuarioDTO;
import com.avance.avancetb.servicesinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;

    public List<UsuarioDTO> listar(){
        return usuarioService.list().stream().map(x ->{
            ModelMapper mapper = new ModelMapper();
            return mapper.map(x, UsuarioDTO.class);

        }).collect(Collectors.toList());

    }


}
