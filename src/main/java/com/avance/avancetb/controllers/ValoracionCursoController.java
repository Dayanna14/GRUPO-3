package com.avance.avancetb.controllers;


import com.avance.avancetb.dtos.ValoracionCursoDTO;
import com.avance.avancetb.entities.ValoracionCurso;
import com.avance.avancetb.servicesinterfaces.IValoracionCursoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ValorarCurso")
public class ValoracionCursoController {
    @Autowired
    private IValoracionCursoService vS;

    @GetMapping
    public ResponseEntity<List<ValoracionCursoDTO>> listar() {
        ModelMapper m = new ModelMapper();
        List<ValoracionCursoDTO> lista = vS.list()
                .stream().map(x -> m.map(x, ValoracionCursoDTO.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(lista);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<ValoracionCursoDTO> registrar(@RequestBody ValoracionCursoDTO dto) {
        ModelMapper m = new ModelMapper();
        ValoracionCurso v = m.map(dto, ValoracionCurso.class);
        ValoracionCurso va = vS.insert(v);
        ValoracionCursoDTO responseDTO = m.map(va, ValoracionCursoDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        ModelMapper m = new ModelMapper();
        Optional<ValoracionCurso> valoracion = vS.listId(id);

        if (valoracion.isPresent()) {
            ValoracionCursoDTO dto = m.map(valoracion.get(), ValoracionCursoDTO.class);
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("ValoracionCurso no encontrada");
        }
    }

    @PutMapping("/actualiza")
    public ResponseEntity<String> actualizar(@RequestBody ValoracionCursoDTO dto) {
        Optional<ValoracionCurso> existente = vS.listId(dto.getIdValoracionCurso());

        if (existente.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("ValoracionCurso no encontrada");
        }

        ModelMapper m = new ModelMapper();
        ValoracionCurso v = m.map(dto, ValoracionCurso.class);
        vS.update(v);

        return ResponseEntity.ok("ValoracionCurso actualizada correctamente");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id) {
        Optional<ValoracionCurso> valoracion = vS.listId(id);

        if (valoracion.isPresent()) {
            vS.delete(id);
            return ResponseEntity.ok("ValoracionCurso eliminada correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("ValoracionCurso no encontrada");
        }
    }
}
