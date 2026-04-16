package com.avance.avancetb.servicesinterfaces;

import com.avance.avancetb.dtos.CursoDTO;
import java.util.List;

public interface ICursoService {

    List<CursoDTO> listar();

    CursoDTO buscarPorId(Integer id);

    CursoDTO guardar(CursoDTO cursoDTO);

    CursoDTO actualizar(Integer id, CursoDTO cursoDTO);

    void eliminar(Integer id);
}