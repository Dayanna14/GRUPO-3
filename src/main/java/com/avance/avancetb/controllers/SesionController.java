package com.avance.avancetb.controllers;

import com.avance.avancetb.dtos.SesionDTO;
import com.avance.avancetb.entities.Sesion;
import com.avance.avancetb.servicesinterfaces.ISesionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/sesion")
public class SesionController {

    @Autowired
    private ISesionService sS;

    @GetMapping
    public ResponseEntity<List<SesionDTO>> listar() {
        ModelMapper m = new ModelMapper();
        List<SesionDTO> lista = sS.list()
                .stream().map(x -> m.map(x, SesionDTO.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(lista);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<SesionDTO> registrar(@RequestBody SesionDTO dto) {
        ModelMapper m = new ModelMapper();
        Sesion s = m.map(dto, Sesion.class);
        Sesion se = sS.insert(s);
        SesionDTO responseDTO = m.map(se, SesionDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        ModelMapper m = new ModelMapper();
        Optional<Sesion> sesion = sS.listId(id);

        if (sesion.isPresent()) {
            SesionDTO dto = m.map(sesion.get(), SesionDTO.class);
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Sesion no encontrada");
        }
    }

    @PutMapping("/actualiza")
    public ResponseEntity<String> actualizar(@RequestBody SesionDTO dto) {
        Optional<Sesion> existente = sS.listId(dto.getIdSesion());

        if (existente.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Sesion no encontrada");
        }

        ModelMapper m = new ModelMapper();
        Sesion s = m.map(dto, Sesion.class);
        sS.update(s);

        return ResponseEntity.ok("Sesion actualizada correctamente");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id) {
        Optional<Sesion> sesion = sS.listId(id);

        if (sesion.isPresent()) {
            sS.delete(id);
            return ResponseEntity.ok("Sesion eliminada correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Sesion no encontrada");
        }
    }
}