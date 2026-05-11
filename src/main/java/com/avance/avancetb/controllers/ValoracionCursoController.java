package com.avance.avancetb.controllers;

import com.avance.avancetb.dtos.ValoracionCursoDTO;
import com.avance.avancetb.entities.UsuarioCurso;
import com.avance.avancetb.entities.ValoracionCurso;
import com.avance.avancetb.servicesinterfaces.IValoracionCursoService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/valoracionCurso")
public class ValoracionCursoController {
    @Autowired
    private IValoracionCursoService valS;

    @GetMapping
    public ResponseEntity<List<ValoracionCursoDTO>> listar() {
        List<ValoracionCursoDTO> lista = valS.list()
                .stream()
                .map(vc -> {
                    ValoracionCursoDTO dto = new ValoracionCursoDTO();
                    dto.setIdValoracion(vc.getIdValoracion());
                    if (vc.getUsuarioCurso() != null) {
                        dto.setIdUsuarioCurso(vc.getUsuarioCurso().getIdUsuarioCurso());
                    }
                    dto.setFechaValoracion(vc.getFechaValoracion());
                    dto.setCalificacion(vc.getCalificacion());
                    dto.setComentario(vc.getComentario());
                    return dto;
                })
                .collect(Collectors.toList());
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        Optional<ValoracionCurso> valoracion = valS.listId(id);
        if (valoracion.isPresent()) {
            ValoracionCurso vc = valoracion.get();
            ValoracionCursoDTO dto = new ValoracionCursoDTO();
            dto.setIdValoracion(vc.getIdValoracion());
            if (vc.getUsuarioCurso() != null) {
                dto.setIdUsuarioCurso(vc.getUsuarioCurso().getIdUsuarioCurso());
            }
            dto.setFechaValoracion(vc.getFechaValoracion());
            dto.setCalificacion(vc.getCalificacion());
            dto.setComentario(vc.getComentario());
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Valoración no encontrada");
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<ValoracionCursoDTO> registrar(@RequestBody ValoracionCursoDTO dto) {
        ModelMapper m = new ModelMapper();
        m.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        ValoracionCurso v = m.map(dto, ValoracionCurso.class);
        UsuarioCurso uc = new UsuarioCurso();
        uc.setIdUsuarioCurso(dto.getIdUsuarioCurso());
        v.setUsuarioCurso(uc);
        ValoracionCurso vR = valS.insert(v);
        ValoracionCursoDTO respondeDTO = m.map(vR, ValoracionCursoDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(respondeDTO);
    }

    @PutMapping("/actualiza")
    public ResponseEntity<?> actualizar(@RequestBody ValoracionCursoDTO dto) {
        Optional<ValoracionCurso> existente = valS.listId(dto.getIdValoracion());
        if (existente.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se puede actualizar: La valoración con ID " + dto.getIdValoracion() + " no existe.");
        }
        try {
            ModelMapper m = new ModelMapper();
            m.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
            ValoracionCurso v = m.map(dto, ValoracionCurso.class);
            UsuarioCurso uc = new UsuarioCurso();
            uc.setIdUsuarioCurso(dto.getIdUsuarioCurso());
            v.setUsuarioCurso(uc);
            valS.update(v);
            return ResponseEntity.ok("Valoración actualizada correctamente");
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error de integridad: El UsuarioCurso con ID " + dto.getIdUsuarioCurso() + " no existe.");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id) {
        Optional<ValoracionCurso> valoracion = valS.listId(id);
        if (valoracion.isPresent()) {
            valS.delete(id);
            return ResponseEntity.ok("Valoración eliminada correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Valoración no encontrada");
        }
    }

    @GetMapping("/valoraciones/min/{minCalificacion}")
    public List<Object[]> listarValoracionesPorCalificacionMinima(@PathVariable int minCalificacion) {
        return valS.listarValoracionesPorCalificacionMinima(minCalificacion);
    }
}