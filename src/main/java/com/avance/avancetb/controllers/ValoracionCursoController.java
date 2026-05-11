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
<<<<<<< HEAD
        List<ValoracionCursoDTO> lista = service.list()
                .stream()
                .map(vc -> {
                    ValoracionCursoDTO dto = new ValoracionCursoDTO();
                    dto.setIdValoracion(vc.getIdValoracion());
                    dto.setIdUsuarioCurso(vc.getUsuarioCurso().getIdUsuarioCurso());
                    dto.setFechaValoracion(vc.getFechaValoracion());
                    dto.setCalificacion(vc.getCalificacion());
                    dto.setComentario(vc.getComentario());
                    return dto;
                })
                .collect(Collectors.toList());
        return ResponseEntity.ok(lista);
=======
        ModelMapper m = new ModelMapper();
        m.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<ValoracionCursoDTO> listaValoraciones = valS.list()
                .stream().map(x -> {
                    ValoracionCursoDTO dto = m.map(x, ValoracionCursoDTO.class);
                    if (x.getUsuarioCurso() != null) {
                        dto.setIdUsuarioCurso(x.getUsuarioCurso().getIdUsuarioCurso());
                    }
                    return dto;
                }).collect(Collectors.toList());
        return ResponseEntity.ok(listaValoraciones);
>>>>>>> 908d0241367d909200ad9d5bde00070f455dfdd2
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
<<<<<<< HEAD
        ValoracionCurso vc = service.listId(id);
        if (vc != null) {
            ValoracionCursoDTO dto = new ValoracionCursoDTO();
            dto.setIdValoracion(vc.getIdValoracion());
            dto.setIdUsuarioCurso(vc.getUsuarioCurso().getIdUsuarioCurso());
            dto.setFechaValoracion(vc.getFechaValoracion());
            dto.setCalificacion(vc.getCalificacion());
            dto.setComentario(vc.getComentario());
=======
        ModelMapper m = new ModelMapper();
        m.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Optional<ValoracionCurso> valoracion = valS.listId(id);
        if (valoracion.isPresent()) {
            ValoracionCursoDTO dto = m.map(valoracion.get(), ValoracionCursoDTO.class);
            if (valoracion.get().getUsuarioCurso() != null) {
                dto.setIdUsuarioCurso(valoracion.get().getUsuarioCurso().getIdUsuarioCurso());
            }
>>>>>>> 908d0241367d909200ad9d5bde00070f455dfdd2
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
    public List<Object[]> listarValoracionesPorCalificacionMinima(@PathVariable Double minCalificacion) {
        return service.listarValoracionesPorCalificacionMinima(minCalificacion);
    }
}