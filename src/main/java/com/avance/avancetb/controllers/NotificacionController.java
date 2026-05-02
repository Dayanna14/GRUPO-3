package com.avance.avancetb.controllers;

import com.avance.avancetb.dtos.NotificacionDTO;
import com.avance.avancetb.entities.Notificacion;
import com.avance.avancetb.servicesinterfaces.INotificacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/Notificacion")
public class NotificacionController {
    @Autowired
    private INotificacionService nS;

    @GetMapping
    public ResponseEntity<List<NotificacionDTO>> listar() {
        ModelMapper m = new ModelMapper();
        List<NotificacionDTO> lista = nS.list()
                .stream().map(x -> m.map(x, NotificacionDTO.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(lista);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<NotificacionDTO> registrar(@RequestBody NotificacionDTO dto) {
        ModelMapper m = new ModelMapper();
        Notificacion n = m.map(dto, Notificacion.class);
        Notificacion no = nS.insert(n);
        NotificacionDTO responseDTO = m.map(no, NotificacionDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        ModelMapper m = new ModelMapper();
        Optional<Notificacion> notificacion = nS.listId(id);

        if (notificacion.isPresent()) {
            NotificacionDTO dto = m.map(notificacion.get(), NotificacionDTO.class);
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("NotificacionController no encontrada");
        }
    }

    @PutMapping("/actualiza")
    public ResponseEntity<String> actualizar(@RequestBody NotificacionDTO dto) {

        Optional<Notificacion> existente = nS.listId(dto.getIdNotificacion());
        if (existente.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Notificacion no encontrada");
        }

        ModelMapper m = new ModelMapper();
        Notificacion n = m.map(dto, Notificacion.class);
        nS.update(n);

        return ResponseEntity.ok("Notificacion actualizada correctamente");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id) {
        Optional<Notificacion> notificacion = nS.listId(id);

        if (notificacion.isPresent()) {
            nS.delete(id);
            return ResponseEntity.ok("Notificacion eliminada correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Notificacion no encontrada");
        }
    }
}
