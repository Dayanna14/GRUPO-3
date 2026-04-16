package com.avance.avancetb.servicesimplements;

import com.avance.avancetb.dtos.CursoDTO;
import com.avance.avancetb.entities.Curso;
import com.avance.avancetb.repositories.ICursoRepository;
import com.avance.avancetb.serviceinterfaces.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImplement implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepository;

    private CursoDTO convertirADTO(Curso curso) {
        CursoDTO dto = new CursoDTO();
        dto.setIdCursos(curso.getIdCursos());
        dto.setTipoCurso(curso.getTipoCurso());
        dto.setDescripcion(curso.getDescripcion());
        dto.setNombreCurso(curso.getNombreCurso());
        dto.setObjetivos(curso.getObjetivos());
        return dto;
    }

    private Curso convertirAEntity(CursoDTO dto) {
        Curso curso = new Curso();
        curso.setIdCursos(dto.getIdCursos());
        curso.setTipoCurso(dto.getTipoCurso());
        curso.setDescripcion(dto.getDescripcion());
        curso.setNombreCurso(dto.getNombreCurso());
        curso.setObjetivos(dto.getObjetivos());
        return curso;
    }

    @Override
    public List<CursoDTO> listar() {
        List<Curso> lista = cursoRepository.findAll();
        List<CursoDTO> dtoLista = new ArrayList<>();

        for (Curso curso : lista) {
            dtoLista.add(convertirADTO(curso));
        }

        return dtoLista;
    }

    @Override
    public CursoDTO buscarPorId(Integer id) {
        Optional<Curso> curso = cursoRepository.findById(id);
        return curso.map(this::convertirADTO).orElse(null);
    }

    @Override
    public CursoDTO guardar(CursoDTO cursoDTO) {
        Curso curso = convertirAEntity(cursoDTO);
        Curso guardado = cursoRepository.save(curso);
        return convertirADTO(guardado);
    }

    @Override
    public CursoDTO actualizar(Integer id, CursoDTO cursoDTO) {
        Optional<Curso> cursoBuscado = cursoRepository.findById(id);

        if (cursoBuscado.isPresent()) {
            Curso curso = cursoBuscado.get();
            curso.setTipoCurso(cursoDTO.getTipoCurso());
            curso.setDescripcion(cursoDTO.getDescripcion());
            curso.setNombreCurso(cursoDTO.getNombreCurso());
            curso.setObjetivos(cursoDTO.getObjetivos());

            Curso actualizado = cursoRepository.save(curso);
            return convertirADTO(actualizado);
        }

        return null;
    }

    @Override
    public void eliminar(Integer id) {
        cursoRepository.deleteById(id);
    }
}