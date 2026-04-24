package com.avance.avancetb.controllers;

import com.avance.avancetb.dtos.UsuarioDTO;
import com.avance.avancetb.entities.Usuario;
import com.avance.avancetb.servicesinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class UsuarioController {
    @Autowired
    private IUsuarioService uSer;

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> listar(){
        ModelMapper m=new ModelMapper();
        List<UsuarioDTO> listaUsuarios=uSer.list()
                .stream().map(x->m.map(x,UsuarioDTO.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(listaUsuarios);
    }
    @PostMapping("/nuevo")
    public ResponseEntity<UsuarioDTO> registrar(@RequestBody UsuarioDTO dto){
       ModelMapper m=new ModelMapper();
       Usuario u=m.map(dto,Usuario.class);
       Usuario us=uSer.insert(u);
       UsuarioDTO responseDTO=m.map(us,UsuarioDTO.class);
       return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable int id) {
        ModelMapper m = new ModelMapper();
        Optional<Usuario> usuarios = uSer.listId(id);

        if (usuarios.isPresent()) {
            UsuarioDTO dto = m.map(usuarios.get(), UsuarioDTO.class);
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Usuario no encontrado");
        }
    }

    @PutMapping("/actualiza")
    public ResponseEntity<String> actualizar(@RequestBody UsuarioDTO dto) {

        Optional<Usuario> existente = uSer.listId(dto.getIdUsuario());
        if (existente.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Usuario no encontrado");
        }


        Usuario us = existente.get();
        us.setNombreUsuario(dto.getNombreUsuario());
        us.setNombrePaterno(dto.getNombrePaterno());
        us.setNombreMaterno(dto.getNombreMaterno());
        us.setRegistroAsistido(dto.isRegistroAsistido());
        us.setAutorizacionFamiliar(dto.getAutorizacionFamiliar());
        us.setLecturaAutomatica(dto.isLecturaAutomatica());
        us.setFechaNacimiento(dto.getFechaNacimiento());
        us.setUsername(dto.getUsername());
        us.setContrasena(dto.getContrasena());
        us.setDni(dto.getDni());
        us.setEstadoCuenta(dto.getEstadoCuenta());
        us.setFechaPrimerAcceso(dto.getFechaPrimerAcceso());
        us.setTutorialCompletado(dto.isTutorialCompletado());
        uSer.update(us);

        return ResponseEntity.ok("Usuario actualizado correctamente");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id) {
        Optional<Usuario> usuarios = uSer.listId(id);

        if (usuarios.isPresent()) {
            uSer.delete(id);
            return ResponseEntity.ok("Usuario eliminado correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Usuario no encontrado");
        }
    }
}
