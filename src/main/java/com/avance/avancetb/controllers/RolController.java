package com.avance.avancetb.controllers;

import com.avance.avancetb.dtos.RolDTO;
import com.avance.avancetb.entities.Rol;
import com.avance.avancetb.servicesinterfaces.IRolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
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
    @PostMapping("/nuevo")
    public ResponseEntity<RolDTO> registrar(@RequestBody RolDTO dto){
       ModelMapper m = new ModelMapper();
       Rol r = m.map(dto, Rol.class);
       Rol rl =RR.insert(r);
       RolDTO responseDTO = m.map(rl,RolDTO.class);
       return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        ModelMapper m = new ModelMapper();
        Optional<Rol> rol = RR.listId(id);

        if (rol.isPresent()) {
            RolDTO dto = m.map(rol.get(), RolDTO.class);
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Rol no encontrado");
        }
    }

    @PutMapping("/actualiza")
    public ResponseEntity<String> actualizar(@RequestBody RolDTO dto) {

        Optional<Rol> existente = RR.listId(dto.getIdRol());
        if (existente.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Sala no encontrada");
        }


        Rol ro = existente.get();

        ro.setNameRol(dto.getNameRol());
        ro.setDescriptionRol(dto.getDescriptionRol());
        RR.update(ro);

        return ResponseEntity.ok("Rol actualizado correctamente");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id) {
        Optional<Rol> sala = RR.listId(id);

        if (sala.isPresent()) {
            RR.delete(id);
            return ResponseEntity.ok("Rol eliminadao correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Rol no encontrado");
        }
    }
}

